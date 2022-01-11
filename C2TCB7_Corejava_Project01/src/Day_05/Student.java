package Day_05;


public class Student {
	
	int age;
	String name;
	String gender;
	String branch;
	
	public Student()
	{
		
	}
	
	public Student(int age,String name,String gender,String branch)
	{
		this.age=age;
		this.name=name;
		this.gender=gender;
		this.branch=branch;
	}
	
	public void Student3(int age,String name,String gender,String branch)
	{
		this.age=age;
		this.name=name;
		this.gender=gender;
		this.branch=branch;
	}
	
	public String toString() {
	String str="("+age+" "+name+" "+gender+" "+branch+")";
	return str;
}
	public static void main(String[] args) {
		Student s1=new Student();
		s1.age=22;
		s1.name="priya";
		s1.gender="f";
		s1.branch="CSE";
		System.out.println(s1.toString());
		
		Student s2=new Student(32,"kiran","m","IS");
		System.out.println(s2.toString());
		
		Student s3=new Student();
		s3.age=24;
		s3.name="amrutha";
		s3.gender="f";
		s3.branch="CSE";
		System.out.println(s3.toString());
		
		
	}

}
