import { Component, OnInit } from '@angular/core';
import {Router} from '@angular/router';
@Component({
  selector: 'app-register',
  templateUrl: './register.component.html',
  styleUrls: ['./register.component.css']
})
export class RegisterComponent implements OnInit {

  constructor(    private router: Router) { }

  ngOnInit() {

  var first = <HTMLInputElement>document.getElementsByName("firstname")[0];
  var last = <HTMLInputElement>document.getElementsByName("lastname")[0];
  var email = <HTMLInputElement>document.getElementsByName("email")[0];
  var us = <HTMLInputElement>document.getElementsByName("username")[0];
  var pw = <HTMLInputElement>document.getElementsByName("password")[0];
    document.getElementById("back").addEventListener('click', ()=>{
      this.router.navigateByUrl("/login");
    })

    document.getElementById("reg").addEventListener('click', ()=>{
      if( first.validity.valid && last.validity.valid && email.validity.valid && us.validity.valid && pw.validity.valid){
        var body = {
          "username": us.value,
          "password": pw.value,
          "firstname": first.value,
          "lastname" : last.value,
          "email" : email.value
        }
        console.log(body);
        var url = 'http://localhost:8082/LibraryWebSystem/libr/register';
        const http = new XMLHttpRequest();
        http.open('POST',url,true);
        http.setRequestHeader('Content-type', 'application/json');
        http.onreadystatechange = ()=> {
        if(http.readyState == 4 && http.status == 200) {
         var out= http.response;
          console.log(out);
            this.router.navigateByUrl("/login");
            }
          }
        http.send(JSON.stringify(body));
     
        alert("Success");

        this.router.navigateByUrl("/login");
      }
      else{
        alert(first.value + "\n" + last.value +"\n"+ email.value  +"\n"+ us.value  +"\n"+pw.value);
      }
    
    } )
  }

}
