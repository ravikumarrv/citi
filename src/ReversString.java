
import java.util.Scanner;

public class ReversString {
	
	public static void main(String arg[]){
		
		
		Scanner scr= new Scanner(System.in);
		System.out.println("Enter String:");
		String str =scr.nextLine();
		System.out.println("Reverse String:");
		
		for(int i=1;i<=str.length();i++)
		{
			
			System.out.println(str.charAt(str.length()-1));
			
		}
		
		System.out.println();
		
	}

}
