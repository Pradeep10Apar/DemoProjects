package com.principal.ris.Demo;


public class MultithreadingDemo {
	
	
	
	public static void main(String args[]){
			
			
			MultithreadingDisplayObject n = new MultithreadingDisplayObject();
			
			MyThread t1= new MyThread(n,1,"GOOD Morning");
			
			MyThread t2= new MyThread(n,2,"GOOD AFTERNOON");
			
			MyThread t3= new MyThread(n,3,"Hi");
			
			MyThread t4= new MyThread(n,4,"Bye");
			
			
			Thread thread1 = new Thread(t1);
			Thread thread2 = new Thread(t2);
			Thread thread3 = new Thread(t3);
			Thread thread4 = new Thread(t4);
			
			thread1.setName("Mornings");
			thread2.setName("Afternoon");
			thread3.setName("How Are You");
			thread4.setName("Meet soon");
			
			
			thread1.start();
			thread2.start();
			thread3.start();
			thread4.start();
			
			
		
	}
	
	
	
	
	

	
	
	
	
	

}
