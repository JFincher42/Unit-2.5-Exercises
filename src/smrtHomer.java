
public class smrtHomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//smrtHomerIterative();
		smrtHomerBetter();
	}
	
	public static void smrtHomerIterative() {
		System.out.println("Homer says:");
		System.out.println("I am so smart.");
		System.out.println("I am so smart.");
		System.out.println("I am so smart.");
		System.out.println("I am so smart.");
		System.out.println("S-M-R-T.  I mean S-M-A-R-R-T.");
	}
	
	public static void smrtHomerBetter() {
		System.out.println("Homer says:");
		for (int i = 1; i <= 4; i = i + 1) {
			System.out.println("I am so smart.");
		}
		System.out.println("S-M-R-T.  I mean S-M-A-R-R-T.");
	}
}
