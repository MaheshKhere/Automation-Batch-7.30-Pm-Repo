package return_Statement;

public class Class_001 {

	
	// Instance method
	public int add(int x , int b) {
		// it return addition two numbers with help of argument variable
		
		return x + b;
	}
	
	public double subtract(double d , double e) {
		//If you return value then value will be return value
		System.out.println("The value of d - "+ d);
		return d - e ;
		
	}
	
	
	public int cd(int i) {
		
		return i;
		
	}
	
	public Integer xy(Integer t) {
		
		return 100;
	}
	
	public Number cr(Number p) {
		
		return p;
	}
	
	public String get(String s) {
		
		return "xyz";
	}
	
	public static void main(String[] args) {
		Class_001 c1 = new Class_001();
		
		System.out.println(c1.add(23, 23));
		
		System.out.println(c1.subtract(20.05, 10.05));
		
		System.out.println(c1.cd(2));
		
		System.out.println(c1.xy(7));
		
		System.out.println(c1.cr(80));
		
		System.out.println(c1.get("Hiii")); 

	}

}
