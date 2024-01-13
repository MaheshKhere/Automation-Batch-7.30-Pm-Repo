package exception;

public class Class_002 {

	public void a() {
		int a= 20;
		System.out.println(a/0);
		throw new ArithmeticException("System.out.println(a/0);");
	}
	
	
	public static void main(String[] args) {
		int [] r = new int [2];
		r[0]= 4;
		r[1]= 2;
		//System.out.println(r[1]);
		Class_002 c = new Class_002();
		c.a();
		
		try {Thread.sleep(3000);
			
		} catch (Exception e) {
			try {
				
			} catch (Exception e2) {
				
			}
		}
		

	}

}
