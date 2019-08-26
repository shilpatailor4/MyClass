package Oops;

class One
{
	public void print_Greeks()
	{
		System.out.println("Greeks");
	}
}

class Two extends One
{
	public void print_for()
	{
		System.out.println("for");
	}
}

class Three extends Two
{
	public void print_Test()
	{
		System.out.println("Test");
	}
}
public class Main_Inheritance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Three obj = new Three();
		obj.print_Greeks();
		obj.print_for();
		obj.print_Test();

	}

}
