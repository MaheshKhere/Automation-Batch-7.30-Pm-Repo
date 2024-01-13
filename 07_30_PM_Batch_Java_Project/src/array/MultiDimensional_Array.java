package array;

public class MultiDimensional_Array {

	public static void main(String[] args) {
		
		/* Declare 2-D Array
		 * 2  5   6 
		 * 8  4   2
		 * 2  0   5
		 * 3  1   9
		 */

		int [] [] matrix = new int [4][3];
		
		//Add values
		matrix[0][0]= 2;
		matrix[0][1]= 5;
		matrix[0][2]= 6;
		
		matrix[1][0]= 8;
		matrix[1][1]= 4;
		matrix[1][2]= 2;
		
		matrix[2][0]= 2;
		matrix[2][1]= 0;
		matrix[2][2]= 5;
		
		matrix[3][0]= 3;
		matrix[3][1]= 1;
		matrix[3][2]= 9;
		
		// To Print one value
		//System.out.println(matrix[0][1]);
		
		// To Print all values- Nested Loop
		for(int i=0; i<4; i++) {
			for(int y = 0; y<3; y++) {
				System.out.print(matrix[i][y]+ " ");
			}
			System.out.println();
		}
	}

}
