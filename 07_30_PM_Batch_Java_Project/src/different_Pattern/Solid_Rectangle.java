package different_Pattern;

public class Solid_Rectangle {

	public static void main(String[] args) {
		
//		* * * * *
//		* * * * *
//		* * * * *
//		* * * * *
		int row=4; int col=5;
		for (int x= 1; x<=row; x++) {
			for(int j=1; j<=col; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
