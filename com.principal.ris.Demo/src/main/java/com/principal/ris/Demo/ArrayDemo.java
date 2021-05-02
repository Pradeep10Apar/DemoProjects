package com.principal.ris.Demo;

import java.util.HashSet;
import java.util.Set;

public class ArrayDemo {
	
	
	
	
	
	private static int[] copyElements(int a[], int b[]){
		
     int newArray[] = new int [a.length+b.length+1];
     
     for (int i = 0; i<a.length ; i++){
    	 newArray[i] = a[i];
    	 System.out.println(newArray[i]);
	}
     
     for (int i = 0; i<b.length ; i++){
    	 newArray[b.length+i] = b[i];
    	 System.out.println(newArray[b.length+i]);
	}
     
	return newArray;
	}
	
	
	
	
	public static void main(String arg[]){
		
		int a[] = new int[]{1, 2, 3, 4,5};
		int b[] = new int[]{6,7,8,9,10};
		int d [] = new int[]{1,2,8 ,3,2,2,2,5,1};
		int c[]=copyElements(a, b);
		
		findFrequency(d);
		
		
		
		
		System.out.println(c);
		
	}




	private static void findFrequency(int[] d) {
		Set<Integer> s = new HashSet<Integer>();
		int visited = -788;
		for (int i=0; i<d.length ; i++){
			int frequency = 1;
			if(visited!=d[i]){
			for(int j=0;j<d.length ; j++){
				if(d[i]==d[j] && i!=j){
				frequency++; 
				visited = d[i];
				}
			}
			System.out.println("Frequency of"+ d[i]+ "is" + frequency);
			}
			
		}
		
	}
	
	
	
	
	

}


