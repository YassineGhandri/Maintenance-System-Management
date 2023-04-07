package com.cmms.CMMS.maintenance.controler.mapper;

import com.cmms.CMMS.maintenance.model.dto.AssetDto;
import com.cmms.CMMS.maintenance.model.persistent.Asset;
import com.cmms.CMMS.maintenance.repository.AssetRepository;
import org.mapstruct.Mapper;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Optional;

@Mapper(componentModel = "spring")
public abstract class AssetMapper {
    @Autowired
    private AssetRepository employeeRepository;
    public abstract Asset toEntity(AssetDto assetDto);
    public abstract AssetDto toDto(Optional<Asset> asset);
    public abstract List<AssetDto> toDtoList(List<Asset> assetList);

}
