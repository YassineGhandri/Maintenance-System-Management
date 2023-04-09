package com.cmms.CMMS.administration.model.dto;

import com.cmms.CMMS.administration.model.persistent.Role;
import com.cmms.CMMS.common.dto.GenericDto;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.ArrayList;
import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class UserDto extends GenericDto {



    private String firstName;

    private String lastName;

    private String email;

    private String password;


}
