package com.utah.repository;

import com.utah.po.UserOrder;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface UserOrderRepository extends CrudRepository<UserOrder, Long> {
    List<UserOrder> findByUserId(Long userId);
}
