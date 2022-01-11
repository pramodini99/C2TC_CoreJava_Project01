package Day_11_ExceptionHandling;

public class ExceptionHandlingDemo3 {

	public static void main(String[] args) {
		int[] arr=new int[4];
		try
		{
			                                                                    //arr[4]=34;    
			arr[5]=35;
			System.out.println("In try block");
		}
		catch(ArrayIndexOutOfBoundsException ae)
				{
		        System.out.println("exception in try block");
		}
	finally
	{
		System.out.println("in finally block");
	}
		System.out.println("In the class");
	}

}

