package recursion;

public class TowersOfHanoi_Sample {
	
	public static void main(String args[]) {
		//Set the number of disks on the starting rod by defining variable n (only works for numbers between 1 and 2147483647(in theory))
		int n = 3;
		towerOfHanoi(n, 'A', 'C', 'B');
	}
	
	/**
	 * @param n - total number of disks
	 * @param src - rod 1 (starting rod / A)
	 * @param dst - rod 2 (middle rod / B)
	 * @param aux - rod 3 (auxiliary (end) rod / C)
	 */
	public static void towerOfHanoi(int n, char src, char dst, char aux) {
		//Base case
		//Once n equals 0, exit the program
		if (n == 0) {
			return;
			}
		
		//Recursive case
		towerOfHanoi (n - 1, src, aux, dst);
		//Tail recursion - prints the instructions for the solution to the console
		System.out.println("Move disk " + n + " from rod " + src + " to rod " + dst);
		towerOfHanoi (n - 1, aux, dst, src);
	}
}
