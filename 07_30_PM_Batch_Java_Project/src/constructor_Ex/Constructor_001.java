package constructor_Ex;

import abstraction.Abstract_001;

public class Constructor_001{

	// User Defined Constructor
	public  Constructor_001() {
		
		for(int i =0; i<4; i++) {
			System.out.println(i);
		}
	}
	
	// Parameterized Constructor
	public Constructor_001 (int x, int y, float f, float u) {
		System.out.println("Parameterized Constructor");
	}

	
	public static void main(String[] args) {
		Constructor_001 c1 = new Constructor_001();
		Constructor_001 c2 = new Constructor_001(2, 4, 50.45f,56.79f);
	}

}
