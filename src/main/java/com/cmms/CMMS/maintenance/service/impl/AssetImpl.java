package com.cmms.CMMS.maintenance.service.impl;

import com.cmms.CMMS.maintenance.model.persistent.Asset;
import com.cmms.CMMS.maintenance.repository.AssetRepository;
import com.cmms.CMMS.maintenance.service.AssestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@Service
@Slf4j
public class AssetImpl implements AssestService {

    private AssetRepository assetRepository;
    @Override
    public Asset save(Asset asset) {
        return this.assetRepository.save(asset);
    }

    @Override
    public void delete(Integer id) {
        this.assetRepository.deleteById(id);
    }

    @Override
    public Optional<Asset> findOne(Integer id) {
        return this.assetRepository.findById(id);
    }

    @Override
    public List<Asset> findAll() {
        List<Asset> assets=null;
        assets=this.assetRepository.findAll();
        return assets;
    }

    @Override
    public List<Asset> findByIds(Integer[] ids) {
        List<Asset> assets=null;
        assets=this.assetRepository.findAllById(Arrays.asList(ids)).stream().toList();
        return assets;
    }
}
