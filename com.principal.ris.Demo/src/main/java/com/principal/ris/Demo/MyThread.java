package com.principal.ris.Demo;


public class MyThread implements Runnable{
		
		public void run(){
			for(int i =0; i<10; i++){
				System.out.println("inside Run method, current thread is "
						+ "" + Thread.currentThread().getId());
			}
			
		}
		

}
