package com.cmms.CMMS.hr.controler;


import com.cmms.CMMS.hr.controler.mapper.EmployeeMapper;
import com.cmms.CMMS.hr.model.dto.EmployeeDto;
import com.cmms.CMMS.hr.model.persistent.Employee;
import com.cmms.CMMS.hr.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;


@RestController
@RequestMapping("/employees")
@Slf4j
public class EmployeeController {

    private final EmployeeService employeeService;
    private final EmployeeMapper employeeMapper;

    @Autowired
    public EmployeeController(EmployeeService employeeService, EmployeeMapper employeeMapper) {
        this.employeeService = employeeService;
        this.employeeMapper = employeeMapper;
    }

    public List<EmployeeDto> getAll() {

        return  employeeMapper.toDtoList(employeeService.findAll());
    }

    @GetMapping("/{id}")
    public EmployeeDto find(@PathVariable("id") Integer id) {
        return  employeeMapper.toDto(employeeService.findOne(id));
    }

    @PostMapping
    public EmployeeDto save(@RequestBody EmployeeDto employeeDto) {
        return employeeMapper.toDto(Optional.ofNullable(employeeService
                .save(employeeMapper.toEntity(employeeDto))));
    }

    @PutMapping("/{id}")
    public EmployeeDto update(@PathVariable("id") Integer id, @RequestBody EmployeeDto employeeDto) {
        Employee employee = employeeMapper.toEntity(employeeDto);
        employee.setId(id);
        return  employeeMapper.toDto(Optional.ofNullable(employeeService.save(employee)));
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable("id") Integer id) {
        employeeService.delete(id);
        return  id;
    }

    @GetMapping("/findByIds")
    public EmployeeDto findByIds(@RequestParam(value = "ids") Integer[] ids) {
        return (EmployeeDto) employeeService.findByIds(ids).stream().toList();

    }
}
