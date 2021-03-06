import { Injectable } from '@angular/core';
import { HttpClient, HttpHeaders } from '@angular/common/http';
import { IEmployee } from './employee';
import { Observable } from 'rxjs/Observable';



@Injectable()
export class EmployeeService {

  private _url: string = "http://localhost:8083/student/all";
  httpOptions = {
    headers: new HttpHeaders({
      'Access-Control-Allow-Origin': '*'
    })
  };

  constructor(private http: HttpClient) { }

  getEmployees() {
    console.log(this._url);
    return this.http.get(this._url, this.httpOptions);

  }
}
