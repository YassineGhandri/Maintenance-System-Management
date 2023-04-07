package com.cmms.CMMS.maintenance.controler.mapper;


import com.cmms.CMMS.maintenance.model.dto.AssetDto;
import com.cmms.CMMS.maintenance.model.dto.WorkRequestDto;
import com.cmms.CMMS.maintenance.model.persistent.Asset;
import com.cmms.CMMS.maintenance.model.persistent.WorkRequest;
import com.cmms.CMMS.maintenance.repository.AssetRepository;
import com.cmms.CMMS.maintenance.repository.WorkRequestRepository;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public abstract class WorkRequestMapper {

    @Autowired
    private WorkRequestRepository workRequestRepository;
    public abstract WorkRequest toEntity(WorkRequestDto workRequestDto);
    public abstract WorkRequestDto toDto(Optional<WorkRequest> workRequest);
    public abstract List<WorkRequestDto> toDtoList(List<WorkRequest> workRequestList);
}
