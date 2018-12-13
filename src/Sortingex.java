
import java.util.*;
import java.io.*;

public class Sortingex {
	
	public static void main(String arg[]){
		
		ArrayList ar=new ArrayList();
		ar.add(new Student(20,"ravi",101));
		ar.add(new Student(21,"kumar",102));
		ar.add(new Student(22,"kiran",103));
		
		
		Collections.sort(ar, new NameComparator());
		
		Iterator it =ar.iterator();
		
		while(it.hasNext()){
			Student s=(Student)it.next();
			
		System.out.println(s);
		}
		
	}

}
