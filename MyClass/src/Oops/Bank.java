package Oops;

public class Bank {
	
	private String name;
	private int age = 25;
	private long mobile;
	private float total_bal;
	
/*  Bank()
	{
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.total_bal = total_bal;
	}  */
	
	public void add(String name, int age, long mobile, float total_bal)
	{
		this.name = name;
		this.age = age;
		this.mobile = mobile;
		this.total_bal = total_bal;
		
		
	}

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public long getMobile() {
		return mobile;
	}

	public float getTotal_bal() {
		return total_bal;
	}
	
	public void credit(float crdeit)
	{
		this.total_bal = total_bal + crdeit;
		System.out.println("The total balance is Rs. " +this.total_bal + " and credited balnace is Rs. " +crdeit);
	}
	
	public void debit(float debit)
	{
		if(total_bal >= debit)
		{
			this.total_bal = total_bal - debit;
			System.out.println("The total balance is Rs. " +this.total_bal + " and debited balnace is Rs. " +debit);
		}
		
		else
		{
			System.out.println("Not sufficient balance and the total balance is Rs. " +this.total_bal);
		}
	}
	
	
	

}
