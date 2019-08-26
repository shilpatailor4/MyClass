package Oops;

interface One
{
	public void print_greek()
	{
		System.out.println("One");
	}
}

interface Two1
{  
	public void print_for()
	{
		System.out.println("Two");
	}
	
}

interface Three extends One, Two
{
	public void print_greek()
	{
		System.out.println("Three");
	}
}

class Child implements Three
{
	//Override
	public void print_greek()
	{
		System.out.println("Foruth");
	}
	
	public void print_for()
	{
		System.out.println("fifth");
	}
}

public class Main_Inheritance2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Child obj = new Child();
		obj.print_greek();
		obj.print_greek();

	}

}
