package com.cmms.CMMS.administration.model.dto;

import com.cmms.CMMS.administration.model.persistent.User;
import com.cmms.CMMS.common.dto.GenericDto;

import java.util.List;

public class RoleDto extends GenericDto {

    private String name;
    private List<User> users;

}
