import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';

import { AppComponent } from './app.component';
import { PalindromeComponent } from './palindrome/palindrome.component';
import { NumberSortComponent } from './number-sort/number-sort.component';

@NgModule({
  declarations: [
    AppComponent,
    PalindromeComponent,
    NumberSortComponent
  ],
  imports: [
    BrowserModule
  ],
  providers: [],
  bootstrap: [AppComponent]
})
export class AppModule { }
