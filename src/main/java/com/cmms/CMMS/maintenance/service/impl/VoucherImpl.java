package com.cmms.CMMS.maintenance.service.impl;


import com.cmms.CMMS.maintenance.model.persistent.Voucher;
import com.cmms.CMMS.maintenance.repository.VoucherRepository;
import com.cmms.CMMS.maintenance.service.VoucherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class VoucherImpl implements VoucherService {

    private VoucherRepository voucherRepository;
    @Override
    public Voucher save(Voucher voucher) {
        return this.voucherRepository.save(voucher);
    }

    @Override
    public void delete(Integer id) {
        this.voucherRepository.deleteById(id);
    }

    @Override
    public Optional<Voucher> findOne(Integer id) {
        return this.voucherRepository.findById(id);
    }

    @Override
    public List<Voucher> findAll() {
        List<Voucher> vouchers;
        return vouchers=this.voucherRepository.findAll().stream().toList();
    }

    @Override
    public List<Voucher> findByIds(Integer[] ids) {
        List<Voucher> vouchers;
        return this.voucherRepository.findAllById(Arrays.asList(ids)).stream().toList();
    }
}
