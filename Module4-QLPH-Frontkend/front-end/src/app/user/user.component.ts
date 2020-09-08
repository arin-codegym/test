import {Component, OnInit} from '@angular/core';
import {ThemePalette} from '@angular/material/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.scss']
})
export class UserComponent implements OnInit {
  links = ['Quản lý phòng họp', 'Quản lý tài sản', 'Quản lý người dùng', 'Thống kê', 'Xem phản hồi'];
  activeLink = this.links[0];
  background: any;


  constructor() {
  }

  ngOnInit(): void {
  }

}
