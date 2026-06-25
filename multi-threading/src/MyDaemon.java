public class MyDaemon extends Thread{
	private int limit;
	
	public MyDaemon(int limit, String name) {
		super(name);
		this.limit = limit;
	}
	
	@Override	
	public void run() {		
		String tname = Thread.currentThread().getName();
		for(int c = 1; c<= limit; c++) {
			System.out.println(tname + " : "+ c);			
		}
	}
	
	public static void main(String[] args) {
		
		MyDaemon t1 = new MyDaemon(50,"First");
		MyDaemon t2 = new MyDaemon(100,"Second");
		MyDaemon t3 = new MyDaemon(150,"Third");
		
		MyDaemon t4 = new MyDaemon(100000,"Fourth");
		t4.setDaemon(true);
		
		t1.start();
		t2.start();
		t3.start();
		t4.start();
	
	}
}
