package inheritance;

public class Child_class extends Parent_Class{

	public void xy() {
		System.out.println(" Xy method from Child class");
	}

	public static void main(String[] args) {

		// Has-A relationship
		Parent_Class p = new Parent_Class();
		p.display(); // parent class
		Parent_Class.city(); // parent class
		
		
		Parent_Class p2 = new Child_class();
		p2.display();
		p2.city();
		
		
		
       
		

	}

}
