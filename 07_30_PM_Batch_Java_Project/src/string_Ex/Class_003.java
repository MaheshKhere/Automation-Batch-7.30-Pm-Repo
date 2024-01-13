package string_Ex;

public class Class_003 {
public static void main(String[] args) {
	
	String s =" xy ";
	 String b = s.concat("ab");
	//System.out.println(s);
	
	//System.out.println(b);
	// xy ab
	
	// String Buffer and String Builder are same.
	// String buffer is a mutable.
	// The value object can be change.
	
	StringBuffer sb = new StringBuffer("abc");
	sb.append("de");
	
	System.out.println(sb);
	
}
}
