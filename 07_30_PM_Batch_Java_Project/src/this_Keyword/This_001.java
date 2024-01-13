package this_Keyword;

public class This_001 {

	int a = 9000;
	 String f = "Vaishnavi";
	 
	 public void getdata() {
		 System.out.println("This method from parent class ");
         System.out.println(this.a);
		 System.out.println(this.f);
	 }
	 
	public static void main(String[] args) {
		This_001 t1 = new This_001();
		t1.getdata();
	}
}
