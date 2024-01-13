package jump_Statement;

public class Continue_Statement {

	public static void main(String[] args) {
		
		for(int p= 0; p<=6; p++) {
			if(p==3) {
				continue;
			}
			System.out.println(p);
		}
		System.out.println("-------------");
//		int k= 20;
//		do {
//			if(k==15) {
//				continue;
//			}
//			System.out.println(k);
//			k--;
//		}while(k>=8);
//		
//		
		System.out.println("----------------------------------------");
		int c= 50;
		while(c<=60) {
			c++;
			if(c==55) {
				continue;
			}
			System.out.println(c);	
		}
	}
}
