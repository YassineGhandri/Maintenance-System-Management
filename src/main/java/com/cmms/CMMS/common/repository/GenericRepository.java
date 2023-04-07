package com.cmms.CMMS.common.repository;

import com.cmms.CMMS.common.persistent.GenericEntity;
import com.cmms.CMMS.hr.model.persistent.Employee;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.NoRepositoryBean;

import java.util.List;
import java.util.Optional;
@NoRepositoryBean
public interface GenericRepository<T extends GenericEntity> extends JpaRepository<T,Integer> {


}
