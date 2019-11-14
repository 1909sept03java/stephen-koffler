import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';

@Component({
  selector: 'student-list',
  template: `
    <h2>Student List</h2>
    <ul *ngFor="let student of students">
      <li>{{students.lname}}</li>
      </ul>
      `
  ,
  styles: []
})
export class StudentListComponent implements OnInit {
  public students = [];


  constructor(private _studentService: StudentService) { }

  ngOnInit() {
    this._studentService.getStudents()
      .subscribe(data => console.log(data[0].fname));
  }

}
