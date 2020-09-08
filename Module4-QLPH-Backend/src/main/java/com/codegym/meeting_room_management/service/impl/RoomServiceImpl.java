package com.codegym.meeting_room_management.service.impl;

import com.codegym.meeting_room_management.dao.entity.Region;
import com.codegym.meeting_room_management.dao.entity.Room;
import com.codegym.meeting_room_management.dao.entity.Status;
import com.codegym.meeting_room_management.dao.repository.RoomRepository;
import com.codegym.meeting_room_management.service.RoomService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


import java.util.List;

@Service
public class RoomServiceImpl implements RoomService {
    @Autowired
    RoomRepository roomRepository;

    @Override
    public List<Room> getRoom() {
        return roomRepository.findAll();
    }

    @Override
    public Room findRoomById(int id) {
        return roomRepository.findRoomByIdRoomAndDeleteFlagIsFalse(id);
    }

    @Override
    @Transactional
    public boolean updateRoom(Room room, int id) {
        Room roomEdit = roomRepository.findRoomByIdRoomAndDeleteFlagIsFalse(id);
        if (roomEdit != null) {
            roomEdit.setAreaRoom(room.getAreaRoom());
            roomEdit.setCapacity(room.getCapacity());
            roomEdit.setFloor(room.getFloor());
            roomEdit.setNameRoom(room.getNameRoom());
            roomEdit.setNumberOfUses(room.getNumberOfUses());
            roomEdit.setQuantity(room.getQuantity());
            roomEdit.setRegion(room.getRegion());
            roomEdit.setStatus(room.getStatus());
            roomEdit.setRoomType(room.getRoomType());
            roomRepository.save(room);
            return true;
        }
        return false;
    }
}
