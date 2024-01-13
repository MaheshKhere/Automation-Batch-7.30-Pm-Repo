package non_Prmitive_Data;

public class Class_001 {

	// Non Primitive data type
	String s ;  // null
	String ab= "120";
	String bn= "e";
	
	byte a;    // 0
	short v;   // 0
	int i;
	long l;// 0
	float f ;   // 0.0
	double d;    // 0.0
	boolean b;   // false
	char c;      // space
	
	
	
	public static void main(String[] args) {
		Class_001 c1 = new Class_001();
		
		// Combine string and variable
		System.out.println("String data type-" + c1.s);
		System.out.println("int data type-" + c1.i);
		System.out.println("Float data type-" +c1.f);
		System.out.println("byte data type-" +c1.a);
		System.out.println("Short data type-"+ c1.v);
		System.out.println("Double data type-"+ c1.d);
		System.out.println("Boolean data type- "+ c1.b);
		System.out.println("Char data type- "+ c1.c);
		
	}

}
