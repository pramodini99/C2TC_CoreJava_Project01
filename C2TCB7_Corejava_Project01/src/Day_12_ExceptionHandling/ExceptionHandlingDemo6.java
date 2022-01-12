package Day_12_ExceptionHandling;

public class ExceptionHandlingDemo6 {

	public static void main(String[] args) {
	try
	{
		int x=10/10;
		try
		{
			int y=10/10;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
finally {
	System.out.println("finally block");
	try
	{
		int y=10/10;
	}
	catch(Exception e)
	{
		try
		{
			int z=30/30;
		}
		finally
		{
			System.out.println(" in finally under catch");
		}
	}
}
		
	}
}
	


