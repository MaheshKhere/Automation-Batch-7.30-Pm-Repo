package different_Pattern;

public class Inverted_Half_Triangle_180 {

	public static void main(String[] args) {
//		      *
//		    * *
//		  * * *
//		* * * *
		for(int i= 1; i<=5; i++) {
			//To print space
			for(int j=1; j<=5-i; j++) {
				System.out.print(" ");
			}
			// To print star
			for(int x=1; x<=i; x++) {
				System.out.print("*");
			}
			System.out.println();
		}

	}

}
