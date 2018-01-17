
public class WriteSquares {

	public static void main(String[] args) {
		//writeSquaresIterative();
		//writeSquaresLoop2();
		test();
	}
	
	public static void writeSquaresIterative() {
		System.out.println(1 + " squared = " + (1 * 1));
		System.out.println(2 + " squared = " + (2 * 2));
		System.out.println(3 + " squared = " + (3 * 3));
		System.out.println(4 + " squared = " + (4 * 4));
		System.out.println(5 + " squared = " + (5 * 5));
	}
	
	public static void writeSquaresLoop2() {
		for (int i=1; i<=5; i++) {
			System.out.println(i + " squared = " + (i*i));
		}
	}
	
	public static void writeSquaresLoop() {
		for (int i=1; i<=10; i++) {
			System.out.println(i + " squared = " + (i * i));
		}
	}
	
	public static void test() {
		
		System.out.print(2 - 4 * 3 + 7);



	}

}
