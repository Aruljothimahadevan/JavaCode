package pack1;

public class inheritance_ex {
public static void main(String a[]) {
	advance_calci obj=new advance_calci();
	int res_add=obj.add(23,21);
	int res_sub=obj.sub(23,21);
	int res_mul=obj.mul(23,21);
	int res_div=obj.div(23,21);
	System.out.println(res_add);
	System.out.println(res_sub);
	System.out.println(res_mul);
	System.out.println(res_div);
}
}
