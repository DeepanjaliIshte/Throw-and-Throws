
public class Throws_1_2_Test
{
	public static void main(String[] args)
	{
		try
		{
			Throws_Demo_1 obj=new Throws_Demo_1();
			obj.f1();
			obj.f2();
			Throws_Demo_2 ob=new Throws_Demo_2();
			ob.f3();
		}
		catch(ArithmeticException ae)
		{
			System.out.println(ae.getMessage());
		}
		catch(StringIndexOutOfBoundsException se)
		{
			System.out.println(se);
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
	}

}
