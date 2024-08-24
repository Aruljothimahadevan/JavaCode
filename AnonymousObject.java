package pack1;
class Student_detail2{
	int mark;
	public Student_detail2() {
		mark=99;
		System.out.println("Object Created");
	}
	public void show() {
		System.out.println("mark of the Student is " +mark);
	}
}
public class AnonymousObject {
public static void main(String a[]) {
	new Student_detail2().show();	//object created without any reference variable.
	new Student_detail2().show();
	student obj=new student();
            
	
}
}
