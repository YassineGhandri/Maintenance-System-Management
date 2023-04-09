package com.cmms.CMMS.administration.service.Impl;

import com.cmms.CMMS.administration.model.persistent.User;
import com.cmms.CMMS.administration.repository.UserRepository;
import com.cmms.CMMS.administration.service.UserService;
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
public class UserImpl implements UserService {
    private UserRepository userRepository;


    @Autowired
    public UserImpl(UserRepository userRepository) {

        this.userRepository = userRepository;
    }

    @Override
    public User save(User user) {
        return (User) this.userRepository.save(user);

    }

    @Override
    public void delete(Integer id) {

        this.userRepository.deleteById(id);
    }

    @Override
    public Optional<User> findOne(Integer id) {

        return this.userRepository.findById(id);
    }

    @Override
    public List<User> findAll() {
        List<User> employees;
        return employees=this.userRepository.findAll();
    }

    @Override
    public List<User> findByIds(Integer[] ids) {
        List<User> users;
        return users=this.userRepository.findAllById(Arrays.asList(ids));
    }
}
