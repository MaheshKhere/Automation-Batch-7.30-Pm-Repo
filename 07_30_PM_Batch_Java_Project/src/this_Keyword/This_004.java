package this_Keyword;

public class This_004 {

	public This_004() {
		System.out.println("User defined constructor");

	}
	public This_004(int a) {
		this();
		System.out.println("One int Parameter Constructor");

	}
	public This_004(String s) {
		this(4);
		System.out.println("String Parameter Constructor");
	}
	
	public This_004(int b, int a) {
		this("ab");
		System.out.println("Two int Parameter Constructor"); 
	}
	
	public static void main(String[] args) {
		This_004 t4 = new This_004(90,100);
	}

}
