package com.codegym.meeting_room_management.dao.entity;



import javax.persistence.*;


import java.util.*;

@Entity
@Table(name = "room")
public class Room {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_room")
    private int idRoom;
    @Column(name = "name")
    private String nameRoom;
    @Column(name = "area")
    private float areaRoom;
    @Column(name = "floor")
    private int floor;
    @Column(name = "capacity")
    private int capacity;
    @ManyToOne
    @JoinColumn(name = "id_status",nullable = false)
    private Status status;
    @ManyToOne
    @JoinColumn(name = "id_region", nullable = false)
    private Region region;
    @ManyToOne
    @JoinColumn(name = "id_type_room", nullable = false)
    private RoomType roomType;
    @Column(name = "number_of_uses")
    private int numberOfUses;
    @Column(name = "delate_flag")
    private boolean deleteFlag;
    @Column(name = "image")
    private String image ;
    @OneToMany(mappedBy = "room")
    Set<RoomAsset> quantity = new HashSet<>();

    public Room() {
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }

    public int getIdRoom() {
        return idRoom;
    }

    public void setIdRoom(int idRoom) {
        this.idRoom = idRoom;
    }

    public RoomType getRoomType() {
        return roomType;
    }

    public void setRoomType(RoomType roomType) {
        this.roomType = roomType;
    }

    public String getNameRoom() {
        return nameRoom;
    }

    public void setNameRoom(String nameRoom) {
        this.nameRoom = nameRoom;
    }

    public float getAreaRoom() {
        return areaRoom;
    }

    public void setAreaRoom(float areaRoom) {
        this.areaRoom = areaRoom;
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(int floor) {
        this.floor = floor;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public int getNumberOfUses() {
        return numberOfUses;
    }

    public void setNumberOfUses(int numberOfUses) {
        this.numberOfUses = numberOfUses;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Region getRegion() {
        return region;
    }

    public void setRegion(Region region) {
        this.region = region;
    }

    public Set<RoomAsset> getQuantity() {
        return quantity;
    }

    public void setQuantity(Set<RoomAsset> quantity) {
        this.quantity = quantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Room)) return false;
        Room room = (Room) o;
        return getIdRoom() == room.getIdRoom() &&
                Float.compare(room.getAreaRoom(), getAreaRoom()) == 0 &&
                getFloor() == room.getFloor() &&
                getCapacity() == room.getCapacity() &&
                getNumberOfUses() == room.getNumberOfUses() &&
                isDeleteFlag() == room.isDeleteFlag() &&
                getNameRoom().equals(room.getNameRoom()) &&
                getStatus().equals(room.getStatus()) &&
                getRegion().equals(room.getRegion()) &&
                getQuantity().equals(room.getQuantity());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getIdRoom(), getNameRoom(), getAreaRoom(), getFloor(), getCapacity(), getStatus(), getNumberOfUses(), isDeleteFlag(), getRegion(), getQuantity());
    }
}
