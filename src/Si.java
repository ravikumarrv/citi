
public class Si
{ 
private static test t;

private Si(){
	
}

private static test getIstance(){
	if(t==null){
		t=new test();
		
	}
	return t;
}

public Object Clone(){
	return this;
}
}
