package com.cmms.CMMS.hr.model.dto;

import com.cmms.CMMS.common.dto.GenericDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.Column;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class EmployeeDto extends GenericDto {
    private String employeeNumber;
    private String firstName;
    private String lastName;
    private String post;
    private String email;
}
