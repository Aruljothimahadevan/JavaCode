package pack1;

class Anonymous1 {

	public void Show() {
		System.out.println("in show");
	}
}

public class AnonymousInnerClass {
	public static void main(String ar[]) {

		Anonymous1 obj = new Anonymous1() {
			public void Show() {
				System.out.println("in new show");

			}

		};
		obj.Show();
	}
}
