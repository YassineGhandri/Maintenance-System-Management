package com.cmms.CMMS.hr.controler.mapper;

import com.cmms.CMMS.hr.model.dto.EmployeeDto;
import com.cmms.CMMS.hr.model.persistent.Employee;
import com.cmms.CMMS.hr.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.mapstruct.Mapper;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public abstract class EmployeeMapper {
    @Autowired
    private EmployeeRepository employeeRepository;
    public abstract Employee toEntity(EmployeeDto employeeDto);
    public abstract EmployeeDto toDto(Optional<Employee> employee);
    public abstract List<EmployeeDto> toDtoList(List<Employee> employeeList);


}
