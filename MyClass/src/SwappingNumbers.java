
public class SwappingNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a,b,c;
		
		a=5;
		b=6;
		
		//first condition
		
		/*
		 a=a+b; 
		 b=a-b; 
		 a=a-b;
		 */
		
		
		//Second condition
		c=a+b;
		a=c-a;
		b=c-b;
		
		System.out.println("Value a =:" +a);
		System.out.println("Value b =" +b);
		
		
				
				
	}

}
