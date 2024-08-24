package pack1;

public class array_2D {
	public static void main(String arg[]) {
		int i,j;
int A[][]=new int[3][4];	
/* 	  { { 1, 2, 3, 4 }, // arrays of array
	    { 5, 6, 7, 8 }, 
		{ 8, 7, 6, 5 }, 
		{ 4, 3, 2, 1 } };	*/

for(i=0;i<3;i++) {
	for(j=0;j<4;j++) {
		A[i][i]=1;
	}
}
for(i=0;i<3;i++) {
	for(j=0;j<4;j++) {
		System.out.print(A[i][i] + " ");
	}
	System.out.println();
}

	}
}
