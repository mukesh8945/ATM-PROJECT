package p1;
public class Deposit implements Transaction {
	public void process(int amt) {
		System.out.println("Amt deposited:"+amt);
		b.bal = b.bal+amt;
		System.out.println("Balence Amt:"+b.getBalance());
		System.out.println("Transaction Successfull.....");
	}
	

}
