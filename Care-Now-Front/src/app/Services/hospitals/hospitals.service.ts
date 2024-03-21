import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class HospitalsService {

  constructor(private http: HttpClient) { }

  public gethospitals(){
    return this.http.get(`http://localhost:8080/api/v1/hopitaux`, { observe: 'response' });
  }

  public gethospitalById(id: number){
    return this.http.get(`http://localhost:8080/api/v1/hopitaux/${id}`);
  }

  public createhospital(hospital: any){
    return this.http.post(`http://localhost:8080/api/v1/hopitaux/create`, hospital);
  }

  public deletehospital(id: number){
    return this.http.delete(`http://localhost:8080/api/v1/hopitaux/${id}`);
  }
}
