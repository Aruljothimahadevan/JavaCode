package pack1;
abstract class AbstractClass{
	abstract void print();
}
public class AnonymousAbstractClass {
public static void main(String as[]) {
	AbstractClass obj =new AbstractClass() {

		void print() {
			System.out.println("in print override");
			
		}
	};
}
}
