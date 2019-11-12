import { Component, OnInit } from '@angular/core';
import { Router,Route } from '@angular/router';
import { JsonPipe } from '@angular/common';
import { HttpClient, HttpHeaders } from '@angular/common/http';


@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  constructor(    private router: Router,private http: HttpClient
                  ) { }
 
  ngOnInit(){

    document.getElementById("clickMe").addEventListener('click',()=>{

     // document.getElementById("inout").style.display="none";
      this.router.navigateByUrl("/register");
    })
    document.getElementById("login").addEventListener('click', () => 
    {
      var userbox = <HTMLInputElement>document.getElementsByClassName("u")[0];
      var passbox = <HTMLInputElement>document.getElementsByClassName("p")[0];
      console.log(userbox.value);
      console.log(passbox.value);
      console.log("logg");
      var url = 'http://localhost:8082/LibraryWebSystem/libr/login';
  
      // The parameters we are gonna pass to the fetch function
  
       var body = {
         "username": userbox.value,
         "password": passbox.value
       }
       var httpOptions = {
        headers: new HttpHeaders({
          'Content-type' : 'application/json'
        })
       };
      this.http.post(url,body,httpOptions).subscribe(res=>{
        
        sessionStorage.setItem('user',JSON.stringify(res));
        console.log(res);
        this.router.navigateByUrl("/profile");
      });
       
      
/*
       const http = new XMLHttpRequest();
       http.open('POST',url,true);
      // http.setRequestHeader('Content-type', 'application/x-www-form-urlencoded');
       http.setRequestHeader('Content-type', 'application/json');
       http.onreadystatechange   = () =>{
        if(http.readyState == 4 && http.status == 200) {
          let value = http.responseText;
  
          sessionStorage.setItem('user',value);
          console.log(sessionStorage.getItem('user'));
        //  document.getElementById("inout").style.display="none";
          this.router.navigateByUrl("/profile");
            }
          }
      http.send(JSON.stringify(body));*/
    })
  }

  
}
