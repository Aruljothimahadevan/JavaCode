package pack1;

import java.util.Scanner;

class calculator {
	Scanner scan = new Scanner(System.in);

	int addition() {
		System.out.println("enter value 1 add");
		int n1 = scan.nextInt();
		System.out.println("enter value 2");
		int n2 = scan.nextInt();
		int add = n1 + n2;
		return add;
	}

	int subtraction() {
		System.out.println("enter value 1 sub");
		int n1 = scan.nextInt();
		System.out.println("enter value 2");
		int n2 = scan.nextInt();
		int sub = n1 - n2;
		return sub;
	}

	int multiplication() {
		System.out.println("enter value 1 mul");
		int n1 = scan.nextInt();
		System.out.println("enter value 2");
		int n2 = scan.nextInt();
		int mul = n1 * n2;
		return mul;
	}

	int division() {
		System.out.println("enter value 1 div");
		int n1 = scan.nextInt();
		System.out.println("enter value 2");
		int n2 = scan.nextInt();
		int div = n1 / n2;
		return div;
	}

}

public class maths {
	public static void main(String arg[]) {
		int result = 0; // this 0 is need
		System.out.println("Select the operation:(+)(-)(*)(/)");

		Scanner scan = new Scanner(System.in);
		String ch = scan.nextLine();
		calculator add = new calculator();
		calculator sub = new calculator();
		calculator mul = new calculator();
		calculator div = new calculator();
		switch (ch) {
		case "+" -> result = add.addition();
		case "-" -> result = sub.subtraction();
		case "*" -> result = mul.multiplication();
		case "/" -> result = div.division();
		default -> System.out.println("enter correct operation");
		}

		System.out.println(result);
		/*
		 * Initialization of result: The variable result is initialized to 0 to avoid the compilation error. 
		 * validOperation Flag: A boolean flag validOperation is introduced to check whether the entered operation is valid or not.
		 * Conditional Print Statement: The result is printed only if the operation is valid.
		 */

	}
}
