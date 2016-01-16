import java.util.Scanner;

public class GreatestCommonDivisor {
	public static void main(String[] args) {
		
	// Creating a new object from Scanner
		Scanner scan = new Scanner(System.in);
	
	// Getting the users input
		System.out.println("Enter a number: ");
		int value1 = scan.nextInt();
		
		System.out.println("Enter another number: ");
		int value2 = scan.nextInt();

	// Printing the GCD
		System.out.println("The greatest common divisor of " + value1 + " and " + value2 + " is: " + getGCD(value1,value2));
		
	} // End of main method
	
// Method to calculate the greatest common divisor.
	static int getGCD(int value1, int value2) {
		
		if (value1 == 0 || value2 == 0) return value1 + value2; {
			return getGCD(value2,value1%value2);
		} 
		
	} // End of getGCD

} // End of class header
