package com.cmms.CMMS.maintenance.controler;

import com.cmms.CMMS.maintenance.controler.mapper.AssetMapper;
import com.cmms.CMMS.maintenance.controler.mapper.VoucherMapper;
import com.cmms.CMMS.maintenance.model.dto.AssetDto;
import com.cmms.CMMS.maintenance.model.dto.VoucherDto;
import com.cmms.CMMS.maintenance.model.persistent.Asset;
import com.cmms.CMMS.maintenance.model.persistent.Voucher;
import com.cmms.CMMS.maintenance.service.AssestService;
import com.cmms.CMMS.maintenance.service.VoucherService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/vouchers")
@Slf4j
public class VoucherController {
    private VoucherService voucherService;
    private VoucherMapper voucherMapper;

    @Autowired
    public VoucherController(VoucherService voucherService, VoucherMapper voucherMapper) {
        this.voucherService = voucherService;
        this.voucherMapper = voucherMapper;
    }

    public List<VoucherDto> getAll() {

        return  voucherMapper.toDtoList(voucherService.findAll());
    }

    @GetMapping("/{id}")
    public Optional<VoucherDto> find(@PathVariable("id") Integer id) {
        return Optional.ofNullable(voucherMapper.toDto(voucherService.findOne(id)));
    }

    @PostMapping
    public VoucherDto save(@RequestBody VoucherDto voucherDto) {
        return voucherMapper.toDto(Optional.ofNullable(voucherService.save(voucherMapper.toEntity(voucherDto))));
    }

    @PutMapping("/{id}")
    public VoucherDto update(@PathVariable("id") Integer id, @RequestBody VoucherDto voucherDto) {
        Voucher voucher = voucherMapper.toEntity(voucherDto);
        voucher.setId(id);
        return  voucherMapper.toDto(Optional.ofNullable(voucherService.save(voucher)));
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable("id") Integer id) {
        voucherService.delete(id);
        return  id;
    }

    @GetMapping("/findByIds")
    public VoucherDto findByIds(@RequestParam(value = "ids") Integer[] ids) {
        return (VoucherDto) voucherService.findByIds(ids).stream().toList();

    }
}
