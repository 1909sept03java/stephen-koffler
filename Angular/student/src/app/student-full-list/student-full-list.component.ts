import { Component, OnInit } from "@angular/core";
import { StudentService } from "../student.service";
import { IStudent } from "../student";

@Component({
  selector: "student-full-list",
  template: `
    <h2>Student Full List</h2>
    <a [routerLink]="['/']"> Home</a>
    <p *ngIf="loading">Loading</p>
    <ul>
      <li *ngFor="let student of students">
        {{ student.id }} - {{ student.lname }}, {{ student.fname }}
      </li>
    </ul>
  `,
  styles: []
})
export class StudentFullListComponent implements OnInit {
  public students: Array<IStudent> = [];
  loading = false; /*this is just to show a message if the data takes a while to display*/
  constructor(private _studentService: StudentService) {}

  ngOnInit() {
    this.loading = true;
    this._studentService.getStudents().subscribe((data: any) => {
      this.loading = false;
      this.students = data;
    });
  }
}
