package string_Ex;

public class Class_002 {

	//String h = " Pen          ";
	
	public static void main(String[] args) {
		// To get Character with respect to index
		String s = "Wardha";
		char e = s.charAt(3);
		System.out.println(e);

		System.out.println(s.charAt(4));
		
		
		// To add New String
		System.out.println(s.concat(" City"));
		System.out.println(s+ " big City");
		
		// To get String in Lower Case 
		String a = "NAGPUR";
		System.out.println(a.toLowerCase());
		
		// To get String in Uppercase
		String b = " katol ";
		System.out.println(b.toUpperCase());
		
		// To remove space
		Class_002 c2 = new Class_002();
		//System.out.print(c2.h);
		String h = " Pen          ";
		//System.out.print("  hiii  ");
	//	System.out.println();
		//System.out.print(h.trim());
		//.out.print("byy");
//		
		// To Check character, present in string or not
		String r = "We are in Practice Batch";
		
		boolean  p = r.contains("p");
		//System.out.println(p);
		//System.out.println(r.contains("We are"));
		
		// To check actual and Expected String
		String actual = "Amazon";
		String expected ="Amazon";
		//System.out.println(actual.equals(expected));
		//System.out.println(actual.equals("Amazon"));
		
		//To ignore case
		String actual_1 = "Manual TESTING";
		String expected_1 = "manual testing";
		System.out.println(actual_1.equalsIgnoreCase(expected_1));
		
		System.out.println(expected_1.endsWith("ing"));
	
		
	}

}
