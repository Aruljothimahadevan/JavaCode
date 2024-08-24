package pack1;
public class switch_ex{
    public static void main (String arg[])
    
    {	String result1;
    	//int result;
    	int n=1;
    	switch(n) {
    	case 1 -> System.out.println("1");
    	case 2 -> System.out.println("10");								// METHOD 1
    	case 3 -> System.out.println("100");
    	default -> System.out.println("1000");
    	}
         switch(n) {
    		case 1 -> result1= "number 1";
    		case 2 -> result1 = "number 10";									// METHOD 2
        	case 3 -> result1 = "number 100";
    		default -> result1 = "number 1000";
    		}
    		System.out.println(result1); 	
	
    	/* result=switch(n) {
    		case 1 ->1;	
    		case 2 ->10;																	// METHOD 3
    		case 3 ->100;
    		default ->  1000;
    		};
    		System.out.println(result);	*/
  
    /* result=switch(n) {
 		case 1 : yield 1;	
 		case 2 : yield 10;																	// METHOD 4
 		case 3 : yield 100;
 		default : yield 1000;
 		};
 		System.out.println(result);  */
    	
    }
}   