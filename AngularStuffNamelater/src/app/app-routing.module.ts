import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import {LoginComponent} from './login/login.component';
import { HerosComponent } from './heros/heros.component';
import {RegisterComponent} from './register/register.component';
import {ProfileComponent} from './profile/profile.component';
const appRoutes: Routes = [
  { path: 'login', component: LoginComponent },
  { path: 'heroes', component: HerosComponent },
  { path: 'register', component: RegisterComponent},
  { path: 'profile', component: ProfileComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(appRoutes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
