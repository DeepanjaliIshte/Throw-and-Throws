	// Demonstrate of throw Exception 

public class Throw_Example 
{	
	static void demoproc()
	{
		try
		{
			throw new NullPointerException();
		}
		catch(NullPointerException npe)
		{
			System.out.println("Exception caught inside demoproc");
			throw npe;	// rethrow the exception
		}
	}
	public static void main(String[] args) 
	{
		try
		{
			demoproc();
		}
		catch(NullPointerException r)
		{
			System.out.println("Recaught: "+r );
		}
	}
}

