package pack1;

public class enhanced_FOR {
	public static void main(String arg[]) {
		// 1D array
		int a[] = { 12, 23, 45, 67 };
		System.out.println("*********1D_ARRAY*********");
		System.out.println();
		// printing using for loop
		/*
		 * for(int i=0;i<43;i++) { System.out.println(a[i]); }
		 */
		// using for-each loop(enhanced for loop)
		for (int i : a) {
			System.out.print(i + "  ");
		}
		System.out.println();
		System.out.println();
		System.out.println("*********2D_ARRAY*********");
		System.out.println();

		int mult[][] = { { 1, 2, 3, 4 }, // arrays of array
				         { 5, 6, 7, 8 }, 
				         { 8, 7, 6, 5 }, 
				         { 4, 3, 2, 1 } };
			//using for-each loop
	
		for (int j[] : mult) {
			for (int k : j) {
				System.out.print(k+" ");
			}
			System.out.println();
		}
	}
}
