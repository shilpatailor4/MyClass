
public class IfElseExample {

	public static void main(String[] args) {
		
		int a,b,c;
		
		a=500;
		b=60;
		c=12;
		
		if((a>b) && (a>c)) {
			
			System.out.println("A is greater");
		}
		
		if((b>c) && (b>a)) {
			
			System.out.println("B is greater");
		}
		
		if((c>a) && (c>b)) {
			
			System.out.println("C is greatre");
		}
		

	}

}
