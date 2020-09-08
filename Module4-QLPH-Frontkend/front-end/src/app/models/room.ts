export class Room {
  idRoom: number;
  nameRoom: string;
  areaRoom: number;
  floor: number;
  capacity: number;
  status: {
    id: number;
    name: string
  };
  numberOfUses: number;
  deleteFlag: boolean;
  region: {
    id: number;
    name: string
  };
  roomType: {
    roomTypeId: number;
    name: string
  };
  quantity: [{
    id: {
      roomId: number;
      assetId: number
    },
    quantity: number
  }];
}
