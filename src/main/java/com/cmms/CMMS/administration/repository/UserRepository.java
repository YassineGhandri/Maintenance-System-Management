package com.cmms.CMMS.administration.repository;

import com.cmms.CMMS.administration.model.persistent.User;
import com.cmms.CMMS.common.repository.GenericRepository;

public interface UserRepository extends GenericRepository<User> {
    User findByEmail(String email);

}
