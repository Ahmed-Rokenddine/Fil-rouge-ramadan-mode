import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class PharmaciesService {
  constructor(private http: HttpClient) { }

  public getpharmacies(){
    return this.http.get(`http://localhost:8080/api/v1/Pharmacy`, { observe: 'response' });
  }

  public getpharmacieById(id: number){
    return this.http.get(`http://localhost:8080/api/v1/Pharmacy/${id}`);
  }

  public createpharmacie(pharmacie: any){
    return this.http.post(`http://localhost:8080/api/v1/Pharmacy/create`, pharmacie);
  }

  public deletepharmacie(id: number){
    return this.http.delete(`http://localhost:8080/api/v1/Pharmacy/${id}`);
  }
}
