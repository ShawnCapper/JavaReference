package recursion;
import java.util.Scanner;

public class SimpleSample {
	/*
	 * Sample factorial calculator using recursion
	 */
	
	public static void main(String[] args) { //args = a parameter existing only in this scope
		
		//Prompt user for an input
		Scanner userInput = new Scanner(System.in);
		System.out.print("Enter any number: ");
		String number = userInput.nextLine();
		int n = Integer.parseInt(number);
		
		//Output the number after line 21 recursion method ends
		System.out.println("Factorial of " + n + " equals " + factorial(n)); //calls factorial method and sends n to it
		userInput.close();
	}
	public static long factorial(long n) {
		if (n == 1) //base case
			return 1;
		return n*factorial(n-1); //recursive case
	}
}
