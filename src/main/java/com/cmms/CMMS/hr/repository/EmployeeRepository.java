package com.cmms.CMMS.hr.repository;

import com.cmms.CMMS.common.repository.GenericRepository;
import com.cmms.CMMS.hr.model.persistent.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;

public interface EmployeeRepository  extends GenericRepository<Employee> {

}
