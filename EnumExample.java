package pack1;
// We can  also use Enumeration on outside of the class also
//enum Color {
//	Red, Green, Blue
//}
interface Aruljothi{
	void hello();
}
public class EnumExample {
	enum Color  {
		Red, Green, Blue

	}


	public static void main(String vo[]) {
		Color C2 = Color.Green; //Color.valueOf("Green");
		Color C1 = Color.Red;
		Color C3 = Color.Blue;
		System.out.println(C2);
		System.out.println(C1.ordinal());
		System.out.println(C2.ordinal());
		System.out.println(C3.ordinal());
		Color C0[] = Color.values();
		for (Color Li : C0)
		{
			System.out.println(Li + " :" + Li.ordinal());
		}
	}
}
