package jump_Statement;

public class Break_001 {

	public static void main(String[] args) {
	
		for(int b =1; b<=10; b++) {
			System.out.println(b);
			if(b==5) {
				break;
			}
		}
		System.out.println("--------------------------------------------");
		int v = 10;
		while(v<=30) {
			System.out.println(v);
			if(v!=20) {
				break;	
			}
			v++;
		}
	}

}
