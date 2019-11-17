import { Injectable } from "@angular/core";
import { HttpClient, HttpHeaders } from "@angular/common/http";
import { Observable } from "rxjs";
import { IStudent } from "./student"; //in order to make Observable return type <IStudent> in getStudents()

@Injectable()
export class StudentService {
  private _url: string = "http://localhost:8083/student/all";
  private _addStudentUrl: string = "http://localhost:8083/student/add";

  /*httpOptions = {
    headers: new HttpHeaders({
      'Access-Control-Allow-Origin': '*'
    })
  };*/

  constructor(private http: HttpClient) {}

  getStudents(): Observable<IStudent[]> {
    console.log(this._url);
    return this.http.get(this._url) as Observable<IStudent[]>;
  }

  addStudent(student) {
    return this.http.post(this._addStudentUrl, student);
  }
}
