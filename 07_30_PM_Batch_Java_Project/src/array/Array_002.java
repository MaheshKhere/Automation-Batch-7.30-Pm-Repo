package array;

public class Array_002 {

	public static void main(String[] args) {

		String[] ab = new String[6];
		// add values
		ab[0] = "Diksha";
		ab[1] = "Pratiksha";
		ab[2] = "Pranit";
		ab[3] = "Vaishani";
		ab[4] = "Vaibhav";
		ab[5] = "Pooja";

		System.out.println(ab.length);
		// To Get all values from array
		for (int r = 0; r < 6; r++) {
			System.out.println("The index of value is:- " + r + "= " + ab[r]);
		}

		// Print all values using for each loop
		for (String s : ab) {
			System.out.println(s);
		}

	}

}
