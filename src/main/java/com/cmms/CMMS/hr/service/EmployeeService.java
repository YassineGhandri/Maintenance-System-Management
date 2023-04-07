package com.cmms.CMMS.hr.service;

import com.cmms.CMMS.hr.model.persistent.Employee;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.springframework.transaction.annotation.Propagation.REQUIRED;

@Transactional
public interface EmployeeService {

    @Transactional(propagation = REQUIRED)
    Employee save(Employee employee);

    @Transactional(propagation = REQUIRED)
    void delete(Integer employeeNumber);

    Optional<Employee> findOne(Integer id);

    List<Employee> findAll();

    List<Employee> findByIds(Integer[] ids);
}
