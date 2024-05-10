import java.util.Scanner;

public class Throws_Demo_2
{
	void f3() throws Exception
	{
		Scanner sd= new Scanner(System.in);
		System.out.println("Enter class name: ");
		String cn=sd.next();
		Class.forName(cn);
		System.out.println("class loaded");
	}
}
