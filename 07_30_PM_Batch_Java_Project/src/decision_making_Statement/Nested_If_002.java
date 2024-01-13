package decision_making_Statement;

public class Nested_If_002 {

	public static void main(String[] args) {
		
		String s = "Akola";
		char c ='d'; 
		
		if((s=="Akola")) {
			System.out.println(" Your city is Akola");
			if(s=="Nagpur") {
				System.out.println(" Your city is Nagpur");
				if(s=="Akola") {
					System.out.println(" Your city is Akola");	
				}
			}
		} else {
			System.out.println("None of city");
		}

	}

}
