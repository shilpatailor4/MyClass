
public class MethodClass {
	
	/*
	  public static int add(int a, int b) { int a=10; System.out.println(a+b); }
	 */
	
	public static int  add(int a, int b, int c) 
	{
		return(a+b+c);
	}
	
	public static void add(int a, int b) 
	{
		System.out.println(a+b);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	    int a = add(4, 5, 6);
		System.out.println(a);
		add(3, 4);
		
		

	}

}
