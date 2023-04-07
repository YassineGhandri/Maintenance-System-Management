package com.cmms.CMMS.maintenance.controler.mapper;

import com.cmms.CMMS.maintenance.model.dto.AssetDto;
import com.cmms.CMMS.maintenance.model.dto.VoucherDto;
import com.cmms.CMMS.maintenance.model.persistent.Asset;
import com.cmms.CMMS.maintenance.model.persistent.Voucher;
import com.cmms.CMMS.maintenance.repository.AssetRepository;
import com.cmms.CMMS.maintenance.repository.VoucherRepository;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public abstract class VoucherMapper {
    @Autowired
    private VoucherRepository voucherRepository;

    public abstract Voucher toEntity(VoucherDto voucherDto);
    public abstract VoucherDto toDto(Optional<Voucher> voucher);
    public abstract List<VoucherDto> toDtoList(List<Voucher> voucherList);
}
