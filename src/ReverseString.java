
import java.util.Scanner;

public class ReverseString {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
	
		Scanner scar=new Scanner(System.in);
		System.out.println("enter new string:");
		String string=scar.nextLine();
		System.out.println("reverse string:");
		
		for(int i=1;i<=string.length();i++){
			System.out.print(string.charAt(string.length()-i));
			
		}
		System.out.println();
	}

}
