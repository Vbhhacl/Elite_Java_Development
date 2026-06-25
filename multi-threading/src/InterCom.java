class Data {
	private int value;
	private boolean flag;
	
	public synchronized void set() {
		if (flag)
			try { wait(); } catch (InterruptedException e) {}
		value = (int) (Math.random() * 100);
		System.out.println("Set: "+value);
		flag = !flag;
		notify();
	}
	
	
	public synchronized void get() { 
		if (!flag)
			try { wait(); } catch (InterruptedException e) {}
		
		System.out.println("Get: "+value);
		flag = !flag;
		notify();
	}
}

class Producer extends Thread {
	private Data data;
	
	public Producer(Data data) {
		this.data = data;
	}
	@Override 
	public void run() {
		while(true) {
			data.set();
		}
	}	
}

class Consumer extends Thread {
	private Data data;
	
	public Consumer(Data data) {
		this.data = data;
	}
	@Override 
	public void run() {
		while(true) {
			data.get();
		}
	}		
}

public class InterCom{
	public static void main(String[] args) {
		Data data = new Data();
		Producer p = new Producer(data);
		Consumer c = new Consumer(data);
		p.start();
		c.start();
	}
	
}