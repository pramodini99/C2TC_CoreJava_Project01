package Day_03;

public class Employee {
	
	int id;
	String name;
	String email;
	Float salary;
	
	public Employee()
	{
	
	}
	
	public Employee(int id,String name,String email,Float salary) {
		this.id=id;
		this.name=name;
		this.email=email;
		this.salary=salary;
	}
	
	public Employee(String name) {
		this.name=name;
	}
	
	public String toString()
	{
		String str="("+id+","+name+","+email+","+salary+")";
		return str;
		
	}
	

	public static void main(String[] args) {
		Employee e1=new Employee();
		e1.id=101;
		e1.name="pramodini";
		e1.email="hjjkkjj";
		e1.salary=45.73f;
		System.out.println(e1.toString());
		
		Employee e2=new Employee( 102,"sahana","hjhjl",23f);
		System.out.println(e2.toString());
		
		Employee e3=new Employee("monika");
		System.out.println(e3.toString());
		
		
	}

}

