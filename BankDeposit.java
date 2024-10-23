public class BankDeposit {
	public static void main(String args[])
	{
		int balance=75000;
		int amount=25000;
		System.out.println("Balance before deposit: "+balance);
		System.out.println("Amount to be deposited: "+amount);
		balance=balance+amount;
		System.out.println("Balace after deposit: "+balance);
	}

}
