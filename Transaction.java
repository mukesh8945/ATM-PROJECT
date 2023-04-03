package p1;
public interface Transaction {
	public static final Balence b = new Balence();
	public abstract void process(int amt);

}
