package pack1;

interface InterfaceA {
	int Age = 20; // Static and Final
	void Show();
}

class InterfaceB implements InterfaceA {
	public void Show() {
		System.out.println("in Show");
	}
}

public class InterfaceExample {

	public static void main(String[] args) {
		// Due to static (Age) we can able to call using parent name.
		System.out.println(InterfaceA.Age);
		InterfaceA obj = new InterfaceB();
		obj.Show();
	}

}
