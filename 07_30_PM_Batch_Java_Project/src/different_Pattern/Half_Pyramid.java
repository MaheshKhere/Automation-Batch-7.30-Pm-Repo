package different_Pattern;

public class Half_Pyramid {

	public static void main(String[] args) {
		
//		*
//		* *
//		* * *
//		* * * *
		// row=col
		for(int i=1; i<=5;i++) {
			for(int j =1; j<=i;  j++) {
				System.out.print( "* ");
			}
			System.out.println();
		}
	}

}
