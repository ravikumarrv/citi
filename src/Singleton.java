
 class Singleton {
	
	private static test t;
	
	private Singleton(){
		
	}
	public static test getInstance(){
		if(t==null){
			t=new test();
		}
		return t;
	}
	
	public Object clone(){
		return this;
	}
	
}
