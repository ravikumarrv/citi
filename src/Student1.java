import java.lang.ClassCastException;


class Student1{
	String name;
	int rollno;
	
	Student1(String name,int rollno){
		
		this.name=name;
		this.rollno=rollno;
		
	}
	
	public static void main(String arg[]){
		
		Student1 s1=new Student1("ravi",100);
		Student1 s2=new Student1("kumar",101);
		Student1 s3=new Student1("ravi",100);
		
		Student1 s4=s1;
		
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
	}
	
//	public boolean equals(Object o)
//	{
//	try{
//		String name=this.name;
//		int rollno=this.rollno;
//		Student1 s1=(Student1)o;
//		String name1=this.name;
//		int rollno1=this.rollno;
//		if(name.equals(name1)&& rollno==rollno1)
//		{
//			return true;
//		}
//		else
//		{
//			return false;
//		}
//			
//	}
//	catch(ClassCastException e){
//		return false;
//	}
//		catch(NullPointerException e){
//			return false;
//		}
//	
//	}
//	
//	public static void main(String arg[]){
//	Student1 s1=new Student1("ravi",100);
//	Student1 s2=new Student1("kumar",101);
//	Student1 s3=new Student1("ravi",100);
//	
//	
//	System.out.println(s1.equals(s2));
//	System.out.println(s1.equals(s3));
//	System.out.println(s1.equals(null));
//}

	
}