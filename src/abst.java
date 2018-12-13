
 abstract class abst {
	
	 abstract void m();
		 
	 }
 
  class bike extends abst{
	  
	  public void m(){
		  
		  System.out.println("runsafly......");
		  
	  }
	 
	  public static void main(String arg[]){
		  
		  abst at;
		  bike b = new bike();
		  
		  b.m();
	  }
	  
 }
