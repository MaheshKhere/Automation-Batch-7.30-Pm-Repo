package scanner_Class;

import java.util.Scanner;

public class Scanner_003 {

	public static void main(String[] args) {
		
		// Print table of n th from user
		
		Scanner sc = new Scanner( System.in);
		 System.out.println("Enter Any Number");
		 int a = sc.nextInt();
		 System.out.println("enter single character");
		char s = sc.next().charAt(0);
		System.out.println(s);
		
		 System.out.println("Your Number table is:-");
		 for (int i =1; i<=10; i++) {
			 // 2x1 = 2
			 System.out.println(a+ "x" + i + "=" + a*i);
		 }

	}

}
