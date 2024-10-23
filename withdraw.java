package evenodd;

public class withdraw {
	public static void main(String args[])
	{
		int balance=100000;
		int amount=25000;
		System.out.println("Balance before withdrawal: "+balance);
		System.out.println("Amount to be withdrawn: "+amount);
		balance=balance-amount;
		System.out.println("Balance after withdrawal: "+balance);
	}

}
