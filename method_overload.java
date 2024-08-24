package pack1;
class calci{
	public int add(int n1,int n2) {
		return n1+n2;
	}
	public long /*double */ add(int n1,int n2,int n3) { 
		return n1+n2+n3;
	}
/*	public double add(int n1,int n2) {		// no matter any return function,only needs no of parameter
		return n1+n2;						   which type parameter can be passed
	}*/
}
public class method_overload {
public static void main(String a[]) {
	calci obj=new calci();
	double r=obj.add(1, 2,3);
	int r1=obj.add(1, 2);
	System.out.println(r);
	System.out.println(r1);
}
}
