package this_Keyword;

public class Just_For_Practice_002 {

	public Just_For_Practice_002() {
		this(20.89f);
		System.out.println("User Defined Constructor ");
	}

	public Just_For_Practice_002(float f) {
		this(78.89f,6);
	
		System.out.println("User one float Constructor ");

	}

	public Just_For_Practice_002(float f, int y) {
	this(39.78f, 6, "sb");
		System.out.println("User one int Constructor ");

	}

	public Just_For_Practice_002(float v, int x, String s) {
		
		System.out.println("User Three Parameter Constructor ");

	}

	public static void main(String[] args) {
		Just_For_Practice_002 j = new Just_For_Practice_002();
	}

}
