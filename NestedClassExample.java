package pack1;

class A_Nested {
	String name;
	int age;

	public void Show() {
		System.out.println("name :"+name);
		System.out.println("in show method");
	}

	class B_Nested {
		public void print() {
			System.out.println("in print method");
		}
	}

}

public class NestedClassExample {
	public static void main(String a[]) {
		A_Nested obj = new A_Nested();
		obj.name="AJ";
		obj.age = 21;
		obj.Show();
// How to create object for inner class
		A_Nested.B_Nested obj1= obj.new B_Nested() ;
		obj1.print();
	}
}
