package pack1;

import java.util.Scanner;

class hotel {
	int idly;
	int pongal;
	int dosa;

	void cost() {	//carefull with return type like int.....
		
		System.out.println(idly); // server1 print the values given by server1
		System.out.println("dosa"); // server2 print the values given by server2
		System.out.println("pongal"); // server3 print the values given by server3
		
	}
}

public class classhotel {
	public static void main(String arg[]) {
		hotel server1 = new hotel();
		hotel server2 = new hotel();
		hotel server3 = new hotel();
		Scanner scan = new Scanner(System.in);
		server1.idly = scan.nextInt();
		server2.dosa = scan.nextInt();
		server3.pongal = scan.nextInt();
		System.out.println();
		server1.cost();
		System.out.println();
		server2.cost();
		System.out.println();
		server3.cost();
		

	}
}
