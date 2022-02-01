package com.Multithreading;

public class MulRunnable implements Runnable{
	
	//implement run method
    public void run()
    {
        for(int i=1;i<=5;i++)
        {
            System.out.println(i+ " "+Thread.currentThread().getName());
            
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
    
    public static void main(String[] args) {
		
    	MulRunnable s = new MulRunnable();
    	MulRunnable s1 = new MulRunnable();
    	
    	
    	((Thread) s).start();
    	s1.start();
    	
    	
	}

	
}
