package basics;

public class PrimitiveDataTypes {
	public static void main(String[] args) {
		/*
		 * Words/Characters
		 */
		//Create a string variable called hello
		//Strings hold an entire "string" of letters and special characters, these can be used to create words/sentences/etc.
		String hello = "Hi there!";
		//char variables hold 1 character such as a letter or special character (!@#%)
		//char variables, unlike strings, they use single quotes
		char favoriteLetter = 'S';
		
		/*
		 * Numbers
		 */
		//The smallest number type allowing whole numbers ranging from -128 to 127
		//1 byte size
		byte linesOfCode = 56;
		//A short allows whole numbers ranging from -32,768 to 32,767
		//2 bytes size
		short currentYear = 2022;
		//Most commonly used to store numbers, allows whole numbers ranging from -2,147,483,648 to 2,147,483,647
		//4 bytes size
		int furthestDigged = -12262;
		//The longest whole number only data type, allows whole numbers ranging from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
		//8 bytes size
		long earthSurfaceArea = 510100000;
		//float - a floating-point number which stores a decimal value with 6 digits of precision
		float conversionRate = 1.3266441f;
		//double - a floating-point number which stores decimal values with 15 digits of precision
		double doubleEx = 1.192648552817245;
		
		/*
		 * Others
		 */
		//boolean - stores either a true or false value
		boolean isRunning = true;
		
		/*
		 * Example output
		 */
		if (isRunning == true) {
			System.out.println(hello);
			System.out.println("My favorite letter is " + favoriteLetter);
			System.out.print("This program takes up " + linesOfCode + " lines of code,");
			System.out.print(" and was completed in the year " + currentYear);
			System.out.println("\nAs of now, the furthest underground that humans have digged is " + furthestDigged + " m");
			System.out.println("A quick fact to leave you with is the surface area of Earth is " + earthSurfaceArea + " km^2");
			System.out.println("As of the date of publishing, the conversion rate of 1USD equals " + conversionRate + "CAD");
			System.out.println("A double allows for 15 digits of decimal percision, here's an example: " + doubleEx);
		}
	}
}
