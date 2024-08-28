package pack1;

//Parentsclass  
class Parents{   
  String name;   
  
  // A method which prints the data of the Parentsclass   
  void showMessage()   
  {   
      System.out.println("Parentsmethod is called");   
  }   
}   
  
//Childsclass   
class Childs extends Parents{   
  int age;   
  
  // Performing overriding  
  @Override  
  void showMessage()   
  {   
      System.out.println("Childs method is called");   
  }   
}   
  
public class DowncastingExample{  
  
  public static void main(String[] args)   
  {   
      Parents p = new Childs();  
      p.name = "Aj";  
        
      // Performing Downcasting Implicitly   
      //Childsc = new Parent(); // it gives compile-time error   
        
      // Performing Downcasting Explicitly   
      Childs c = (Childs)p;   
  
      c.age = 18;   
      System.out.println(c.name);   
      System.out.println(c.age);   
      c.showMessage();   
  }   
}  