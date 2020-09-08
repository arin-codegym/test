package com.codegym.meeting_room_management.dao.entity;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class RoomAssetKey implements Serializable {
    @Column(name = "id_room")
    private Integer roomId;
    @Column(name = "id_asset")
    private Integer assetId;

    public RoomAssetKey() {
    }

    public RoomAssetKey(Integer roomId, Integer assetId) {
        this.roomId = roomId;
        this.assetId = assetId;
    }

    public int getRoomId() {
        return roomId;
    }

    public void setRoomId(Integer roomId) {
        this.roomId = roomId;
    }

    public int getAssetId() {
        return assetId;
    }

    public void setAssetId(Integer assetId) {
        this.assetId = assetId;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((roomId == null) ? 0 : roomId.hashCode());
        result = prime * result + ((assetId == null) ? 0 : assetId.hashCode());
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        RoomAssetKey other = (RoomAssetKey) obj;
        if (roomId == null) {
            if (other.roomId != null)
                return false;
        } else if (!roomId.equals(other.roomId))
            return false;
        if (assetId == null) {
            if (other.assetId != null)
                return false;
        } else if (!assetId.equals(other.assetId))
            return false;
        return true;
    }
}

