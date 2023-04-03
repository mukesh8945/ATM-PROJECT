package p1;
public class withDraw implements Transaction {
	public void process(int amt) {
		if(amt<b.bal) {
			System.out.println("Amt WithDrawn:"+amt);
			b.bal = b.bal-amt;
			System.out.println("Balence amt:"+b.getBalance());
			System.out.println("Transction Successfull......");
		}else {
			System.out.println("InSufficient fund......");
		}
	}
	

}
