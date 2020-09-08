import {LOCALE_ID, NgModule} from '@angular/core';
import {CommonModule, registerLocaleData} from '@angular/common';
import {UserRoutingModule} from './user-routing.module';
import {RouterModule} from '@angular/router';
import {ShareModule} from '../shares/share.module';
import {MaterialModule} from '../shares/material.module';
import localeGB from '@angular/common/locales/vi';
import { EditComponent } from './createbookingroom/edit/edit.component';
import {MatSelectModule} from '@angular/material/select';
import {MatIconModule} from '@angular/material/icon';
import {MatButtonModule} from '@angular/material/button';
import {MaterialFileInputModule} from 'ngx-material-file-input';
registerLocaleData(localeGB);
@NgModule({
  declarations: [EditComponent],
  exports: [],
  imports: [
    CommonModule,
    UserRoutingModule,
    RouterModule,
    ShareModule,
    MaterialModule,
    MatSelectModule,
    MatIconModule,
    MatButtonModule,
    MaterialFileInputModule,
  ], providers: [
    {provide: LOCALE_ID, useValue: 'vi'}

  ]
})
export class UserModule {
}
