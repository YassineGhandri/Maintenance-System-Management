package com.cmms.CMMS.hr.service;

import com.cmms.CMMS.hr.model.persistent.Employee;
import com.cmms.CMMS.hr.repository.EmployeeRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class EmployeeImp implements EmployeeService {

    private EmployeeRepository employeeRepository;


    @Autowired
    public EmployeeImp(EmployeeRepository employeeRepository) {
        this.employeeRepository = employeeRepository;
    }
    @Override
    public Employee save(Employee employee) {
        return (Employee) this.employeeRepository.save(employee);

    }

    @Override
    public void delete(Integer employeeNumber) {
        this.employeeRepository.deleteById(employeeNumber);
    }

    @Override
    public Optional<Employee> findOne(Integer id) {

        return this.employeeRepository.findById(id);
    }

    @Override
    public List<Employee> findAll() {
        List<Employee> employees;
        return employees=this.employeeRepository.findAll();
    }

    @Override
    public List<Employee> findByIds(Integer[] ids) {
        List<Employee> employees;
        return employees=this.employeeRepository.findAllById(Arrays.asList(ids));
    }
}
