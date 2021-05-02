package com.principal.ris.Demo;

public class Singleton {
	
	private static Singleton obj = null;
	
	
	
	private Singleton(){
		
	}
	
	
	//Without synchronization
	public static Singleton getInstance(){
		
		if(obj==null){
			obj= new Singleton(); 
		}
		return obj;
		
	}
	
	
	
	//Without synchronization
		public static synchronized Singleton getSynchronizedInstance(){
			
			if(obj==null){
				obj= new Singleton(); 
			}
			return obj;
			
		}
	
	

}
