import java.util.Scanner;

public class Exercise4 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter an integer: ");
		int bounds = console.nextInt();
		
		int total = 1;
		for (int i=bounds; i>1; i--) {
			total *= i;
		}
		System.out.println(bounds + "! = " + total);
	}

}