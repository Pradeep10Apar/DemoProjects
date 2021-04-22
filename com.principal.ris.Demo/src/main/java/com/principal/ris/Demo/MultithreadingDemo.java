package com.principal.ris.Demo;


public class MultithreadingDemo {
	
	
	
	public static void main(String args[]){
		
		
			MyThread t1= new MyThread();
			Thread thread1 = new Thread(t1);
			thread1.start();
			for(int i =0; i<10; i++){
				
				System.out.println("inside main thread method, current thread is "
						+ "" + Thread.currentThread().getId());
			}
			
			System.out.println("****************************************");
			
			
			
			
			
		
	}
	
	
	
	
	

	
	
	
	
	

}
