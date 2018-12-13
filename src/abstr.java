
abstract class Car {
	
	int regno;
	
	Car(int  t){
		regno=t;
	}
	
	public void opentank(){
		System.out.println("fill");
	}

}

class maruti extends Car{
	
	maruti(int regno){
		super(regno);
			
		
	}
	
}


class abstr{
	
	public static void main(String arg[]){
		
		maruti m= new maruti(1000);
		
		
		Car cr;
		cr= m;
		m.opentank();
		
	}
	
	
}