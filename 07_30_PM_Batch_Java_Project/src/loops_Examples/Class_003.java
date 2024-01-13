package loops_Examples;

public class Class_003 {

	public static void main(String[] args) {
		// While loop
		
		double d = 0.0;
		while (d<=10) {
			System.out.println(d);
			d++;
		}
		
		// Print 10 to 0
		
//		int x = 10;
//		while (x >= 0) {
//			System.out.println("The value of x is :- " + x);
//			x--;
//		}
		
		// Print odd number from 0 to 100  
		int i = 0;
		while (i<=100) {
			if (i % 2 != 0) {
				System.out.println("Your Odd Value is:- "+ i);
			}
			i++; 
		}
		
	}

}
