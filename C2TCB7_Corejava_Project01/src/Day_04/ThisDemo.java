package Day_04;

class Animal {
	int legs;
	String name;
	String color;
	

public Animal() {
	System.out.println("this is default constructor");
	
}
public Animal(String name) {
	this();
	this.name=name;
}
public Animal(String name,String color) {
	this.name=name;
	this.color=color;
}
public Animal(int legs,String name,String color) {
	this.legs=legs;
	this.name=name;
	this.color=color;
}

void display() {
	System.out.println("Animal Description");
	System.out.println(color+" "+"color"+" "+name+" "+"with"+" "+legs+" "+"legs");
}
public class ThisDemo {

	public static void main(String[] args) {
		Animal obj1=new Animal(4,"dog","white");
		obj1.display();
		
		Animal obj2=new Animal(2,"crow","black");
		obj2.display();
		
		Animal obj3=new Animal("cat","white");
		obj3.display();

	}

}
 }

