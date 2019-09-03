
public class Example1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String cat;
		
		int age = 20;
		 
		if(age < 22 ) {
			
			System.out.println("Not Eligible for any category");
		}
		
		else if((age > 22) && (age < 24)) {
			
			System.out.println("Eligible for General category");
		}
		
		else if((age> 22) && (age < 36)) {
			
			System.out.println("Eligible for OBC category");
		}
		
		else if(age<30) {
			
			System.out.println("Eligible for SC category");
		}
		
		else if(age<32) {
			
			System.out.println("Eligible for ST category");
		}
		
		else {
			
			System.out.println("Invalid");
		}
		
		
		
	}

}
