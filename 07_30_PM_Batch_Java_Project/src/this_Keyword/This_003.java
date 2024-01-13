package this_Keyword;

public class This_003 {

	// Calling user and parameterized Constructor with one class object
	public This_003 () {
		this(9);
		System.out.println("I am user Defined Constructor");
	}
	
	public This_003 (int h ) {
		
		System.out.println("I am Parameterized Constructor");
		
	}
	public static void main(String[] args) {
		This_003 t = new This_003();
	}

}
