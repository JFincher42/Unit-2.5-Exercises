import java.util.Scanner;

public class Exercise3 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("How many numbers should I add? ");
		int bounds = console.nextInt();
		System.out.print("Enter your number: ");
		
		int total = 0;
		for (int i=0; i<bounds; i++) {
			int num = console.nextInt();
			total += num;
		}
		System.out.println("The sum from 1 to " + bounds + " is " + total);
	}

}
