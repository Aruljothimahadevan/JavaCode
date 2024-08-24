package pack1;

public class random_num {
public static void main(String arg[]) {
	int i;
	for ( i=0;i<10;i++) {
		System.out.println(Math.random()); //this give an double and less than 1 value
	}
	System.out.println();
	System.out.println("converting to int");
	System.out.println();
	for(i=0;i<10;i++) {
		int value=(int)(Math.random()*100); // values between 0.0 to 1.0 ,so it (int)convert to 0
		System.out.println(value);
	}

}
}
