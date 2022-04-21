import { HttpClient, HttpHeaders } from '@angular/common/http';
import { newArray } from '@angular/compiler/src/util';
import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class CartService {
  cartItems: any[] = new Array();
  total: number = 0;
  currId: number = 2;
  constructor(private http: HttpClient) { }

  calculateTotal() {
    for (let i = 0; i < this.cartItems.length; i++) {
      this.total += this.cartItems[i].price;
    }
    alert(this.total);
  }

  getAllCartItems(): void {
    console.log(this.cartItems);
  }

  postOrder(): void {
    let body = {
      id: String(this.currId++),
      products: this.cartItems
    };

    const headers = new HttpHeaders()
    .append(
      'Content-Type',
      'application/json'
    );
    if (this.cartItems.length > 0) {
      this.http
        .post<any>('http://localhost:8080/api/v4/order', body, {
          headers: headers,
        })
        .subscribe((res) => console.log(res));
      
      alert("Order registered!")
      this.cartItems = new Array();
      } else {
      alert("Insert at least an item in the cart!")
    }
  }
}
