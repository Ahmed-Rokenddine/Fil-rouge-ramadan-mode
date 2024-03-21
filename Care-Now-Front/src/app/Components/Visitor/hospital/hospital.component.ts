import {Component, OnInit} from '@angular/core';
import {ActivatedRoute} from "@angular/router";
import {HospitalsService} from "../../../Services/hospitals/hospitals.service";

@Component({
  selector: 'app-hospital',
  templateUrl: './hospital.component.html',
  styleUrls: ['./hospital.component.css']
})
export class HospitalComponent implements OnInit{

  Hospital: any;
  Doctors: any;

  constructor(
    private service: HospitalsService,
    private route: ActivatedRoute,
  ) {
  }

  ngOnInit() {
    const hospitalId = this.route.snapshot.paramMap.get('id');

    if (hospitalId !== null) {
      // Fetch the hospital by ID
      this.service.gethospitalById(+hospitalId).subscribe((data) => {
        this.Hospital = data;
      });
    }
  }

}
