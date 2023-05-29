package hu.me.counter;

import java.util.concurrent.locks.ReentrantLock;

public class Counter extends Thread {
	//static nem jó?
	public static int countedNumber = 0;
	
	//CountedNumber counter = new CountedNumber();
	ReentrantLock lock = new ReentrantLock();
	
	public void run()
    {
        try {
        	for (int i =0; i < 100; i++) {
        		Thread.sleep((long) (Math.random() * 500));            	
            	
                lock.lock();
                try {
                	countedNumber++;
                	//counter.setCountedNumber(counter.getCountedNumber()+1);
                } finally {
                	lock.unlock();
                }
                
                System.out.println( Thread.currentThread().getId() + ". thread: " + countedNumber);	
            	//System.out.println( Thread.currentThread().getId() + ". thread: " + counter.getCountedNumber());
        	}
        	
        	/*
            System.out.println(
                "Thread " + Thread.currentThread().getId()
                + " is running"); 
            */      
        }
        catch (Exception e) {
            System.out.println("Exception is caught");
        }
    }
	
	public static void main(String[] args) throws InterruptedException
    {
        int n = 30; // Number of threads
        
        for (int i = 0; i < n; i++) {       	
        	
            Counter object
                = new Counter();
            object.start();    
            
            //countedNumber++;
            //System.out.println("For number " + countedNumber);
        }
        
        //System.out.println("\nThe final number was: " + countedNumber +"\n");
    }
	 
}