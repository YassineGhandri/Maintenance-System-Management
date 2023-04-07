package com.cmms.CMMS.maintenance.service;

import com.cmms.CMMS.maintenance.model.persistent.Asset;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.springframework.transaction.annotation.Propagation.REQUIRED;

@Transactional
public interface AssestService {

    @Transactional(propagation = REQUIRED)
    Asset save(Asset asset);

    @Transactional(propagation = REQUIRED)
    void delete(Integer id);

    Optional<Asset> findOne(Integer id);

    List<Asset> findAll();

    List<Asset> findByIds(Integer[] ids);
}
