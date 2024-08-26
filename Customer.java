package pack1;
class Government{
	public void egg()
	{
		System.out.println("one egg is 4.5 rupee"); 
	}
}
class shop1 extends Government{
	public void egg() {
		System.out.println("one egg is 5 rupee"); //method overriding
	}
}
class shop2 extends Government{
	public void egg() {
		System.out.println("one egg is 6 rupee"); //method overriding
	}
}
public class Customer {
public static void main(String a[]) {
	shop1 cus1=new shop1();
	cus1.egg();
	shop2 cus2=new shop2();
	cus2.egg();
}
}
