package Day_07;

class Base
{
	static int i;
	
	static void m1()
	{
		i=10;
		System.out.println("hi in a base class");
		
	}
}

class Derived1 extends Base
{
	int j;
	void m2()
	{
		System.out.println("hi in a derived1 class");
	}
}

class Derived2 extends Base
{
	int k;
	void m3()
	{
		System.out.println("hi in a derived2 class");
	}
}

class Derive3 extends Base
{
	int l;
	void m4()

{
		System.out.println(" hi in a derived3 class");
		}
}
class Derived4 extends Derived1
{
	int m;
	void m5()

{
		System.out.println("hi in a derived4 class");
		}
}
public class HierachalInheritanceDemo {

	public static void main(String[] args) {
		Derived1 obj=new Derived1();
		Base.m1();
		obj.m2();
		Derived2 obj1=new Derived2();
		obj1.m1();
		obj1.m3();
		Derived4 obj2=new Derived4();
		obj2.m1();
		obj2.m2();
		obj2.m5();
	}

}

