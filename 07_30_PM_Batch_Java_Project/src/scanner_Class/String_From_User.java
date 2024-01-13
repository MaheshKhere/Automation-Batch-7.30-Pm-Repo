package scanner_Class;

import java.util.Scanner;

public class String_From_User {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter size of Array");
		int size = sc.nextInt();
	
		String s []= new String [size];
		System.out.println("Enter values of Array");
		
		for(int i= 0; i<s.length; i++) {
			s [i]= sc.nextLine();
		}
		
		// output 
		for (int x =0 ; x<s.length; x++) {
			System.out.println(s[x]);
		}
		
	
	
	}

}
