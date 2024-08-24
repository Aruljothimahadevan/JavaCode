package pack1;

class Animal {
	String name = "Dog";

	public Animal() {
		
		 System.out.println("using super with constructor");
	 }
	public void sound() {
		System.out.println("using super with method");

	}
}

class SmallAnimal extends Animal {		// using super with constructor
	public SmallAnimal() {
		super();				//default when class is inherited
	}

	public void cute() {

		System.out.println("use super with variable -> " + super.name); // use super with variable
	}

	public void method() {
		super.sound(); // use super with method
	}
}

public class SuperKeyword {
	public static void main(String ar[]) {
		SmallAnimal obj = new SmallAnimal();
		obj.cute();
		obj.method();
	}
}
