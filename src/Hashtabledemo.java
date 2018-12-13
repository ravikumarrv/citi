
import java.util.Hashtable;
import java.util.Enumeration;
import java.util.Collection;
import java.util.Set;


public class Hashtabledemo {
	
	public static void main(String arg[]){
		
		Hashtable ht=new Hashtable();
		
		ht.put("ravi",100);
		ht.put("kiran",101);
		
		Enumeration e=(Enumeration) ht.entrySet();
				while(e.hasMoreElements()){
			System.out.println(e.nextElement());
		}
	}

}
