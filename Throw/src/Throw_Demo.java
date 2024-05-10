
public class Throw_Demo
{
	public static void main(String[] args) 
	{
		int s=10,d=07,h;
		h=s+d;
		try
		{
			throw new ArithmeticException();
		}
		catch(Exception e)
		{
			System.out.println("Exception Caught ");
			System.out.println("Addition: "+h);
		}
	}
}
