package polymorphism;

public class Class_001 {

	// Dated 19-11-2023
	public void data() {
		System.out.println("data without argument");
	}

	public void data(int a) {
		System.out.println("data int argument");
	}

	public void data(long l) {
		System.out.println("data long argument");
	}

	public void data(double d) {
		System.out.println("data double argument");
	}

	
	public void data( int a, double b) {
		System.out.println("data three argument");
	}

	public static void main(String[] args) {
		Class_001 c1 = new Class_001();
		c1.data();
		c1.data(2);
		c1.data(20);
		c1.data(4);
		c1.data(3, 1);
	}
}
