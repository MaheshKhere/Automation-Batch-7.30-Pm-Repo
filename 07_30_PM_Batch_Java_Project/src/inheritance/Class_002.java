package inheritance;

public class Class_002 extends Class_001{

	String o = "Pooja from Child Class";
	
	public void get() {
		System.out.println("I am get Method from Child Class");
	}
	
	
	public static void main(String[] args) {
		Class_002 c2 = new Class_002();
		c2.verify(); // Parent Class
		System.out.println(c2.s); //parent class
		
		print(); // Static method from parent class
		Class_001.print();
		
		c2.get(); // Child Class
		System.out.println(c2.o); // Child class 
		
		
	}

}
