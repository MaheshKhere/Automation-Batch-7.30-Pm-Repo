package operators;

public class Logical_Operators {

	public static void main(String[] args) {
		
		int x = 30;
		int y = 20;
		
		// Increment
		//int c = ++x;
		//System.out.println(c);
		//System.out.println(++x);
		
		// Decrement
		//int g = --x;
		System.out.println(--x);
		
		// Logical Not 
		boolean v = !(x < y) ;
		//System.out.println(v);
		//System.out.println(!(x < y ));
		
		// Logical or
		boolean r = (x > 15 || x < 10);
		//System.out.println(r);
		System.out.println((y < 30 || y > 5));
		
		// Logical And
		boolean b = (x < 35 && x > y);
		//System.out.println(b);
		//System.out.println((x < 10 && x > 65));
	}
}
