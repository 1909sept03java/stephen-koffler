import { Component,OnInit } from '@angular/core';
import { RouterModule, Router , ActivatedRoute, ParamMap} from '@angular/router';
import { HttpClient,HttpErrorResponse } from '@angular/common/http'
@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})

export class AppComponent implements OnInit{
  title = 'y';

   body = {
    "username": "userbox.value",
    "password": "passbox.value"
  };

constructor(
    private route: ActivatedRoute,
    private router: Router,
    private http: HttpClient
  ) {


  }
  ngOnInit(){
//    document.getElementById("inout").style.display="block";
  }
  


}
