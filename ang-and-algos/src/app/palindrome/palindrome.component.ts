import { Component, OnInit } from '@angular/core';
import { NgForOf } from '@angular/common';

@Component({
  selector: 'app-palindrome',
  templateUrl: './palindrome.component.html',
  styleUrls: ['./palindrome.component.css']
})
export class PalindromeComponent implements OnInit {
  message: string = "tat";
  str1: string = "";
  a: number = 0;



  constructor() { }

  ngOnInit() {
  }
  addTwoNumbers(a: number, b: number) {
    return a + b;
  }
  isPalindrome(str: string): boolean {
    this.str1 = "";
    console.log(str);
    console.log(this.str1);

    for (this.a = str.length - 1; this.a >= 0; this.a--) {
      this.str1 = this.str1 + str.charAt(this.a);
      console.log(this.str1);

    }


    if (this.str1 == str)
      return true;
    else
      return false;
  }
}
