
import java.util.Scanner;

public class Res {
	
	public static void main(String arg[]){
		
		
		Scanner scr =new Scanner(System.in);
		
		System.out.println("enter string:");
		
		String str=scr.nextLine();
		
		System.out.println("Reverse string:");
		
		for(int i=1;i<=str.length();i++){
			
			System.out.print(str.charAt(str.length()-i));
		}
	}

}
