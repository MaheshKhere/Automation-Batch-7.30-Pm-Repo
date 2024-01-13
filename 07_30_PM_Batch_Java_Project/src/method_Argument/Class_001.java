package method_Argument;

import java.util.ArrayList;

public class Class_001 {

	float x;
	float y;
	
	// Instance Method
	public void verify (float ab ) {
		x = ab;
		System.out.println(x);
		
	}
	
	public void cd(float x) {
		y = x;
	System.out.println(y);
	}
	
	
	public static void main(String[] args) {
		Class_001 c1 = new Class_001();
		c1.verify(10.8999f);
		c1.cd(70.90f);
		//System.out.println(c1.x);
		//System.out.println(c1.y);
	}
}
