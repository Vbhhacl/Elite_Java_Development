package mmoce.bank;

public class TestAccount {
	public static void main(String[] args) {
		
		Account ac = new Account(5000);
		System.out.println(ac);
		
		//ac.withdraw(50000);
		//System.out.println(ac);
		
		try {
			ac.withdraw(50000);
		}catch(BalanceException e) {
			e.printStackTrace(); //developer
			System.out.println(e); //logging
			System.out.println(e.getMessage()); //end user
		}
				
		
		//ac.withdraw(3000);
		//System.out.println(ac);
		
		//ac.withdraw(7000);
		//System.out.println(ac);
		
		//ac.deposit(2000);
		//System.out.println(ac);
		
		//ac.deposit(5000);
		//System.out.println(ac);
		
	}
}
