package loops_Examples;

public class Class_004 {

	public static void main(String[] args) {
		// do while loop
		short s= 0;
		do { 
			System.out.println(s);
			s++;
		} while(s<=10);

		
		// Print even numbers from  0 to 100 
		int x = 0;
		do {
			if (x % 2!=0) {
				System.out.println(x);
			}
			x++;
		}while(x<=100);
		
	}

}
