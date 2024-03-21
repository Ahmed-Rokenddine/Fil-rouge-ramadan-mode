import {Component, OnInit} from '@angular/core';
import {DoctorsService} from "../../../Services/doctors/doctors.service";
import {ActivatedRoute} from "@angular/router";

@Component({
  selector: 'app-doctor',
  templateUrl: './doctor.component.html',
  styleUrls: ['./doctor.component.css']
})
export class DoctorComponent implements OnInit{
  doctor: any;
    constructor(
      private service: DoctorsService,
      private route: ActivatedRoute,
    ) {
    }

    ngOnInit() {
      const doctorId = this.route.snapshot.paramMap.get('id');

      if (doctorId !== null) {
        // Fetch the doctor by ID
        this.service.getdoctorById(+doctorId).subscribe((data) => {
          this.doctor = data;
        });
      }
    }


}
