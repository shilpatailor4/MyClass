
public class StarPrint2 {

	public static void main(String[] args) {
		
		//int number = 4;
		 
      /*  for (int i = 0; i < number; i++) {
            if (i == 0 || i == 3) {
                for (int j = 0; j < number; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            if (i >= 1 && i <= 2) {
                for (int j = 0; j < number; j++) {
                    if (j == 0 || j == 3) {
                        System.out.print("*");
                    } else if (j >= 1 && j <= 2) {
                        System.out.print(" ");
                    }
                }
                System.out.println();
            }
        }  */
		
		//Second method
		
		for(int i=1; i<=4; i++) {
			
			for(int j=1; j<=4; j++) {
				
				if(j==0 || j==4 || i==0 || i==4) {
					
					System.out.print("* ");
				}
				
				else {
					
					System.out.print("  ");
				}
			}
			
			System.out.println( );
		}
    }  
}