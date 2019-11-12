import { Component } from '@angular/core';
import { HttpResponse } from '@angular/common/http';
import 'rxjs/operator/map';
import { HttpClient } from 'selenium-webdriver/http';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'my-new-project';
  private apiUrl = 'http://localhost:8080/people';
  data: any = {};

  constructor(private http: HttpClient) {
    console.log('Hello fellow user');
    this.getPeople();
  }
  getPeople() {
    return this.http.(this.apiUrl)
      .map((res: Response) => res.json)
  }
}

