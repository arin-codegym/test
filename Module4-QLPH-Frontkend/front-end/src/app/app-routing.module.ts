import {NgModule} from '@angular/core';
import {Routes, RouterModule} from '@angular/router';
import {AdminRoutingModule} from './admin/admin-routing.module';
import {EmployeeRoutingModule} from './employee/employee-routing.module';
import {PagenotfoundComponent} from './pagenotfound/pagenotfound.component';
import {UserComponent} from './user/user.component';
import {UserRoutingModule} from './user/user-routing.module';
import {CreateBookingRoomComponent} from './user/createbookingroom/createbookingroom.component';


const routes: Routes = [
  {
    path: 'user', component: UserComponent,
    children: [{
      path: 'create-booking-room', component: CreateBookingRoomComponent
    }]
  }
];


@NgModule({
  imports: [RouterModule.forRoot(routes), AdminRoutingModule, EmployeeRoutingModule, UserRoutingModule],
  exports: [RouterModule]
})
export class AppRoutingModule {
}
