package constructor_Ex;

public class Constructor_002 {

	// Parameterized Constructor
	public Constructor_002(int d, int f, double h, String s, char c) {
		System.out.println("Value of d:- "+ d);
		System.out.println("Value of f:- "+ f);
		System.out.println("Value of h:- "+ h);
		System.out.println(s);
		System.out.println(c);
		
	}
	
	public static void main(String[] args) {
		Constructor_002 c2 = new Constructor_002(2, 3, 56.90, "ab", 'r');
		

	}

}
