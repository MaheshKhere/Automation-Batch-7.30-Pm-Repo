package method_Argument;




public class Class_002 {

	// instance Variable
	int v;
	static int x;
	static String o;
	float f;

	public void function(int p, float x) {
		v = p;
		f = x;
		System.out.println("The value instance variable is - " + v);
		// Signature int and float
	}
	

	public static void print(String k) {
		Class_002 c3 = new Class_002();
		o = k;
		System.out.println(" The value of static String variable is -" + o);
	}

	public static void verify(boolean l) {
		boolean y = l;
		System.out.println(y);
		// Signature is float
	}

	public static void main(String[] args)  {

		Class_002 c2 = new Class_002();
		c2.function(34, 45.78f);

		// System.out.println(c2.v);
		print("abd");
		verify(false);
		// System.out.println(x);
		
		
	}
}
