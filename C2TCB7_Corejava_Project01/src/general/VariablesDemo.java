package general;



public class VariablesDemo {
	 int a = 1024;
     int b;
      
     void func1() {
    	 int c;
    	 c=10;
    	 System.out.println("class variable" + a +" "+b);
    	 System .out.println("local variable" +c);
    	 a = 7890;
    	 b = 56;
    	 System.out.println("class variable" + a +" "+b);
    	 
    	 }
     void func2 () {
    	 System.out.println("class variable" + a + " "+b);
    
     }
     void func3() {
    	 System.out.println("local variable" + a + " "+b);
     }
     public static void main(String[] args) {
    	 VariablesDemo obj= new VariablesDemo();
    	 obj.func1();
    	 obj.func2();
    	 obj.func3();
    	}
}
	

