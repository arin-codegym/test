import {Component, Inject, OnInit} from '@angular/core';
import {FormBuilder, FormControl, FormGroup, Validators} from '@angular/forms';
import {MAT_DIALOG_DATA, MatDialogRef} from '@angular/material/dialog';
import {Room} from '../../../models/room';
import {Status} from '../../../models/status';
import {Region} from '../../../models/region';
import {Roomtype} from '../../../models/roomtype';


@Component({
  selector: 'app-edit',
  templateUrl: './edit.component.html',
  styleUrls: ['./edit.component.scss']
})
export class EditComponent implements OnInit {
  hideRequiredControl = new FormControl(false);
  floatLabelControl = new FormControl('auto');
  room: Room;
  listMember: any;
  statusList: Status[];
  regionList: Region[];
  roomTypeList: Roomtype[];
  roomForm: FormGroup;

  constructor(public  dialogRef: MatDialogRef<EditComponent>,
              @Inject(MAT_DIALOG_DATA) public data: any,
              private formBuilder: FormBuilder) {
  }

  ngOnInit(): void {
    this.room = this.data.data1;
    this.listMember = this.data.data2;
    this.statusList = this.data.data2.statusList[0];
    this.regionList = this.data.data2.regionList[0];
    this.roomTypeList = this.data.data2.roomTypeList[0];
    console.log(this.regionList);
    this.roomForm = this.formBuilder.group(
      {
        nameRoom: new FormControl('', Validators.compose),
        areaRoom: new FormControl(''),
        floor: new FormControl(''),
        capacity: new FormControl(''),
        status: new FormControl(''),
        numberOfUses: new FormControl(''),
        deleteFlag: new FormControl(''),
        region: new FormControl(''),
        roomType: new FormControl(''),
        quantity: new FormControl(''),
      });
  }
}
