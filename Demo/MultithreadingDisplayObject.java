package com.principal.ris.Demo;

import javax.sql.rowset.spi.SyncResolver;

public class MultithreadingDisplayObject {
	
	
	String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	
	
	
	public static synchronized void wishGoodMorning(String s){
		
		for(int i =0 ;i<10; i++){
			System.out.println(Thread.currentThread().getName());
			System.out.println("Good Morning:" + ":" + "I am"+ Thread.currentThread().getName() +"thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(s);
			
		}
		
	}
	
	
	
public static synchronized void wishGoodAfternoon(String s){
		
		for(int i =0 ;i<10; i++){
			System.out.println(Thread.currentThread().getName());
			System.out.println("Good Afternoon:" + ":" + "I am"+ Thread.currentThread().getName() +"thread");
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(s);
			
		}
		
	}





public static synchronized void sayHi(String s){
	
	for(int i =0 ;i<10; i++){
		System.out.println(Thread.currentThread().getName() +":"+ "I am"+ Thread.currentThread().getName() +"thread");
		System.out.println("Hi:");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
		
	}
	
}



public static synchronized void sayBye (String s){
	
	for(int i =0 ;i<10; i++){
		System.out.println(Thread.currentThread().getName()+ "" + "I am"+ Thread.currentThread().getName() +"thread");
		System.out.println("Bye:");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
		
	}
	
}



public void sayGoodNight(String s){
	
	for(int i =0 ;i<10; i++){
		System.out.println(Thread.currentThread().getName());
		System.out.println("Good Night"+ ":" + "Bye Thread");
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(s);
		
	}
	
}
	
}
