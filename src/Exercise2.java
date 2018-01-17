
public class Exercise2 {

	public static void main(String[] args) {
		for (int i=0; i<4; i++) {
			printArrow();
		}
	}

	public static void printArrow() {
		System.out.println("  *");
		System.out.println(" * *");
		System.out.println("*   *");
	}
	
	public static void test() {
		for (int i = 1; i <= 5; i++) {
			int total = 0;
		   total = total + i;
		}
		System.out.println("sum = " + total);

	}
}
