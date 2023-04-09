package com.cmms.CMMS.administration.service.Impl;


import com.cmms.CMMS.administration.model.persistent.Role;
import com.cmms.CMMS.administration.model.persistent.User;
import com.cmms.CMMS.administration.repository.RoleRepository;
import com.cmms.CMMS.administration.repository.UserRepository;
import com.cmms.CMMS.administration.service.RoleService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class RoleImpl implements RoleService {

    private RoleRepository roleRepository;


    @Autowired
    public RoleImpl(RoleRepository roleRepository) {

        this.roleRepository = roleRepository;
    }

    @Override
    public Role save(Role role) {
        return (Role) this.roleRepository.save(role);

    }

    @Override
    public void delete(Integer id) {

        this.roleRepository.deleteById(id);
    }

    @Override
    public Optional<Role> findOne(Integer id) {

        return this.roleRepository.findById(id);
    }

    @Override
    public List<Role> findAll() {
        List<Role> roles;
        return roles=this.roleRepository.findAll();
    }

    @Override
    public List<Role> findByIds(Integer[] ids) {
        List<Role> roles;
        return roles=this.roleRepository.findAllById(Arrays.asList(ids));
    }
}
