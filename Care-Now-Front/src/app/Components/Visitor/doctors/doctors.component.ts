import {Component, OnInit} from '@angular/core';
import {Doctors} from "../../../Models/Doctors/doctors";
import {DoctorsService} from "../../../Services/doctors/doctors.service";
import {filter} from "rxjs";

@Component({
  selector: 'app-doctors',
  templateUrl: './doctors.component.html',
  styleUrls: ['./doctors.component.css']
})
export class DoctorsComponent implements OnInit{
  searchQuery: string = '';

  doctors: Doctors[] = [];

    constructor(private service: DoctorsService) {
    }

    ngOnInit() {
      this.getDoctors();
    }


  private getDoctors() {
    this.service.getdoctors()
      .subscribe({
        // @ts-ignore
        next: (response: HttpResponse<Doctors[]>) => {
          this.doctors = response.body;
          console.log(response.body);
        },
        error: (err) => {
          console.error(err);
        }
      });
  }

  protected readonly filter = filter;
}
