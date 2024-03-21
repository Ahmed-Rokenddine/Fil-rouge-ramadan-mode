import {Component, OnInit} from '@angular/core';
import {Hospitals} from "../../../Models/Hospitals/hospitals";
import {HospitalsService} from "../../../Services/hospitals/hospitals.service";


@Component({
  selector: 'app-hospitals',
  templateUrl: './hospitals.component.html',
  styleUrls: ['./hospitals.component.css']
})
export class HospitalsComponent implements OnInit{
  hospitals: Hospitals[] = [];
  searchQuery: string = '';

  constructor(private service: HospitalsService) {
  }

  ngOnInit() {
    this.getHospitals();
  }


  private getHospitals() {
    this.service.gethospitals()
      .subscribe({
        // @ts-ignore
        next: (response: HttpResponse<Hospitals[]>) => {
          this.hospitals = response.body;
          console.log(response.body);
        },
        error: (err) => {
          console.error(err);
        }
      });
  }

}
