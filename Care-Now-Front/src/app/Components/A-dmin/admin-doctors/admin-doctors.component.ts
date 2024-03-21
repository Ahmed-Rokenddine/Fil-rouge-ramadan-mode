import {Component, OnInit} from '@angular/core';
import {DoctorsService} from "../../../Services/doctors/doctors.service";
import {Doctors} from "../../../Models/Doctors/doctors";
import {FormBuilder, FormGroup, Validators} from "@angular/forms";

@Component({
  selector: 'app-admin-doctors',
  templateUrl: './admin-doctors.component.html',
  styleUrls: ['./admin-doctors.component.css']
})
export class AdminDoctorsComponent implements OnInit{
  doctors: Doctors[] = [];
  showForm = false;

  doctorForm: FormGroup = this.fb.group({
    nom: ['', Validators.required],
    specialite: ['', Validators.required],
    image: ['', Validators.required],
    telephone: ['', Validators.required],
  });

    constructor( private service: DoctorsService,
                 private fb: FormBuilder
    ) {}



    ngOnInit() {
      this.getDoctors();

      this.doctorForm = this.fb.group({
        nom: ['', Validators.required],
        specialite: ['', Validators.required],
        image: ['', Validators.required],
        telephone: ['', Validators.required],
      });

    }

    addDoctor() {
      this.showForm = true;
    }

    onSubmit() {
      const newDoctor = this.doctorForm.value;
      console.log('Form:', newDoctor);

      this.service.createdoctor(newDoctor).subscribe(
        (response: any) => {
          console.log('Response:', response);
          this.getDoctors();
        },
        (error) => {
          console.error('Error:', error);
        }
      );
      this.doctorForm.reset();
      this.showForm = false;
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
  //deleteDoctor
  deleteDoctor(id: number) {
    this.service.deletedoctor(id).subscribe(
      (response: any) => {
        console.log('Response:', response);
        this.getDoctors();
      },
      (error) => {
        console.error('Error:', error);
      }
    );
  }



}
