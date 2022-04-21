
import { CommonModule } from '@angular/common';
import { NgModule } from '@angular/core';
import { MatToolbarModule } from '@angular/material/toolbar';
import {MatProgressBarModule} from '@angular/material/progress-bar';
import {MatGridListModule} from '@angular/material/grid-list';
import {MatIconModule} from '@angular/material/icon';

@NgModule({
    imports: [CommonModule, MatToolbarModule, MatProgressBarModule, MatGridListModule, MatIconModule],
    exports: [CommonModule, MatToolbarModule, MatProgressBarModule, MatGridListModule, MatIconModule],
  })
  export class MaterialModule { }