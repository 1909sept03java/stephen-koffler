import { BrowserModule } from "@angular/platform-browser";
import { NgModule } from "@angular/core";
import { StudentService } from "./student.service";
import { AppComponent } from "./app.component";
import { StudentListComponent } from "./student-list/student-list.component";
import { HttpClientModule } from "@angular/common/http";
import { StudentFullListComponent } from "./student-full-list/student-full-list.component";
import { DummyWummyListComponent } from "./dummy-wummy-list/dummy-wummy-list.component";
import { RouterModule } from "@angular/router";
import { FormsModule } from "@angular/forms";

@NgModule({
  declarations: [
    AppComponent,
    StudentListComponent,
    StudentFullListComponent,
    DummyWummyListComponent
  ],
  imports: [
    BrowserModule,
    HttpClientModule,
    FormsModule,
    /*
      xyz.com/ ---> HomeComponent
      xyz.com/about ---> AboutComponent
    */
    RouterModule.forRoot([
      { path: "", component: StudentListComponent, pathMatch: "full" },
      { path: "full", component: StudentFullListComponent },
      {
        path: "student/:id",
        loadChildren: () =>
          import("./student/student.module").then(m => m.StudentModule)
      }
    ])
  ],
  providers: [StudentService],
  bootstrap: [AppComponent]
})
export class AppModule {}
