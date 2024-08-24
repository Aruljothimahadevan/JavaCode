package pack1;
class laptops{ 
	int price;
	int proc;
	
	laptops(){					//default contructor
		price=50000;
		proc=5;
	}
	laptops(int price,int proc){
		this.price=price;		//parameterized constructor
		this.proc=proc;
	}
	laptops(laptops obj2){
		price=obj2.price;		//copy constructor
		proc=obj2.proc;
	}
}
public class constructors_ex {
public static void main(String arg[]) {
	laptops hp=new laptops();
	System.out.println(hp.price+":"+hp.proc);
	laptops asus=new laptops(50000,5);
	System.out.println(asus.price + ":" + asus.proc);
	laptops acer=new laptops(asus);
	System.out.println(acer.price + ":" + acer.proc);
	
	
}
}
