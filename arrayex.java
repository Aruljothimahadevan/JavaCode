package pack1;

public class arrayex {
public static void main(String arg[]) {
	int i=0;
	int num[]= {1,2,3,4,5};
	int num1[]=new int[5];
	for(i=0;i<5;i++) {
		num1[i]=i+1;
	}
	i=0;
	while(i<5) {
		System.out.println(num[i]+" | "+num1[i]);
		i++;
	}


}
}
