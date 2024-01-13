package inheritance;

 public  class Class_001 {

	public String s = "Diksha with Parent Class";

	// instance method
	public  void verify() {
		System.out.println("I am verify method from Parent Class ");
	}

	// Static method

	public static void print() {
		System.out.println("I am print Method from Parent Class");
	}

	public static void main(String[] args) {
		Class_001 c1 = new Class_001();
		c1.verify();
		System.out.println(c1.s);
	}

}
