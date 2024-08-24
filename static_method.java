package pack1;
class student_detail1 {
	String name;
	int roll;
	static String department;

	/*
	 * public static void show() { System.out.println(department); }
	 */
	
	  public static void show(student_detail1 std) 
	 { System.out.println(std.name + ":" + std.roll + ":" + department); }
	 
}
public class static_method {
public static void main(String a[]) {
	student_detail1.department="cse";
//	student_detail1.show();
	
	  student_detail1 std1 = new student_detail1(); std1.name = "a"; std1.roll = 1;
	  student_detail1 std2 = new student_detail1(); std2.name = "b"; std2.roll = 2;
	  student_detail1 std3 = new student_detail1(); std3.name = "c"; std3.roll = 3;
	  student_detail1 std4 = new student_detail1(); std4.name = "d"; std4.roll = 4;
	  student_detail1.show(std1);
	  student_detail1.show(std2);
	  student_detail1.show(std3);
	  student_detail1.show(std4);
	 
}
}
