package com.cmms.CMMS.maintenance.service;

import com.cmms.CMMS.maintenance.model.persistent.Asset;
import com.cmms.CMMS.maintenance.model.persistent.WorkRequest;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.springframework.transaction.annotation.Propagation.REQUIRED;

@Transactional
public interface WorkRequestService {
    @Transactional(propagation = REQUIRED)
    WorkRequest save(WorkRequest workRequest);

    @Transactional(propagation = REQUIRED)
    void delete(Integer id);

    Optional<WorkRequest> findOne(Integer id);

    List<WorkRequest> findAll();

    List<WorkRequest> findByIds(Integer[] ids);
}
