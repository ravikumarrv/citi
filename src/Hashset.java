
import java.util.HashSet;
import java.util.Set;
import java.util.Iterator;





public class Hashset {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set s=new HashSet();
		
		s.add(3);
		s.add(4);
		s.add(2);
		s.add(1);
		
		Iterator it=s.iterator();
		
		while(it.hasNext()){
			Object obj=it.next();
			System.out.println(obj);
		}
	}

}
