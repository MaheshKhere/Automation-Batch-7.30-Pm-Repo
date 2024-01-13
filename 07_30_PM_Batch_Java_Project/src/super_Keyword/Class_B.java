package super_Keyword;

public class Class_B extends Class_A{

	String w = "Automation";
	
	public void ab() {
		System.out.println(super.w);
		// instance method from parent Class
		super.xy();
		System.out.println(this.w);
	}
	
	public void xy() {
	//	super.xy();
	}
	
	public static void main(String[] args) {
		Class_B b = new Class_B();
		b.ab();
	}
}
