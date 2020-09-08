package com.codegym.meeting_room_management.service.impl;

import com.codegym.meeting_room_management.dao.entity.RoomType;
import com.codegym.meeting_room_management.dao.repository.RoomTypeRepository;
import com.codegym.meeting_room_management.service.RoomTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class RoomTypeServiceImpl implements RoomTypeService {
    @Autowired
    RoomTypeRepository roomTypeRepository;
    @Override
    public List<RoomType> getListRoomType() {
        return roomTypeRepository.findAll();
    }
}
