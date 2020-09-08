import {NgModule} from '@angular/core';
import {AppRoutingModule} from './app-routing.module';
import {AppComponent} from './app.component';
import {AdminComponent} from './admin/admin.component';
import {AdminModule} from './admin/admin.module';
import {ShareModule} from './shares/share.module';
import {MaterialModule} from './shares/material.module';
import {UserComponent} from './user/user.component';
import {UserModule} from './user/user.module';
import {EmployeeModule} from './employee/employee.module';
import {EmployeeComponent} from './employee/employee.component';

import {PagenotfoundComponent} from './pagenotfound/pagenotfound.component';
import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {ToastrModule} from 'ngx-toastr';
import {MatTabsModule} from "@angular/material/tabs";
import { MaterialFileInputModule } from 'ngx-material-file-input';

@NgModule({
  declarations: [
    AppComponent,
    AdminComponent,
    EmployeeComponent,
    UserComponent,
    PagenotfoundComponent,
      ],
  imports: [
    AdminModule,
    EmployeeModule,
    ShareModule,
    AppRoutingModule,
    MaterialModule,
    UserModule,
    MaterialFileInputModule,
    BrowserAnimationsModule,
    ToastrModule.forRoot({
      timeOut: 2000,
      positionClass: 'toast-top-center'
    }),
    MatTabsModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule {
}
