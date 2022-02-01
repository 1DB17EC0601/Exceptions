package com.Multithreading;

public class MulDemo extends Thread {
	
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
		
    	MulDemo d = new MulDemo();
    	MulDemo d1 = new MulDemo();
    	
    	d.start();
        d1.start();
    	
	}

}
