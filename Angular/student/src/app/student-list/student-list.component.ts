import { Component, OnInit } from "@angular/core";
import { StudentService } from "../student.service";
import { IStudent } from "../student";

@Component({
  selector: "student-list",
  templateUrl: "./student-list.component.html",
  styles: []
})
export class StudentListComponent implements OnInit {
  public students: Array<IStudent> = [];
  loading = false;
  newStudent: IStudent = { id: 50, fname: "joe", lname: "mama" };

  constructor(private _studentService: StudentService) {}

  submit() {
    console.log(this.newStudent);
    this._studentService.addStudent(this.newStudent).subscribe(() => {
      this.students.push(this.newStudent);
    });
  }

  ngOnInit() {
    this.loading = true;
    this._studentService.getStudents().subscribe(data => {
      this.loading = false;
      this.students = data;
    });
  }
}
