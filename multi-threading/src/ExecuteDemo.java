import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

class GoRunnable implements Runnable{
	private final long countUntil;
	GoRunnable(long countUntil){
		this.countUntil = countUntil;
	}
	public void run() {
		long sum = 0;
		for (long i= 1 ; i<countUntil; i++) {
			sum += i;
		}
		System.out.println(sum);
	}
}

public class ExecuteDemo {
	private static final int NTHREADS = 10;
	
	public static void main(String[] args) {
		//creating a pool of 10 threads 
		ExecutorService executor = Executors.newFixedThreadPool(NTHREADS);
		for (int i = 0 ; i<500 ; i++) { //500 threads to be executed
			Runnable worker = new GoRunnable(1000000L+ i);			
			executor.execute(worker); //assigning task to pooled thread
		}
		//this will make the executor accept no new thread
		//finish all existing threads in queue
		executor.shutdown();
		//wait until all threads are finish
		//executor.awaitTermination();
		while (!executor.isTerminated()) {			
		}
		System.out.println("Finished all threads!!");
	}

}
