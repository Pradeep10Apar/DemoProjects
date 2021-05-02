package com.principal.ris.Demo;

public class SingletonWithMultithreading extends Thread{
	
	
	// non synchronized
	public void run()
	{
		System.out.println("**********" + "Invoking run method" + "**********" +"current thread is :"+ getId());
		Singleton s = Singleton.getInstance();
		System.out.println(s.hashCode());
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.hashCode());
		
		System.out.println("**********");
		
		
	}
	
	
	//synchronized
	public void run2()
	{
		System.out.println("**********" + "Invoking run method" + "**********" +"current thread is :"+ getId());
		Singleton s = Singleton.getSynchronizedInstance();
		System.out.println(s.hashCode());
		
		Singleton s1 = Singleton.getSynchronizedInstance();
		System.out.println(s1.hashCode());
		
		System.out.println("**********");
		
	}
	
	
	

}
