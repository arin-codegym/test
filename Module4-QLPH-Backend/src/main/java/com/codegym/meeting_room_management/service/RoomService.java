package com.codegym.meeting_room_management.service;

import com.codegym.meeting_room_management.dao.entity.Region;
import com.codegym.meeting_room_management.dao.entity.Room;
import com.codegym.meeting_room_management.dao.entity.Status;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface RoomService {
    List<Room> getRoom();
    Room findRoomById(int id);
    boolean updateRoom(Room room , int id );
}
