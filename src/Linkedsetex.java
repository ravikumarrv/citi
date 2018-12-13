import java.util.Set;
import java.util.LinkedHashSet;
import java.util.Iterator;


public class Linkedsetex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set s= new LinkedHashSet();
		s.add(2);
		s.add(4);
		s.add(1);
		s.add(3);
		Iterator it =s.iterator();
		
		while(it.hasNext()){
			Object obj=it.next();
			
			System.out.println(obj);
		}

	}

}
