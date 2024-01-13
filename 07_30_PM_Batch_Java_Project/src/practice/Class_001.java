package practice;

public class Class_001 {

	// Instance Method
	public void verify() {
		System.out.println("Instance Method");
		System.out.println("Instance_1 Method");
	}

	public static void main(String[] args) {
		System.out.println("hhhh");
		// To create Class Object
		Class_001 r = new Class_001();
		r.verify();
		r.verify();
		
		
		Class_001 cd = new Class_001 ();
		cd.verify();
		
		Class_001 ab = new Class_001();
		ab.verify();
		
		
		Class_001 b = new Class_001();

		Class_001 m = new Class_001();
		Class_001 y = new Class_001();
	    //y.verify();
	    y.verify();

	}

}
