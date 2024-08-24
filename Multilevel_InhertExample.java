package pack1;

public class Multilevel_InhertExample {
public static void main(String arg[]) {
	calci_sci obj=new calci_sci();
	int r1=obj.add(3, 4);		// from class calci_add
	int r2=obj.mul(3, 4);		// from class advance_claci
	int r3=(int) obj.power(3, 4); 	// from class calci_sci with type casting
	
	System.out.println( r1 +" : " +r2 +" : " +r3);

}
}
