package encapsulation;

public class Class_001 {
     // date-22-11-2023
	private int a = 10000;
	
	private void hidemoney(int x) {
		a=x;
		System.out.println(a);
		
	}
	public static void main(String[] args) {
		Class_001 c = new Class_001();
		c.hidemoney(400);
		
	}
}
