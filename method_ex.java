package pack1;
class computer{
	public void music() {
		System.out.println("music started");
	}
	public String getpen(int cost) {
		if(cost>=10) 
			return "pen";
		
		return "nothing";
	}
}
public class method_ex {
public static void main(String arg[]) {
	computer obj=new computer();
	obj.music();
	String r=obj.getpen(8);
	System.out.println(r);
}
}
