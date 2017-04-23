package framework;

public class Main {

	public static void main(String[] args) {
		 Manager manager=new Manager();
	        UnderlinePen upen=new UnderlinePen('~');
	        MessageBox mbox=new MessageBox('*');
	        MessageBox sbox=new MessageBox('/');
	        manager.register("strong", upen);
	        manager.register("warning", mbox);
	        manager.register("slash", sbox);

	        Product p1=manager.create("strong");
	        p1.use("Hello,world.");
	        Product p2=manager.create("warning");
	        p2.use("Hello,world.");
	        Product p3=manager.create("slash");
	        p3.use("Hello,world.");


	}

}
