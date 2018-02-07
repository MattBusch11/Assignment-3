import java.util.Scanner;
import java.util.InputMismatchException;
public class Sum {
	private static double sum=0;
	private static double value=1;
	public static double sum() {
		Scanner keyboard = new Scanner(System.in);
		do {
			System.out.println("Enter a number. Enter 0 to execute addition.");
			/*if (!keyboard.hasNextDouble()) {
				throw new InputMismatchException("Invalid Input! Try again.");
			}*/
			
			try {
				value = keyboard.nextDouble();
				sum += value;	
			} catch (InputMismatchException e) {
				e.printStackTrace();
				keyboard.next();
			}
		} while (value!=0);
		System.out.println("The sum is " + sum);
		return sum;
	}
	public static void main(String [] args) {
		Scanner keyboard = new Scanner(System.in);
			sum();

			
	}
}

