package com.codegym.meeting_room_management.service.impl;

import com.codegym.meeting_room_management.dao.entity.Asset;
import com.codegym.meeting_room_management.dao.repository.AssetRepository;
import com.codegym.meeting_room_management.service.AssetService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


public class AssetServiceImpl implements AssetService {
    @Autowired
    AssetRepository assetRepository;



    @Override
    public Asset getAssetById(int id) {
        return assetRepository.findById(id).orElse(null);
    }

    @Override
    public void updateAsset(Asset asset) {
        assetRepository.save(asset);
    }

}
