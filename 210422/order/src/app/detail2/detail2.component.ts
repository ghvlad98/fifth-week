import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CartService } from '../cart.service';
import { ServiceProductService } from '../service-product.service';

@Component({
  selector: 'app-detail2',
  templateUrl: './detail2.component.html',
  styleUrls: ['./detail2.component.css']
})
export class Detail2Component implements OnInit {
  product: any = new Object;

  constructor(private route: ActivatedRoute, public productService: ServiceProductService, public cartService: CartService) { }

  ngOnInit(): void {
    this.productService.getProduct2().subscribe(
      (res: any) => {
        this.product = res;
      }
    )
  }

  addProduct(): void {
    this.cartService.cartItems.push(this.product);
    alert("Product inserted in your shopping cart!")
  }

  removeProduct() {
    this.cartService.cartItems = this.cartService.cartItems.filter(obj => {return obj !== this.product});
  }
}
