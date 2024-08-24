package pack1;

import java.util.Scanner;

class laptop {
	int price;
	int price() {
		System.out.print("your laptop price is :" + price);
		return 0;
	}
}

public class classdemo {
	public static void main(String arg[]) {
		int price;
		Scanner scan = new Scanner(System.in);
		price = scan.nextInt();
		laptop lap1 = new laptop();
		lap1.price =price;
		lap1.price();

	}

}
