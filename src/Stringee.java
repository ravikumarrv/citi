
public class Stringee {
	
	public static void main(String arg[]){
		String s="hello";
		String  s1="hello";
		String s2= new String("hello");
		String s3=new String("hello");
		
//		System.out.println(s==s1);
//		System.out.println(s2==s3);
		System.out.println(s2.equals(s3));//ture
		System.out.println(s==s3);
		System.out.println(s2.equals(s3));
		System.out.println(s.concat(s3));
		
		
	}

}
