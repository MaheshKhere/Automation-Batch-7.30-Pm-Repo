package abstraction;

public class Class_A extends Abstract_002{

	public static void main(String[] args) {
		Class_A c = new Class_A();
		c.get();
		c.display();
		c.pooja();
		c.ab();
		print();
	}

	@Override
	public void get() {
		System.out.println("get Method is Coming From Abstract Class_002");	
	}

	@Override
	public void display() {
		System.out.println("display Method is Coming From Abstract Class_002");	
	}

	@Override
	public void ab() {
		System.out.println("ab Method is Coming From Abstract Class_001");	
	}

	@Override
	public void pooja() {
		System.out.println("pooja Method is Coming From Abstract Class_002");
	
	}	
}
