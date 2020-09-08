import {Component, OnInit} from '@angular/core';
import {MatDialog} from '@angular/material/dialog';
import {EditComponent} from './edit/edit.component';
import {RoomService} from '../../services/room.service';
import {Room} from '../../models/room';

@Component({
  selector: 'app-createbookingroom',
  templateUrl: './createbookingroom.component.html',
  styleUrls: ['./createbookingroom.component.scss']
})
export class CreateBookingRoomComponent implements OnInit {
  roomList: Room[];

  constructor(private dialog: MatDialog,
              private roomService: RoomService) {

  }

  ngOnInit(): void {
    this.roomService.getListRoom().subscribe(
      data => {
        if (data != null) {
          this.roomList = data;
        } else {
          this.roomList = [];
        }
      },
      error => {
        this.roomList = [];
      }
    );
  }

  openDialog(room: Room): void {
    this.roomService.gerListMember().subscribe( next =>{
        const dialogRef = this.dialog.open(EditComponent, {
          height: '600px',
          width: '600px',
          data: {data1: room, data2: next},
        });
    }
    );
    // dialogRef.afterClosed().subscribe();
  }
}

