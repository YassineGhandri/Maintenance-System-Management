package com.cmms.CMMS.administration.service;

import com.cmms.CMMS.administration.model.persistent.Role;
import com.cmms.CMMS.hr.model.persistent.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.springframework.transaction.annotation.Propagation.REQUIRED;

@Transactional
public interface RoleService {
    @Transactional(propagation = REQUIRED)
    Role save(Role role);

    @Transactional(propagation = REQUIRED)
    void delete(Integer id);

    Optional<Role> findOne(Integer id);

    List<Role> findAll();

    List<Role> findByIds(Integer[] ids);
}
