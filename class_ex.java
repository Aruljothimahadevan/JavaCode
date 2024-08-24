package pack1;

class cal {
	int add(int a, int b) {
		System.out.println(a + b);
		return 0;
	}
}


public class class_ex {
	public static void main(String a[]) {
		int n1 = 10;
		int n2 = 20;
		cal calci = new cal();
		calci.add(n1, n2);
	}
}