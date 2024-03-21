import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import {HomeComponent} from "./Components/Visitor/home/home.component";
import {RouterModule, Routes} from "@angular/router";
import {SupportComponent} from "./Components/Visitor/support/support.component";
import {DoctorsComponent} from "./Components/Visitor/doctors/doctors.component";
import {HospitalsComponent} from "./Components/Visitor/hospitals/hospitals.component";
import {LoginComponent} from "./Components/Visitor/login/login.component";

import {HospitalComponent} from "./Components/Visitor/hospital/hospital.component";
import {DoctorComponent} from "./Components/Visitor/doctor/doctor.component";
import {AdminComponent} from "./Components/A-dmin/admin/admin.component";
import {AdminHospitalsComponent} from "./Components/A-dmin/admin-hospitals/admin-hospitals.component";
import {AdminDoctorsComponent} from "./Components/A-dmin/admin-doctors/admin-doctors.component";
import {AdminMedsComponent} from "./Components/A-dmin/admin-meds/admin-meds.component";
import {AdminPharmaciesCrudComponent} from "./Components/A-dmin/admin-pharmacies-crud/admin-pharmacies-crud.component";
import {
  AdminPharmaciesActiveComponent
} from "./Components/A-dmin/admin-pharmacies-active/admin-pharmacies-active.component";
import {MedocsComponent} from "./Components/User-Logged/medocs/medocs.component";
import {PharmacyComponent} from "./Components/User-Logged/pharmacy/pharmacy.component";

const routes: Routes = [
  {path:"",redirectTo:"Welcome",pathMatch:"full"},
  {
    path: 'Welcome',
    component: HomeComponent
  },
  {
    path: 'Support',
    component: SupportComponent
  },
  {
    path: 'Doctors',
    component: DoctorsComponent
  },
  {
    path: 'Hospitals',
    component: HospitalsComponent
  },
  {
    path: 'Login',
    component: LoginComponent
  },

  {
    path: 'Hospital/:id',
    component: HospitalComponent
  },
  {
    path: 'Doctor/:id',
    component: DoctorComponent
  },
  {
    path: 'Admin',
    component: AdminComponent
  },
  {
    path: 'AdminHospital',
    component: AdminHospitalsComponent
  },
  {
    path: 'AdminDoctor',
    component: AdminDoctorsComponent
  },
  {
    path: 'Medicaments',
    component: MedocsComponent
  },
  {
    path: 'Pharmacies',
    component: PharmacyComponent
  },
  {
    path: 'AdminMedocs',
    component: AdminMedsComponent
  },
  {
    path: 'Admin-Pharmacie',
    component: AdminPharmaciesCrudComponent },

  {
    path: 'Admin-Pharmacies-enable',
  component: AdminPharmaciesActiveComponent
  }



];


@NgModule({
  declarations: [],
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
