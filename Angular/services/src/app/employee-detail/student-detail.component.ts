import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';

@Component({
  selector: 'student-detail',
  template: `
  <h2>Student Detail</h2>
    <ul *ngFor="let student of employees">
      <li>{{student.id}}. {{student.name}} - {{student.age}}</li>
      </ul>"
  `
  ,
  styles: []
})
export class StudentDetailComponent implements OnInit {

  public employees = [];

  constructor(private _employeeService: StudentService) { }

  ngOnInit() {
    this._employeeService.getStudents()
      .subscribe(data => console.log(data));
  }

}
