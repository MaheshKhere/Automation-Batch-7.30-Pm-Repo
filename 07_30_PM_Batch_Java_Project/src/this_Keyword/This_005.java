package this_Keyword;

public class This_005 {

	public This_005() {
		this(23.67);
		System.out.println("user defined Constructor");
	}

	public This_005(double s) {
		this("x");
		System.out.println("one double Parameter Constructor");
	}

	public This_005(String t) {
		this(90.00,60.456);
		System.out.println("One String Parameter Constructor");
	}

	public This_005(double s, double y) {
		System.out.println("Two double parameter Constructor");
	}

	public static void main(String[] args) {
		This_005 t5 = new This_005();
	}
}
