import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class DoctorsService {

  constructor(private http: HttpClient) { }

  public getdoctors(){
    return this.http.get(`http://localhost:8080/api/v1/docteurs`, { observe: 'response' });
  }

  public getdoctorById(id: number){
    return this.http.get(`http://localhost:8080/api/v1/docteurs/${id}`);
  }
  public createdoctor(doctor: any){
    return this.http.post(`http://localhost:8080/api/v1/docteurs/create`, doctor);
  }

  public deletedoctor(id: number){
    return this.http.delete(`http://localhost:8080/api/v1/docteurs/${id}`);
  }
}
