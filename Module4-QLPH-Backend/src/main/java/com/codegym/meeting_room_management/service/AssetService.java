package com.codegym.meeting_room_management.service;

import com.codegym.meeting_room_management.dao.entity.Asset;

public interface AssetService {
    Asset getAssetById(int id);
    void updateAsset(Asset asset);
}
