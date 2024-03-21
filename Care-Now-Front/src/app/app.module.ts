import { NgModule } from '@angular/core';
import { BrowserModule } from '@angular/platform-browser';

import { AppComponent } from './app.component';
import { NavbarComponent } from './Components/navigation/navbar/navbar.component';
import { HomeComponent } from './Components/Visitor/home/home.component';
import { AppRoutingModule } from './app-routing.module';
import { SupportComponent } from './Components/Visitor/support/support.component';
import {FormsModule, ReactiveFormsModule} from "@angular/forms";
import { LoginComponent } from './Components/Visitor/login/login.component';

import { DoctorsComponent } from './Components/Visitor/doctors/doctors.component';
import { HospitalsComponent } from './Components/Visitor/hospitals/hospitals.component';
import { HospitalComponent } from './Components/Visitor/hospital/hospital.component';
import { DoctorComponent } from './Components/Visitor/doctor/doctor.component';
import { AdminComponent } from './Components/A-dmin/admin/admin.component';
import { AdminNavbarComponent } from './Components/navigation/admin-navbar/admin-navbar.component';
import { AdminHospitalsComponent } from './Components/A-dmin/admin-hospitals/admin-hospitals.component';
import { AdminDoctorsComponent } from './Components/A-dmin/admin-doctors/admin-doctors.component';
import { FontAwesomeModule } from '@fortawesome/angular-fontawesome';
import {HttpClientModule} from "@angular/common/http";
import {FilterPipe} from "./Services/Filter/FilterPipe";
import { FooterComponent } from './Components/navigation/footer/footer.component';
import { MedocsComponent } from './Components/User-Logged/medocs/medocs.component';
import { PharmacyComponent } from './Components/User-Logged/pharmacy/pharmacy.component';
import { AdminMedsComponent } from './Components/A-dmin/admin-meds/admin-meds.component';
import { AdminPharmaciesCrudComponent } from './Components/A-dmin/admin-pharmacies-crud/admin-pharmacies-crud.component';
import { AdminPharmaciesActiveComponent } from './Components/A-dmin/admin-pharmacies-active/admin-pharmacies-active.component';


@NgModule({
  declarations: [
    AppComponent,
    NavbarComponent,
    HomeComponent,
    SupportComponent,
    LoginComponent,

    DoctorsComponent,
    HospitalsComponent,
    HospitalComponent,
    DoctorComponent,
    AdminComponent,
    AdminNavbarComponent,
    AdminHospitalsComponent,
    AdminDoctorsComponent,
    FilterPipe,
    FooterComponent,
    MedocsComponent,
    PharmacyComponent,
    AdminMedsComponent,
    AdminPharmaciesCrudComponent,
    AdminPharmaciesActiveComponent
  ],
    imports: [
        BrowserModule,
        AppRoutingModule,
        FormsModule,
        FontAwesomeModule,
        HttpClientModule,
        ReactiveFormsModule,

    ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
