package multilevel_Inheritance;

public class Class_C extends Class_B{

	static String s = "cd from Class_C";
	
	public void print() {
		System.out.println(s);
	}
	
	public static void main(String[] args) {
		Class_C c3 = new Class_C();
		System.out.println(c3.a); // class_A
		c3.getdata(); //class_A
		c3.display(); // class_B
		c3.print(); // class_C

	}

}
