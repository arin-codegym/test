package com.codegym.meeting_room_management.dao.repository;

import com.codegym.meeting_room_management.dao.entity.RoomType;
import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomTypeRepository extends JpaRepository<RoomType,Integer> {
}
