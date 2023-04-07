package com.cmms.CMMS.maintenance.service;

import com.cmms.CMMS.maintenance.model.persistent.Voucher;
import com.cmms.CMMS.maintenance.model.persistent.WorkRequest;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

import static org.springframework.transaction.annotation.Propagation.REQUIRED;

@Transactional
public interface VoucherService {

    @Transactional(propagation = REQUIRED)
    Voucher save(Voucher voucher);

    @Transactional(propagation = REQUIRED)
    void delete(Integer id);

    Optional<Voucher> findOne(Integer id);

    List<Voucher> findAll();

    List<Voucher> findByIds(Integer[] ids);
}
