package livro.string;

import java.util.Scanner;

public class Validate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		String firstName, lastName;
				
		System.out.println("Please enter first name: ");
		firstName = scanner.nextLine();
		
		System.out.println("Please enter last name: ");
		lastName = scanner.nextLine();
		
		System.out.println("\nValidate Result: ");
		
		if (!validateInput.validateFirstName(firstName)) {
			System.out.println("Invalid first name");
		}
		
		else if (!validateInput.validateLastName(lastName)) {
			System.out.println("Invalid last name");
		}
		else {
			System.out.println("Valid Input. Thank You!");
		}
		
		scanner.close();

	}

}
