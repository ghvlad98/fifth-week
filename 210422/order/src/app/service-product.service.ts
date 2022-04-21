import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';

@Injectable({
  providedIn: 'root'
})
export class ServiceProductService {
  product1: any;

  constructor(private http: HttpClient) { }

  getProducts(): any {
    return this.http.get<any>('http://localhost:8080/api/v3/product');
  }

  getProduct1(): any {
    return this.http.get<any>('http://localhost:8080/api/v3/1');
  }

  getProduct2(): any {
    return this.http.get<any>('http://localhost:8080/api/v3/2');
  }

  getProduct3(): any {
    return this.http.get<any>('http://localhost:8080/api/v3/3');
  } 
}
