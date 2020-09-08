package com.codegym.meeting_room_management.webservice.controller;

import com.codegym.meeting_room_management.dao.entity.Region;
import com.codegym.meeting_room_management.dao.entity.Room;
import com.codegym.meeting_room_management.dao.entity.RoomType;
import com.codegym.meeting_room_management.dao.entity.Status;
import com.codegym.meeting_room_management.service.RegionService;
import com.codegym.meeting_room_management.service.RoomService;
import com.codegym.meeting_room_management.service.RoomTypeService;
import com.codegym.meeting_room_management.service.StatusService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import sun.net.RegisteredDomain;

import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@CrossOrigin(origins = "http://localhost:4200", allowedHeaders = "*")
@RestController
public class RoomController {
    @Autowired
    RoomService roomService;
    @Autowired
    RegionService regionService;
    @Autowired
    StatusService statusService;
    @Autowired
    RoomTypeService roomTypeService;


    @RequestMapping(value = "rooms", method = RequestMethod.GET)
    public ResponseEntity<List<Room>> getListRoom() {
        List<Room> roomList = roomService.getRoom();
        if (roomList.isEmpty()) {
            return new ResponseEntity<>(HttpStatus.NO_CONTENT);
        }
        return new ResponseEntity<>(roomList, HttpStatus.OK);
    }
    @RequestMapping(value = "list-member", method = RequestMethod.GET)
    public ResponseEntity<Map<String,List<Object>>> getListMember() {
        Map<String,List<Object>> listMap = new HashMap<>();
        List<Region> regionList = regionService.getListRegion();
        List<Status> statusList= statusService.getListStatus();
        List<RoomType> roomTypeList = roomTypeService.getListRoomType();
        listMap.put("regionList", Collections.singletonList( regionList));
        listMap.put("statusList", Collections.singletonList( statusList));
        listMap.put("roomTypeList", Collections.singletonList( roomTypeList));
        return new ResponseEntity<>(listMap, HttpStatus.OK);
    }


    @PutMapping("rooms/{id}")
    public ResponseEntity<?> editRoom(@RequestBody Room room,@PathVariable("id") int id) {
        if (roomService.updateRoom(room, id)) {
            return new ResponseEntity<>(HttpStatus.OK);
        }else {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
