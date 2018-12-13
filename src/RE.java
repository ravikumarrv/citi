import java.util.Scanner;
public class RE {
	
	public static void main(String arg[]){
		
		Scanner sr=new Scanner(System.in);
		System.out.println("String");
		String str= sr.nextLine();
		System.out.println("reverString");
		
		for(int i=1;i<=str.length();i++){
			
			System.out.print(str.charAt(str.length()-i));
			
		}
		System.out.println();
	}

}
