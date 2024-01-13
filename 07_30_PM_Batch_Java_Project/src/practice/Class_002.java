package practice;

public class Class_002 {
	
	
	// instance variable
	int i = 30;
	byte b = 5;
	
	// Static Variable
	static double d = 23.45;
	
	
	// Instance Method 
	public void city() {
		System.out.println("I am Instance Method");
		System.out.println(i);  // Instance Variable
		System.out.println(d); // Static Variable by directly
		//System.out.println(Class_002.d); // Static Variable by class name
	}
	
	// Static Method
	public static void getdata() {
		
		Class_002 c = new Class_002();
		System.out.println(c.i); // Access Instance Variable by reference variable
	
		System.out.println("I am Static Method");
		System.out.println(d); // Static Variable access by directly
		//System.out.println(Class_002.d); // Static Variable access by class name
	}
	
	public static void main(String[] args) {
		// Class Object 
		Class_002 c = new Class_002();
		c.city(); // Access Instance Method
		System.out.println(c.i); // Access Instance Variable
		
		
		System.out.println(d);   
		//System.out.println(Class_002.d);
		
		getdata(); // Static Method Access by directly
		//Class_002.getdata(); // Static Method Access By class Name
	}
}
