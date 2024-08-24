package pack1;
class static_ex{
	int no ;
	int age;
	static int value;
	static {
value=10;
	}
	static_ex(){
		no=12;
		age=3;
	}
	public void show() {
		System.out.println("i am for show");
		System.out.println(no);
		System.out.println(age);
	}
}
public class staticblock {
public static void main(String arg[]) {
//	static_ex.value=10;
	static_ex obj1=new static_ex();

	obj1.show();
	static_ex obj2=new static_ex();
	obj2.show();
	
}
}
