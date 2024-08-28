package pack1;

class A {
	public final void show() {
		System.out.println("this is final method");

	}

}

class B extends A {
	/*
	 * public void show() { // cannot overide final method } }
	 */
}
	final class C {

		public void show() {
			System.out.println("hi");
		}
	}
	/*
	 * class D extends C{ // Final mclass cannotbe inheritance }
	 */

public class FinalKeyword {
	public static void main(String a[]) {
		final int num;
		num =(int)Math.random();
		// num=21+21;
	}
}
