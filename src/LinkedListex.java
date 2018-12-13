
import java.util.LinkedList;
import java.util.List;

import java.util.Iterator;


public class LinkedListex {
	
	public static void main(String arg[]){
		List li= new LinkedList();
		li.add(2);
		li.add(4);
		li.add(1);
		li.add(3);
		
		Iterator it=li.iterator();
		
		while(it.hasNext()){
			
			Object obj=it.next();
			System.out.println(obj);
			
		}
		
		
	}

}
