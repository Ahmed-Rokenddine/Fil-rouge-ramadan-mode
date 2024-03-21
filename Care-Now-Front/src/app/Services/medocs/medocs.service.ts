import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class MedocsService {
  constructor(private http: HttpClient) { }

  public getmedocs(){
    return this.http.get(`http://localhost:8080/api/v1/Medocs`, { observe: 'response' });
  }

  public getmedocById(id: number){
    return this.http.get(`http://localhost:8080/api/v1/Medocs/${id}`);
  }

  public createmedoc(medoc: any){
    return this.http.post(`http://localhost:8080/api/v1/Medocs/create`, medoc);
  }

  public deletemedoc(id: number){
    return this.http.delete(`http://localhost:8080/api/v1/Medocs/${id}`);
  }
}
