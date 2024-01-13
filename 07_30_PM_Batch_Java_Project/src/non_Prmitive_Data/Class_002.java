package non_Prmitive_Data;

public class Class_002 {

	String s = "xy ";
	String a = " ab";
	
	String p = "cd " + "op";
	
	// Combine two above string
	
	String r = s.concat(a);
	String y = s.concat(a);
	
	public static void main(String[] args) {
		Class_002 c2 = new Class_002();
		//System.out.println(c2.r);
		System.out.println(c2.s + " " + c2.a);
		System.out.println(c2.p);
		
	}

}
