package com.Multithreading;

public class MainThread {
            
	
public static int count=0;
    
    public void run()
    {
        while(MainThread.count<=10)
        {
            try {
                
                System.out.println("My Thread "+ (++MainThread.count));
                Thread.sleep(1000);
                
            } catch (Exception e) {
                System.out.println("Error Occured "+e);
            }
        }
            public static void main(String[] args)
            {
            	
            }
    
    }
}
