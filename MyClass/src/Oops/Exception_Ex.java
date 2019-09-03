package Oops;

public class Exception_Ex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a = 50;
		int b = 0;
		
		int[] arr = new int[10];
		
		try
		{
			System.out.println(a/b);
			System.out.println(arr);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println("Airthmatic exception error occurred");
		}
		
		catch(Exception e)
		{
			System.out.println("Can't get by zero" +e);
		}
		
		finally {
			
			System.out.println("Byyeee");
		}

	}

}
