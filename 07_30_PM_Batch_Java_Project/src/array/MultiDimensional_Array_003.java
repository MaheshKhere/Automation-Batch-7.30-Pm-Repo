package array;

public class MultiDimensional_Array_003 {

	public static void main(String[] args) {
		
		/* Declare 2-D Array
		 * 30  40   50 
		 * 20  10   60
		 * 40  67   89
		 */

		double  [] [] xy = {{30.67, 40.93, 50, 90}, {20, 10, 60, 20}};
		
		// Print One Value
		System.out.println(xy[0][1]);
		
		// Print All values- Nested Loop
		for (int i=0; i<3; i++) {
			for(int j=0; j<4; j++) {
				System.out.print(xy[i][j]+ " ");
			}
			System.out.println();
		}
		
	}

}
