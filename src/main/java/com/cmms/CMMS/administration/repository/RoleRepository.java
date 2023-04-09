package com.cmms.CMMS.administration.repository;

import com.cmms.CMMS.administration.model.persistent.Role;
import com.cmms.CMMS.common.repository.GenericRepository;

public interface RoleRepository extends GenericRepository<Role> {
    Role findByName(String name);
}
