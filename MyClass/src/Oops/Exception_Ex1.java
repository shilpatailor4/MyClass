package Oops;

public class Exception_Ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = null;

		int[] arr = new int[4];

		try {
			int i = arr[4];
			System.out.println(i);
			System.out.println(str.length());
		}

		
		  catch(ArrayIndexOutOfBoundsException ex) {
		  System.out.println("Hi! I want to execute " +ex); }
		  
		  catch(NullPointerException e) {
		  System.out.println("String length is not defined " +e); }
		  
		 
		catch (Exception e) {
			System.out.println("I don't understand this error");
		}

	}

}
