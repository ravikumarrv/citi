
public class Two 
{
	
	private static test t;
	
	public Two()
	{
		
	}
	
	public static test getIstance()
	{
		if(t==null)
		{
			t=new test();
			
		}
		return t;
	}
	
	public Object  clone()
	
	{
		return t;
	}
	
}
