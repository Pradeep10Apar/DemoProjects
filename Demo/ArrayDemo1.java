package com.principal.ris.Demo;

public class ArrayDemo1 {

	
	
	
	public static void main(String args[]){
		
		int[] a = {1,2,2,1,2,3,3,3,4,3,4,5,4,6,6,1,2,66,6,6,7,9, 100, 25, 24, 34, 3, 6, 5};
		
		//1) Remove duplicate
		//2) Sort 
		//3)find kth largest element
		
		int[] uniqueArray = {};
		
		for(int i=0; i<a.length ; i++){
			
			for(int j=0; j<uniqueArray.length; j++){
				
				if(a[i]!=uniqueArray[j]){
					uniqueArray[j] = a[i];
					
				}
				
			}
			
		}
		
		
		for(int j=0; j<uniqueArray.length; j++){
			
			System.out.println(uniqueArray[j]);
			
		}
		
		
		
		
		
		
		
		
	}
}
