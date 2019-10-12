package main.revature.simplebank;
import java.util.Scanner;
class Login {

	static Scanner scanner = new Scanner(System.in);
	
	
	//Method for registered users to input their login creds.
	public static void RegisteredLogin() {
		String username;
		String password;
		System.out.println("Please enter your user name:");
		username = scanner.nextLine();
		System.out.println("Please enter your password: ");
		password = scanner.nextLine();
		//check if password matches username on ACCT_OWNER
		//check if password matches password on ACCT_OWNER
		
	}
	//method for unregistered account holders to register a username
	public static void RegisterUserName() throws InvalidInputException {
		String username = null;
		System.out.println("If you have an account with our bank, you can "
				+ "sign up for this on-line system");
		System.out.println("choose a user name between 5 - 10 characters: ");
		username = scanner.nextLine();
		
		if (username.length() < 5 || username.length() > 10)
			throw new InvalidInputException("Invalid");
		else
		{
			System.out.println("Your username is valid");
			}
		}
	//method for unregistered account holders to register a password
	public static void RegisterPassword() throws InvalidInputException {
		String password = null;
		System.out.println("Please create a password of 4 - 8 characters ");
		password = scanner.nextLine();
		if (password.length() < 4 || password.length() > 8)
			throw new InvalidInputException("Invalid");
		else
		{
			System.out.println("Your password is valid");
			}
		
	}

	//main method asks if the user is registered on the system or not then calls
	//appropriate functions.
	public static void main(String[] args) {
		int registered;
		System.out.println("Do you already have username "
				+ "and password on this system? 1 for yes, 2 for no");
		registered = scanner.nextInt();
		if (registered == 2) {
		try {
			RegisterUserName();
		} catch (InvalidInputException e) {
			System.out.println("Invalid. User name must be 5 - 10 characters. Try again");
			try {
				RegisterUserName();
			} catch (InvalidInputException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
		try {
			RegisterPassword();
		} catch (InvalidInputException e) {
			System.out.println("Invalid. Password must be 4 - 8 characters. Try again");
			try {
				RegisterPassword();
			} catch (InvalidInputException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
	}else
		RegisteredLogin();
	}
	
}//custom exception class to check lenght of new usernames and passwords.
class InvalidInputException extends Exception{
	InvalidInputException(String message) {
		super(message);
		{	
	}
}
}
