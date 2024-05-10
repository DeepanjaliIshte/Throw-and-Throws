// Write a java program to work with throws keyword

import java.util.Scanner;

public class Throws_Demo_1
{
	Scanner sd= new Scanner(System.in);
	void f1() throws ArithmeticException
	{
		System.out.println(" Enter two number: ");
		int a= sd.nextInt();
		int b=sd.nextInt();
		int c=a+b;
		System.out.println("Result= "+c);
	}
	void f2() throws StringIndexOutOfBoundsException
	{
		System.out.println("Enter index : ");
		int index=sd.nextInt();
		String F="India";
		char ch=F.charAt(index);
		System.out.println("Char: "+ch);
	}
}

