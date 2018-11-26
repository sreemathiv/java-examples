package threads;

import java.awt.Event;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadDemo {

	public static void main(String[] args) {
		
		/*Thread even = new Thread(new EvenThread());
		Thread odd = new Thread(new OddThread());
		
		even.start();
		odd.start();*/
		ExecutorService executor = Executors.newFixedThreadPool(2);
		executor.submit(new EvenThread());
		executor.submit(new OddThread());
		
		System.out.println("Main Method");
	}
	
	static class EvenThread implements Runnable {
		@Override
		public void run() {
			for(int i=0;i<1000;i+=2) {
				System.out.println(i);
			}
		}
		
	}
	
	static class OddThread implements Runnable {
		@Override
		public void run() {
			for(int i=1;i<1000;i+=2) {
				System.out.println(i);
			}
		}
		
	}

}
