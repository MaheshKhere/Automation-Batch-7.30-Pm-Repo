package collection;

import java.util.ArrayList;

public class ArrayList_001 {

	public static void main(String[] args) {

		ArrayList<Integer> rollno = new ArrayList<Integer>();

		// Add Values
		rollno.add(1);
		rollno.add(2);
		rollno.add(3);
		rollno.add(40);

		// Add value with respect to index
		rollno.add(4, 5);
		rollno.add(null);
		rollno.add(100);

		// To print all values
		System.out.println("Values of Arraylist is:- " + rollno);

		// To get value with respect to index
		System.out.println(rollno.get(0));
		System.out.println(rollno.get(5));

		// Remove one value
		//rollno.remove(4);
		//rollno.remove(2);
		
		// To search any value
		System.out.println(rollno.contains(400));
		
		// check for list empty or not
		System.out.println(rollno.isEmpty());
		
		//Create copy for list
		System.out.println(rollno.clone());
		
		//System.out.println("Values of Arraylist is:- " + rollno);
	}

}
