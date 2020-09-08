package com.codegym.meeting_room_management.dao.repository;

import com.codegym.meeting_room_management.dao.entity.Room;
import com.codegym.meeting_room_management.dao.entity.RoomAsset;
import com.codegym.meeting_room_management.dao.entity.RoomAssetKey;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface RoomRepository extends JpaRepository<Room, RoomAssetKey> {
    Room findRoomByIdRoomAndDeleteFlagIsFalse(Integer idRoom);

}
