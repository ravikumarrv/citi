
public class RunTimeExcetion {
	
	
	public static void main(String arg[]){
		
		int age=Integer.parseInt(arg[0]);
		
		if(age>60){
			throw new TooyoungException("hello ");
		}
		else if(age<18){
			throw new ToooldExcepiton("no voice");
		}
		
		else {
			
			System.out.println("you will get mathe details by mail");
		}
	}

}
