package decision_making_Statement;

public class Class_003 {

	public void if_else_if() {
		double d = 200.5932;
		
		if (d>100) {
			System.out.println("Condition-1 is true");
		}else if(d<300) {
			System.out.println("Condition-2 is true");
		}else if (d>500) {
			System.out.println("Condition-3 is true");
		}else if (d<40) {
			System.out.println("Condition-3 is true");
		}
		else {
			System.out.println("All Conditions is false");
		}
	}
	public static void main(String[] args) {
		Class_003 c3 = new Class_003();
		c3.if_else_if();
	
	}

}
