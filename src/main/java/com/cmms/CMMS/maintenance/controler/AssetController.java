package com.cmms.CMMS.maintenance.controler;

import com.cmms.CMMS.hr.model.dto.EmployeeDto;
import com.cmms.CMMS.hr.model.persistent.Employee;
import com.cmms.CMMS.maintenance.controler.mapper.AssetMapper;
import com.cmms.CMMS.maintenance.model.dto.AssetDto;
import com.cmms.CMMS.maintenance.model.persistent.Asset;
import com.cmms.CMMS.maintenance.service.AssestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/assets")
@Slf4j
public class AssetController  {

    private AssestService assetService;
    private AssetMapper assetMapper;

    @Autowired
    public AssetController(AssestService assetService, AssetMapper assetMapper) {
        this.assetService = assetService;
        this.assetMapper = assetMapper;
    }

    public List<AssetDto> getAll() {

        return  assetMapper.toDtoList(assetService.findAll());
    }

    @GetMapping("/{id}")
    public Optional<AssetDto> find(@PathVariable("id") Integer id) {
        return Optional.ofNullable(assetMapper.toDto(assetService.findOne(id)));
    }

    @PostMapping
    public AssetDto save(@RequestBody AssetDto assetDto) {
        return assetMapper.toDto(Optional.ofNullable(assetService.save(assetMapper.toEntity(assetDto))));
    }

    @PutMapping("/{id}")
    public AssetDto update(@PathVariable("id") Integer id, @RequestBody AssetDto assetDto) {
        Asset asset = assetMapper.toEntity(assetDto);
        asset.setId(id);
        return  assetMapper.toDto(Optional.ofNullable(assetService.save(asset)));
    }

    @DeleteMapping("/{id}")
    public Integer delete(@PathVariable("id") Integer id) {
        assetService.delete(id);
        return  id;
    }

    @GetMapping("/findByIds")
    public AssetDto findByIds(@RequestParam(value = "ids") Integer[] ids) {
        return (AssetDto) assetService.findByIds(ids).stream().toList();

    }
}
