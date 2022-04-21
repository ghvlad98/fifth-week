import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { AppRoutingModule } from './app-routing.module';
import { RouterModule, Routes } from '@angular/router';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import { MaterialModule } from './material.module';
import { AppTopBarComponent } from './app-top-bar/app-top-bar.component';
import { AppProductListComponent } from './app-product-list/app-product-list.component';
import { HttpClientModule } from '@angular/common/http';
import { DetailComponent } from './detail/detail.component';
import { Detail2Component } from './detail2/detail2.component';
import { Detail3Component } from './detail3/detail3.component';
import { CheckoutComponent } from './checkout/checkout.component';

const routes: Routes = []

@NgModule({
  declarations: [
    AppComponent,
    AppTopBarComponent,
    AppProductListComponent,
    DetailComponent,
    Detail2Component,
    Detail3Component,
    CheckoutComponent
  ],
  imports: [
    BrowserModule,
    AppRoutingModule,
    RouterModule.forRoot(routes),
    BrowserAnimationsModule,
    MaterialModule,
    HttpClientModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
