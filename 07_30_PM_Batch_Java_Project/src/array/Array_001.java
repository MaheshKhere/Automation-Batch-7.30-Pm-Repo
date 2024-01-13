package array;

public class Array_001 {

	public static void main(String[] args) {

		// Single Dimensional Array

		int[] marks = new int[6];
		// To add value

		marks[0] = 23;
		marks[1] = 70;
		marks[2] = 90;
		marks[3] = 95;
		marks[4] = 100;
		marks[5] = 90;

		// To get length of array
		System.out.println("The length of Array is:- " + marks.length);

		// to print one value
		// System.out.println(marks[2]);

		// To Print All values of Array-Using for loop

		for (int i = 0; i < 6; i++) {
			System.out.println(marks[i]);
		}

		// Print all values using for each loop

		for (int y : marks) {
			System.out.println(y);
		}

	}

}
