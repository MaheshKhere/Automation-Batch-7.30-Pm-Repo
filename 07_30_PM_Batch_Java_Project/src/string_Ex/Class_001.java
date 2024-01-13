package string_Ex;

public class Class_001 {

	public static void main(String[] args) {
		Class_001 c1 = new Class_001();
		
		String s = "abc"; //by literal
		
		String ab = new String ("city"); // Using new keyword
		
		// To check for un-empty
		System.out.println(ab.isEmpty());
		
		// To check for empty 
		String n  = new String ( "");
		System.out.println("Is String empty:- "+n.isEmpty());
		
		// To get length of characters
		String a = "Mahesh";
		System.out.println("length of String is:- " + a.length());
		
		// To replace some characters
		String g = "abcd";
		String m = g.replace('b', 'x');
		System.out.println(m);
		System.out.println(g.replace("b", "z"));

		// To Get index of character
		String p = "abcdef y";
		System.out.println(p.indexOf("y"));
		
				
		
		// To get sub string with respect index
		String q = "Characters";
		System.out.println(q.substring(3));
		System.out.println(q.substring(5));
		System.out.println(q.substring(3, 7));
		
		
		
	}

}
