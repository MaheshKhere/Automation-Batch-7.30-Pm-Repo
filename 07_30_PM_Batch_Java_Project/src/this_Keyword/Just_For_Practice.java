package this_Keyword;

public class Just_For_Practice extends Just_For_Practice_001{

	int r = 30;
	public Just_For_Practice() {
		System.out.println("User Defined Constructor");
	}
	
	public Just_For_Practice(int i) {
		this();
		System.out.println("User Parameterized Constructor");
		
	}
	
	public void get() {
		System.out.println(this.r);
		System.out.println(this.p);
	}
	public void print() {
		this.get();
		this.display();
	}
	public static void main(String[] args) {
		Just_For_Practice j = new Just_For_Practice(34);
		//j.get();
		//j.print();

	}

}
