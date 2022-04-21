import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { RouterModule, Routes } from '@angular/router';
import { DetailComponent } from './detail/detail.component';
import { Detail2Component } from './detail2/detail2.component';
import { Detail3Component } from './detail3/detail3.component';
import { AppComponent } from './app.component';

const routes: Routes = [
  { path: 'detail/1', component: DetailComponent },
  { path: 'detail/2', component: Detail2Component },
  { path: 'detail/3', component: Detail3Component },
]

@NgModule({
  declarations: [],
  imports: [
    CommonModule,
    RouterModule.forRoot(routes)
  ],
  exports: [RouterModule]
})
export class AppRoutingModule { }
