
final class Immub{
	
	private int i;
	
	 Immub(int i){
		 	this.i=i;	
	}
	 
	 public Immub modify(int i){
		 if(this.i==i)
			 return this;
		return (new Immub(i));
	 }


	 Immub t1=new Immub(10);
	Immub t2=new Immub(100);
	
	
	
	 
}