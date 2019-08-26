
public class LinearSearch {

	public static void main(String[] args) {
		
		int a[] = {2, 3, 4, 5, 0, 7, 6, 4};
		int target=0;
		
		for(int i=0; i<a.length; i++) {
			
			if(a[i]==target) {
				
				System.out.println("Element array serach is:" +i);
				break;
			}
		}

	}

}
