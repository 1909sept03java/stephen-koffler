package com.revature.hw1.prob14;

public class SwitchCase {

	public static void main(String[] args) {
		int choice = 2;
		
		switch(choice) {
		case 1:
			System.out.println(Math.sqrt(4));
			break;
		case 2:
			System.out.println(java.time.LocalDate.now());  
			break;
		case 3:
			String str = "I am learning Core Java";
			str.split(str);
			break;
		default:
			System.out.println("did you choose 1, 2, or 3?");
			break;
			
			
		}

	}
   /* public static void main(String[] args) 
    { 
        int day = 5; 
        String dayString; 
  
        // switch statement with int data type 
        switch (day) { 
        case 1: 
            dayString = "Monday"; 
            break; 
        case 2: 
            dayString = "Tuesday"; 
            break; 
        case 3: 
            dayString = "Wednesday"; 
            break; 
        case 4: 
            dayString = "Thursday"; 
            break; 
        case 5: 
            dayString = "Friday"; 
            break; 
        case 6: 
            dayString = "Saturday"; 
            break; 
        case 7: 
            dayString = "Sunday"; 
            break; 
        default: 
            dayString = "Invalid day"; 
            break; 
        } 
        System.out.println(dayString); 
    } */
}
