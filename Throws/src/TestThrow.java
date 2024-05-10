
public class TestThrow 
{
	 static void throw1() throws IllegalAccessException 
	 { 
		 System.out.println("Entered in throw1"); 
		 throw new IllegalAccessException("Testing.."); 
	 	} 
	 	public static void main (String args[]) 
	 	{ 
	 	try 
	 	{ 
	 		System.out.println("Before throw1");
	 		throw1(); 
	 	} 
	 	catch(IllegalAccessException e) 
	 	{ 
	 		System.out.println("Caught :" +e); 
	 	} 
	}//end of main 
}
