import {Component, OnInit} from '@angular/core';
import {Hospitals} from "../../../Models/Hospitals/hospitals";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";
import {HospitalsService} from "../../../Services/hospitals/hospitals.service";

@Component({
  selector: 'app-admin-hospitals',
  templateUrl: './admin-hospitals.component.html',
  styleUrls: ['./admin-hospitals.component.css']
})
export class AdminHospitalsComponent  implements OnInit{
  hospitals: Hospitals[] = [];
  showForm = false;

  hospitalForm: FormGroup = this.fb.group({
    nom: ['', Validators.required],
    adresse: ['', Validators.required],
    image: ['', Validators.required],
    telephone: ['', Validators.required],
  });


  constructor( private service: HospitalsService,
               private fb:FormBuilder) {}

  ngOnInit() {
    this.getHospitals();

    this.hospitalForm = this.fb.group({
      nom: ['', Validators.required],
      adresse: ['', Validators.required],
      image: ['', Validators.required],
      telephone: ['', Validators.required],
    });
  }

  addHospital() {
    this.showForm = true;
  }

  onSubmit() {
    const newHospital = this.hospitalForm.value;
    console.log('Form:', newHospital);

    this.service.createhospital(newHospital).subscribe(
      (response: any) => {
        console.log('Response:', response);
        this.getHospitals();
      },
      (error) => {
        console.error('Error:', error);
      }
    );
    this.hospitalForm.reset();
    this.showForm = false;
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

  //deletehospital
  deletehospital(id: number) {
    this.service.deletehospital(id).subscribe(
      (response: any) => {
        console.log('Response:', response);
        this.getHospitals();
      },
      (error) => {
        console.error('Error:', error);
      }
    );
  }


}
