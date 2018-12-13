import java.util.Scanner;


public class One {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		System.out.println("String :");
		
		String str=sc.nextLine();
		System.out.println("Revers String");
		
		for(int i=1;i<=str.length();i++){
			
			System.out.print(str.charAt(str.length()-i));
		}

	}

}
