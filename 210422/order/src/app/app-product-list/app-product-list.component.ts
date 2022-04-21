import { Component, OnInit } from '@angular/core';
import { HttpClient } from '@angular/common/http';
import { ServiceProductService } from '../service-product.service';

@Component({
  selector: 'app-product-list',
  templateUrl: './app-product-list.component.html',
  styleUrls: ['./app-product-list.component.css']
})
export class AppProductListComponent implements OnInit {
  items? : any;

  constructor(private http: HttpClient, public productService: ServiceProductService) { }
  ngOnInit() {
    this.http.get<any>('http://localhost:8080/api/v3/product').subscribe(data => {
        this.items = data;
    })        
  }
}
