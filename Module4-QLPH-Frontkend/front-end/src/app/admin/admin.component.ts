import {Component, OnInit} from '@angular/core';


@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrls: ['./admin.component.scss']
})
export class AdminComponent implements OnInit {
  background: any;
  links: ['Quản lý phòng họp', 'Quản lý tài sản', 'Quản lý người dùng', 'Thống kê', 'Xem phản hồi'];
  activeLink: any;
  constructor() {
  }

  ngOnInit(): void {}
}
