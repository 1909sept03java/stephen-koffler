import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-test',
  template: `
  <h2>
     {{greetUser()}}
    
     </h2>((
     <!-- this button logs input to the console on click using templage reference vars (see function
      definition in class below for logMessage(value)) use # to create the ref var followed by 
      varname
      <input #myInput type="text">
      <button (click)="logMessage(myInput.value)">Log</button>
      -->

    <!-- this were examples of event binding. You can get all the info about the event in the console
    or in the view by using $event as a a parameter to the function. What to do on click can also
    bet defined statically in-line as in the second button.
    
    <button (click)="onClick($event)">Greet</button>
    <button (click)="greeting='Welcome Vishwas'">Greet</button>

     {{greeting}} -->
  
    
    `
  ,
  styles: []
})
export class TestComponent implements OnInit {


  public name = "Stephen";
  public greeting = "";


  constructor() { }

  ngOnInit() {

  }

  logMessage(value) {
    console.log(value);
  }
  onClick() {
    console.log('Welcome to Codevolution')
    this.greeting = 'event.type';
  }

  greetUser() {
    return "Hello " + this.name;
  }


}
