package pack1;

public class array_3D {
public static void main(String arg[]) {
	/*
	int arr[][][]=new int[4][4][4];
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			for(int k=0;k<arr.length;k++) {
				arr[i][j][k]=(int)(Math.random()*100);
			}
		}
	}*/
	int[][][] arr = {
		    {
		        {1, 2, 3},
		        {4, 5, 6}
		    },
		    {
		        {7, 8, 9},
		        {10, 11, 12}
		    },
		    {
		        {13, 14, 15},
		        {16, 17, 18}
		    }
		};

	
	
	
	for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr[i].length;j++) {
			for(int k=0;k<arr[j].length;k++) {
				System.out.print(arr[i][j][k]+" ");
			}
		}System.out.println();
	}System.out.println();
}
}
