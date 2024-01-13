package string_Ex;

public class Class_004 {

	public static void main(String[] args) {
		
		String s = "Automation Batch";
		
		// Print all characters 
		for(int x=0; x<s.length(); x++) {
			System.out.print(s.charAt(x)+ "  ");
		}
System.out.println();
		// To print in reverse direction
		for(int y= s.length()-1; y>=0;y--) {
			System.out.print(s.charAt(y)+"  ");
		}
	}

}
