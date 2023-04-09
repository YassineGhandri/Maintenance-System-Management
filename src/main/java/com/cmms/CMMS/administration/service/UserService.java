package com.cmms.CMMS.administration.service;

import com.cmms.CMMS.administration.model.persistent.User;
import com.cmms.CMMS.hr.model.persistent.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.springframework.transaction.annotation.Propagation.REQUIRED;

@Transactional
public interface UserService {
    @Transactional(propagation = REQUIRED)
    User save(User user);

    @Transactional(propagation = REQUIRED)
    void delete(Integer id);

    Optional<User> findOne(Integer id);

    List<User> findAll();

    List<User> findByIds(Integer[] ids);
}
