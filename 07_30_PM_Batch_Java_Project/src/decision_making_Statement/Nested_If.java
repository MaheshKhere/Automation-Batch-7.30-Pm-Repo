package decision_making_Statement;

public class Nested_If {

	public static void main(String[] args) {
		
		float f = 700.69f;
		
		if( f > 500) {
			System.out.println(" f is less than 800");
			if (f>500) {
				System.out.println("f is greater than 500");
				if (f>2000) {
					System.out.println("f is less than 200");
					if(f<900) {
						System.out.println("F is less than 900");
					}
				}
			}
		}else {
			System.out.println("Your all conditions is false");
		}
		
	}

}
