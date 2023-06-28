package com.utah.service;

import cn.hutool.core.date.DateUtil;
import cn.hutool.core.lang.UUID;
import com.utah.dto.UserOrder4Create;
import com.utah.po.User;
import com.utah.po.UserOrder;
import com.utah.repository.UserOrderRepository;
import com.utah.repository.UserRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.math.BigDecimal;

@Service
@RequiredArgsConstructor
public class UserOrderServiceImpl {
    private UserOrderRepository userOrderRepository;
    private UserRepository userRepository;

    @Transactional
    public void submitOrder(UserOrder4Create userOrder4Create) {
        Long userId = userOrder4Create.getUserId();
        User user = userRepository.findByIdAndDeleted(userId, 0);
        if (user == null) {
            throw new RuntimeException("The user is not exist!");
        }
        UserOrder userOrder = new UserOrder();
        userOrder.setUserId(userId);
        userOrder.setOrderNumber(UUID.randomUUID().toString());
        BigDecimal orderAmount = userOrder4Create.getOrderAmount();
        userOrder.setOrderAmount(orderAmount);
        userOrder.setDeleted(0);
        userOrder.setPayStatus(0);
        userOrder.setTradeStatus(0);
        userOrder.setCreateTime(DateUtil.now());
        userOrder.setUpdateTime(DateUtil.now());
        userOrderRepository.save(userOrder);
        Integer memberTypeId = user.getMemberTypeId();
        BigDecimal userPoints = user.getPoints() == null ? new BigDecimal(0) : user.getPoints();
        switch (memberTypeId) {
            case 1:
                userPoints = userPoints.add(orderAmount);
                break;
            case 2:
                userPoints = userPoints.add(orderAmount.multiply(new BigDecimal(2)));
                break;
            case 3:
                userPoints = userPoints.add(orderAmount.multiply(new BigDecimal(3)));
                break;
            default:
                break;
        }
        user.setPoints(userPoints);
        userRepository.save(user);

    }

}
