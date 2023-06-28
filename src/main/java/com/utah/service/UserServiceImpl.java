package com.utah.service;

import cn.hutool.core.date.DateUtil;
import cn.hutool.extra.spring.SpringUtil;
import com.utah.dto.UserBean4Create;
import com.utah.po.User;
import com.utah.repository.UserRepository;
import java.math.BigDecimal;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl {

  @Autowired
  private UserRepository userRepository;


  @Transactional(rollbackFor = Exception.class)
  public void save(UserBean4Create userBean4Create) {
    // TODO: 2022/8/11
    SpringUtil.getBean(UserServiceImpl.class).todo(userBean4Create);
    add(userBean4Create);
//    final int i = 1 / 0;
  }

  @Transactional(rollbackFor = Exception.class)
  public void todo(UserBean4Create userBean4Create) {
    User user = new User();
    user.setName(userBean4Create.getName());
    user.setMemberTypeId(userBean4Create.getMemberTypeId());
    user.setPoints(new BigDecimal(0));
    user.setDeleted(0);
    user.setCreateTime(DateUtil.now());
    user.setUpdateTime(DateUtil.now());
    userRepository.save(user);
//        final int i = 1 / 0;
  }

  @Transactional(rollbackFor = Exception.class)
  private void add(UserBean4Create userBean4Create) {
    User user = new User();
    user.setName(userBean4Create.getName() + "-new");
    user.setMemberTypeId(userBean4Create.getMemberTypeId());
    user.setPoints(new BigDecimal(0));
    user.setDeleted(0);
    user.setCreateTime(DateUtil.now());
    user.setUpdateTime(DateUtil.now());
    userRepository.save(user);
    final int i = 1 / 0;
  }
}
