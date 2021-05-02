package com.principal.ris.Demo;


public class MyThread extends Thread{
	
	MultithreadingDisplayObject m ;
	int switchCase;
	String wish;
	
		MyThread(MultithreadingDisplayObject s, int n, String name){
			this.m =s;
			this.switchCase=n;
			m.name= name;
			
		}
		
		public void run(){
			
			if(switchCase==1){
			MultithreadingDisplayObject.wishGoodMorning("Morning time ");	
			}
			
			if(switchCase==2){
				MultithreadingDisplayObject.wishGoodAfternoon("afternoon time");	
			}
			
			
			if(switchCase==3){
				MultithreadingDisplayObject.sayHi("Hi Time");	
			}
			
			if(switchCase==4){
				m.sayBye("time to go");	
			}
			
			
			
		}
		

}
