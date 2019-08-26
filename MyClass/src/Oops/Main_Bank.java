package Oops;

public class Main_Bank {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank ravi = new Bank();
		ravi.add("Ravi Sharma", 27, 987989, 5000);
		System.out.println("Name: "+ ravi.getName() + ", " + " Age: " +ravi.getAge() +", "+ "Mobile number: " +ravi.getMobile() + ", "+ "Total Bal: "+ravi.getTotal_bal());
        System.out.println();
		
        System.out.println("The credited and debited balance is: ");
		ravi.credit(5000.1f);
       
        ravi.debit(5000);
       
        ravi.debit(40000);
       
		
		

	}



}
