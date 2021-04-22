package com.principal.ris.Demo;

public class SingletonDemo {
	
	
	
	public static void main(String args[]){
		
		
		// without synchronization
		Singleton s = Singleton.getInstance();
		System.out.println(s.hashCode());
		
		System.out.println("********************");
		
		Singleton s1 = Singleton.getInstance();
		System.out.println(s1.hashCode());
			
		
	}
	
	
	//WITH SYNC
	public static void mainS(String args[]){
		
		
		// with synchronization
		Singleton s = Singleton.getSynchronizedInstance();
		System.out.println(s.hashCode());
		
		System.out.println("********************");
		
		Singleton s1 = Singleton.getSynchronizedInstance();
		System.out.println(s1.hashCode());
		
		System.out.println("Main method starts");
	
	}
	
	
	
	
	
	
	

}
