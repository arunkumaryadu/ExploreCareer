import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import {ReactiveFormsModule} from '@angular/forms'
import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';

import { HttpClientModule } from '@angular/common/http';
import { RouterModule, Routes } from '@angular/router';

import { EcHeaderComponent } from './ec-header/ec-header.component';
import { EcHomeComponent } from './ec-home/ec-home.component';
import { EcFieldDisplayAllComponent } from './ec-field-display-all/ec-field-display-all.component';
import { EcFieldServiceService }  from './services/ec-field-service.service';


@NgModule({
  declarations: [
    AppComponent,
    EcHeaderComponent,
    EcHomeComponent,
    EcFieldDisplayAllComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    ReactiveFormsModule,
    HttpClientModule,
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
