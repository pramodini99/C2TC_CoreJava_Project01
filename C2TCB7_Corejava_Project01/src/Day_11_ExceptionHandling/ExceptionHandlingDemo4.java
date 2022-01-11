package Day_11_ExceptionHandling;

public class ExceptionHandlingDemo4 {

	public static void main(String[] args) {
		int[] arr=new int[4];
		int a=45;
		int b=0;
		
		try
		{
			arr[3]=35;
			int c=a/b;
			System.out.println(" in try block");
			}
		catch(ArrayIndexOutOfBoundsException ae)
		{
			System.out.println("Exception in try block");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("Exception in try block");
		}
	
	finally
	{
		System.out.println("in finally block");
	}
      System.out.println("in the class");
}
}


