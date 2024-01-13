package array;

public class Array_003 {

	public static void main(String[] args) {
		
		// Without memory allocation
		int [] list = { 2, 3, 45, 100, 24, 23, 23 ,56, 67,};
		
		// print one value
		System.out.println(list[0]);
		System.out.println(list.length);
		
		// To print all values -using for loop
		for(int u = 0; u<9; u++) {
			System.out.println(list[u]);
		}
		
       // for each loop
		for(int g:list) {
			System.out.println(g);
		}
	}

}
