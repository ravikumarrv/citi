
public class R {

	 static int x=888;
	
	public void m(){
		System.out.println("super class");
	}
	
}
class S extends R{
	
	static int x=999;
	
	public void m(){
		System.out.println("subclass");
	}
	
	
}

