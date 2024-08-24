package pack1;

import java.util.Scanner;

public class question {
	public static void main(String arg[]) {
		String Address;
		Scanner scan = new Scanner(System.in);
		//name=scan.nextLine();
		int age = scan.nextInt();
		scan.nextLine();
		Address = scan.nextLine();
		System.out.println("****Data****");

		System.out.println(age);

		System.out.println(Address);

	}
}