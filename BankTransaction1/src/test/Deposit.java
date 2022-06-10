package test;
public class Deposit implements Transaction {
public void process(int amt)
{
	System.out.println("Amt Deposited:"+amt);
	b.bal=b.bal+amt;
	b.getBalance();
	System.out.println("Transaction Completed...");
}
}
