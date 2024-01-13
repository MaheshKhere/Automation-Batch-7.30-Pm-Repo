package array;

import java.util.Scanner;

public class Declare_Array_Using_ScannerClass {

	public static void main(String[] args) {
		
		// Declare an array from the user
		// Scanner Class
		Scanner sc = new Scanner(System.in);
		System.out.println("Define Size of Array");
		int size = sc.nextInt();
		
		int [] xy = new int [size];
		
		// add Values- for input values
		System.out.println("Enter Values of Array");
		for (int x=0; x<size; x++) {
			xy [x]= sc.nextInt();
		}
		System.out.println("------------------------------------");
		// To Print Values of array
		System.out.println("Your Array Values is:-");
		
		// For output
		for(int y =0; y<size; y++) {
			System.out.println(xy[y]);
		}

	}

}
