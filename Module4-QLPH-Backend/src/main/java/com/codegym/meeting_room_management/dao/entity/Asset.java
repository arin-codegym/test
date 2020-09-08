package com.codegym.meeting_room_management.dao.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import org.hibernate.annotations.CacheConcurrencyStrategy;
import org.hibernate.annotations.NaturalIdCache;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "asset")

public class Asset {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_asset")
    private int id;
    private String name;
    private int numberUsing;
    private int numberFixed;
    private int numberAvailability;
    private int total;
    private String detail;
    private String price;
    private String img;
    private boolean deleteFlag;

    @OneToMany(mappedBy = "asset", cascade = CascadeType.ALL,
            orphanRemoval = true)
    Set<RoomAsset> quantity = new HashSet<>();
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberUsing() {
        return numberUsing;
    }

    public void setNumberUsing(int numberUsing) {
        this.numberUsing = numberUsing;
    }

    public int getNumberFixed() {
        return numberFixed;
    }

    public void setNumberFixed(int numberFixed) {
        this.numberFixed = numberFixed;
    }

    public int getNumberAvailability() {
        return numberAvailability;
    }

    public void setNumberAvailability(int numberAvailability) {
        this.numberAvailability = numberAvailability;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public Set<RoomAsset> getQuantity() {
        return quantity;
    }

    public void setQuantity(Set<RoomAsset> quantity) {
        this.quantity = quantity;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public boolean isDeleteFlag() {
        return deleteFlag;
    }

    public void setDeleteFlag(boolean deleteFlag) {
        this.deleteFlag = deleteFlag;
    }

    public Asset() {
    }
}
