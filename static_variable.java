package pack1;

class student_detail {
	String name;
	int roll;
	static String department;

	public void show() {
		System.out.println(name + ":" + roll + ":" + department);
	}
}

public class static_variable {
	public static void main(String mai[]) {

		student_detail.department = "cse";			//static variable declare using class name and it obtain for all objects
		student_detail std1 = new student_detail();
		std1.name = "a";
		std1.roll = 1;
		student_detail std2 = new student_detail();
		std2.name = "b";
		std2.roll = 2;
		student_detail std3 = new student_detail();
		std3.name = "c";
		std3.roll = 3;
		student_detail std4 = new student_detail();
		std4.name = "d";
		std4.roll = 4;

		std1.show();
		std2.show();
		std3.show();
		std4.show();

	}
}
