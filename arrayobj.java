package pack1;
class student{
	String name;
	int mark;
	String subject;
}
public class arrayobj {
public static void main(String arg[]) {
	student s1=new student();
	s1.name="stark";
	s1.subject="java";
	s1.mark=90;

	student s2=new student();
	s2.name="targeriyen";
	s2.subject="c#";
	s2.mark=85;
	
	student s3=new student();
	s3.name="barathean";
	s3.subject="python";
	s3.mark=99;
	
	student st[]=new student[3];
	st[0]=s1;
	st[1]=s2;
	st[2]=s3;
	
//	  for(int i=0;i<st.length;i++) {
//	  
//	  System.out.println(st[i].name+" | "+st[i].subject+" | "+st[i].mark );
//	  
//	  }
	
	for(student v:st) {
		System.out.println(v.name+":"+v.mark);
	}
	 

}
}
