package multilevel_Inheritance;

public class Class_B extends Class_A{

	public void display() {
		String s = "ab from Class_B";
		System.out.println(s);
	}
	public static void main(String[] args) {
		Class_B c2 = new Class_B();
		System.out.println(c2.a);
		c2.getdata();
		c2.display();
	}

}
