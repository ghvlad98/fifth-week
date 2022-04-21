import { Component, OnInit } from '@angular/core';
import { ActivatedRoute } from '@angular/router';
import { CartService } from '../cart.service';
import { ServiceProductService } from '../service-product.service';

@Component({
  selector: 'app-detail',
  templateUrl: './detail.component.html',
  styleUrls: ['./detail.component.css']
})
export class DetailComponent implements OnInit {
  product: any = new Object;

  constructor(private route: ActivatedRoute, public productService: ServiceProductService, public cartService: CartService) { }

  ngOnInit(): void {
    this.productService.getProduct1().subscribe(
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
