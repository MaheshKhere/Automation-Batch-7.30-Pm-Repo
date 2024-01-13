package interface_EX;

public class Kokan_Railway implements Indian_Railway, Get{

	public static void main(String[] args) {
		
		Kokan_Railway k = new Kokan_Railway();
		k.green();
		k.doubleyellow();
		k.yellow();
		k.red();
		k.ab();
		// indirectly interface object 
		Indian_Railway r = new Kokan_Railway();
		//r.green();
		//r.green();	
	}

	@Override
	public void green() {
		System.out.println("Proceed with 100kmph");
	}

	@Override
	public void doubleyellow() {
		System.out.println("Proceed with 60kmph");	
	}

	@Override
	public void yellow() {
		System.out.println("Proceed with 30kmph");	
	}

	@Override
	public void red() {
		System.out.println("Stop here");	
	}

	@Override
	public void ab() {
		System.out.println("ab method from get interface");
		
	}
}
