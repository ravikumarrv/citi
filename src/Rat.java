
import java.io.Serializable;


 class Rat implements Serializable {
	
	 Dog d=new Dog();
}
class Dog implements Serializable{
	
	Cat c=new Cat();
}

class Cat implements Serializable{
	int j=20;
}