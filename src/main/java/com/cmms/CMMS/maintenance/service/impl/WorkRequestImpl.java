package com.cmms.CMMS.maintenance.service.impl;

import com.cmms.CMMS.maintenance.model.persistent.WorkRequest;
import com.cmms.CMMS.maintenance.repository.AssetRepository;
import com.cmms.CMMS.maintenance.repository.WorkRequestRepository;
import com.cmms.CMMS.maintenance.service.WorkRequestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;


@Service
@Slf4j
public class WorkRequestImpl implements WorkRequestService {

    private WorkRequestRepository workRequestRepository;
    @Override
    public WorkRequest save(WorkRequest workRequest) {
        return this.workRequestRepository.save(workRequest);
    }

    @Override
    public void delete(Integer id) {
        this.workRequestRepository.deleteById(id);

    }

    @Override
    public Optional<WorkRequest> findOne(Integer id) {

        return Optional.ofNullable(this.workRequestRepository.findById(id).orElse(null));
    }

    @Override
    public List<WorkRequest> findAll() {
        List<WorkRequest> wrs=null;
        wrs=this.workRequestRepository.findAll();
        return wrs;
    }

    @Override
    public List<WorkRequest> findByIds(Integer[] ids) {
        return this.workRequestRepository.findAllById(Arrays.asList(ids)).stream().toList();
    }
}
