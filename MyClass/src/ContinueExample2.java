
public class ContinueExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int counter =10;
		
		while(counter>=0) {
			
			if(counter==7) {
				
				counter--;
				continue;
				
			}
			
			System.out.print(counter+" ");
			counter--;
		}

	}

}
