package pack1;

class A_Static {
	String name;
	int age;

	public void Show() {
		System.out.println("name :" + name);
		System.out.println("in show method");
	}

	static class B_Static {
		public void print() {
			System.out.println("in print method");
		}
	}

}

public class StaticClassNested {
	public static void main(String a[]) {
// How to create object for inner static nested class.
// First create for object for outer class.
		A_Static obj = new A_Static();
		obj.name = "AJ";
		obj.Show();
//		Creating object for inner static class.
		A_Static.B_Static obj1=new A_Static.B_Static();	
//		this is not  way to create (A_Static.B_Static obj1=new A_Static.B_Static();	).
		obj1.print();
	}
}