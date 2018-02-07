import java.util.Scanner;
public class Assignment3 {
	public static void main(String []args) {
		Scanner keyboard = new Scanner(System.in);
		System.out.println("Enter any three digit integer");
		String input = keyboard.next();
		String s1 = input.substring(0,1);
		String s2 = input.substring(2);
		if (s1.equals(s2)) {
			System.out.println(input + " is a palindrome");
		} else {
			System.out.println(input + " is not a palindrome");
		}
	}
}

