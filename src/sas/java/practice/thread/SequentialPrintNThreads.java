package sas.java.practice.thread;

import java.util.concurrent.BlockingQueue;
import java.util.concurrent.LinkedBlockingQueue;

public class SequentialPrintNThreads {
	
	public static void main(String[] args) {
		Worker w1 = new Worker();
		Worker w2 = new Worker();
		Worker w3 = new Worker();
		w1.setNextWorker(w2);
		w2.setNextWorker(w3);
		w3.setNextWorker(w1);
		
		Thread t1 = new Thread(w1, "w1");
		Thread t2 = new Thread(w2, "w2");
		Thread t3 = new Thread(w3, "w3");
		
		t1.start();
		t2.start();
		t3.start();
		
		w1.insertBq(1);
	}

}

class Worker implements Runnable{
	
	BlockingQueue<Integer> bq = new LinkedBlockingQueue<Integer>();
	Worker nextWorker = null;
	
	public void setNextWorker(Worker w){
		nextWorker = w;
	}
	
	public void insertBq(Integer number){
		bq.add(number);
	}

	@Override
	public void run() {
		
		while(true){
			
			try {
				Integer num = bq.take();
				System.out.println(Thread.currentThread().getName()+" = "+num);
				Thread.sleep(1000);
				
				if(num > 10){
					break;
				}else{
					nextWorker.insertBq(++num);
				}
					
				
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
		
	}
}

