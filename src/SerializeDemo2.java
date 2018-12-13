import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;


public class SerializeDemo2 {

	
	public static void main(String arg[]) throws Exception
	{
	
	Dog d=new Dog();
	
	FileOutputStream fs=new FileOutputStream("abs.txt");
	ObjectOutputStream s=new ObjectOutputStream(fs);
	s.writeObject(d);
	
	FileInputStream fos=new FileInputStream("abs.txt");
	ObjectInputStream ois=new ObjectInputStream(fos);
	Dog d2=(Dog)ois.readObject();
	
	System.out.println(d2.c.d);
	
}

}
