package pack1;

class human {
	private String name;
	private int age;
human(){
	name="aj";
	age=25;
}
/*
 * public void setname(String name) {
 * 
 * this.name = name; name = "aj"; }
 * 
 * public void setage(int age) {
 * 
 * this.age = age; age = 20; }
 */

	public int getage() {
		return age;
	}

	public String getname() {
		return name;
	}
}

public class encapsulatio_ex {
	public static void main(String a[]) {
		
		human per1 = new human();
		/*
		 * per1.setage(21); per1.setname("Arul");
		 */
		System.out.println(per1.getname() + ":" + per1.getage());
	}

}
