package com.utah.repository;

import com.utah.po.User;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends CrudRepository<User, Long> {
    User findByIdAndDeleted(Long id, Integer deleted);
}
