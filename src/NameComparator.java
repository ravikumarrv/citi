
import java.util.*;

public abstract class NameComparator implements Comparator {
	
	public int Compare(Object o1,Object o2){
		
		Student s=(Student)o1;
		Student s2=(Student)o2;
		return s.name.compareTo(s2.name);
		
		
		
	}

}
 