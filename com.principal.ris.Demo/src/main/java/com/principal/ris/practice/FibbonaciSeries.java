package com.principal.ris.practice;

public class FibbonaciSeries {
	
	
	
	public static void main(String[] args) {
		int n = 10;
		findElementInFibinnaciSeries(10);
		
	}

	// 0,1,1,2,3,5,8,13,21,
	private static void findElementInFibinnaciSeries(int n) {
		
		int previous =0;
		int current=1;
		int sum=0;
		
		
		for(int j=1; j<=n; j++){
			
			
			for(int i = j; i <=j; i++){  
				sum = previous + current;
				previous = current;
				current=sum;
				
			}
			System.out.println("Sum is :"+sum);
			
		}
		
	}

}
