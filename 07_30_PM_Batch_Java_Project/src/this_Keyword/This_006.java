package this_Keyword;

public class This_006 extends This_001 {
	int v = 90;
	String t = "xy";

	public void get() {
		System.out.println(this.v);
		System.out.println(this.t);
		System.out.println(this.a); // parent
		System.out.println(this.f); // parent
		System.out.println("-----------------------------");
	}

	public void print() {
		this.get();
		this.getdata();
		System.out.println(this.v);
	}

	public void xy() {
		this.getdata();
	}

	public static void main(String[] args) {
		This_006 t6 = new This_006();
		// t6.get();
		t6.print();
		//t6.xy();

	}

}
