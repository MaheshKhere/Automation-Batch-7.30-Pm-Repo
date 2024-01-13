package polymorphism;

public class Child_Class extends Parent_Class{

	int x=90;
	public Number print(int x) {
		System.out.println("Print Method From Child Class");
		return x;
	}
	
	//date-19-11-2023
	public void pratiksha() {
		System.out.println("Pratiksha Method From Child Class");
	}
	public static void display(double b) {
		System.out.println("Display Method from Child Class");
	}
	
	public static void main(String[] args) {
		Child_Class c = new Child_Class();
        c.print(6);
        c.pratiksha();
        //display(30.45);
       // c.display(23.44);
        
        Parent_Class p = new Child_Class();
        //p.print(4);
       // p.print(2);
       // p.print(90);
       // p.display(29.90);
        p.pratiksha();
        
        // Has Relationship
        Parent_Class p1 = new Parent_Class();
        //p1.print(1);
        p1.pratiksha();
	}

}
