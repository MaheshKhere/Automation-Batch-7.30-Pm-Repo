package array;

public class MultiDimensional_Array_001 {

	public static void main(String[] args) {
		
		/* Declare 2-d Array
		 * 10.0      40.70  
		 * 30.70     90.60  
		 * 
		 */
		double [][] ab = new double[2][2];
		ab[0] [0]= 10.0;
		ab[0] [1]= 40.70;
		ab[1] [0]= 30.70;
		ab[1] [1]= 90.60;
		
		// To Print values
		for(int x=0; x<2; x++) {
			for(int y=0;y<2; y++) {
				System.out.print(ab[y][x]+" ");
			}
			System.out.println();
		}
		

	}

}
