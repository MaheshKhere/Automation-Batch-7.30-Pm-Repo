package this_Keyword;

public class This_002 extends This_001 {

	double d = 89.455;
	long l = 300000;

	public void display() {
		// instance method of parent class
		this.getdata();
		System.out.println("display from child");
		System.out.println("------------------------------------");
	}

	public void ab() {
		// instance method of current class
		this.display();
	}

	public static void main(String[] args) {
		This_002 t2 = new This_002();
		t2.display();
     	t2.ab();

	}
}
