import java.util.Scanner;

public class Exercise1 {

	public static void main(String[] args) {
		Scanner console = new Scanner(System.in);
		
		System.out.print("Enter a string to print: ");
		String userString = console.nextLine();
		
		System.out.print("How many times? ");
		int count = console.nextInt();
		
		for (int i=1; i<=count; i++) {
			System.out.println(userString);
		}
	}

}
