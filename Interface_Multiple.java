package pack1;

interface Name1 {
	void show();
}

interface Name2 {
	void Run();
}

interface Name3 extends Name1, Name2 {
	void Print();
}

// Single class can able to implements multiple interfaces
class Class1 implements Name1, Name2, Name3 {
	public void show() {
		System.out.println("Showing....");
	}

	public void Run() {
		System.out.println("Running....");
	}

	public void Print() {
		System.out.println("Printing.....");
	}
}

public class Interface_Multiple {
	public static void main(String ar[]) {
		Name1 obj = new Class1();
		obj.show();
		// We can't run Run and Print method with Reference of Name1
		Name2 obj1 = new Class1();//This method is belong to only interface Name2 
		obj1.Run();
		Name3 obj2 = new Class1();
		obj2.Print();

	}
}
