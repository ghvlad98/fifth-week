import { Component, OnInit } from '@angular/core';
import { CartService } from '../cart.service';

@Component({
  selector: 'app-app-top-bar',
  templateUrl: './app-top-bar.component.html',
  styleUrls: ['./app-top-bar.component.css']
})
export class AppTopBarComponent implements OnInit {

  constructor(public cartService: CartService) { }

  ngOnInit(): void {
  }

}
