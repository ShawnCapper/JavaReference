package basics;
import java.util.Scanner;

public class ModifyingPrimitives {
	public static void main(String[] args) {
		//Boolean (true/false value)
		boolean playAgain = true;
		
		do {
			/*
			 * To modify primitives at runtime, a scanner can be used to get an input from the console from the user
			 * Declare a variable and get user input for that variable that can be called to later on
			 * Remember to close the scanner once done using it to prevent a resource spill
			 */
			
			//String
			Scanner userInput = new Scanner(System.in);
			System.out.print("Hello, uhm what's your name? ");
			String userName = userInput.nextLine();
			System.out.println("Oh right, hello " + userName);
			
			//Addition
			
			//Subtraction
	        System.out.print("This is kind of akward for me to ask all the questions, but, what's your age? ");
	        byte inputAge = (byte) userInput.nextInt();
	        
	        if(inputAge > 17) {
	        	byte age = (byte) (inputAge - 17);
	        	System.out.println("You are " + age + " years older than me");
	        }
	        else if(inputAge == 17) {
	        	System.out.println("You are the same age as me");
	        }
	        else {
	        	byte age = (byte) (17 - inputAge);
	        	System.out.println("You are " + age + " years younger than me");
	        }
	        
			//Multiplication
			
			//Division
	        
	        //Modify boolean
	        System.out.println("Would you like to play again?");
			String replay = userInput.nextLine();
			if(replay.equalsIgnoreCase("yes")) {
			}
			

	        //Close Scanner
	        userInput.close();
			
		}while(playAgain = true);
	}

}
