package com.principal.ris.Demo;

public class SingletonWithMultithreadingDemo {
	
	
	public static void main(String args[]){
		
		
		long start = System.currentTimeMillis();
		System.out.println("Main method starts");
		for (int i = 0; i<100; i++){
			SingletonWithMultithreading s = new SingletonWithMultithreading();
			s.start();
			
		}
		
		long end = System.currentTimeMillis();
		System.out.println("Main method ends, time in miliseconds :");
		System.out.println(end-start);
		
		
		
		
		
		
		
		
	}

}
