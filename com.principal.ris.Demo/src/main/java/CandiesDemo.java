package com.principal.ris.Demo;

public class CandiesDemo{
	
	
	
	
	//You are distributing N candies to to K children. You give 1 candy to the first child,2 candies to the second   
	//3 candies to third and so on, till K children receives the candies. Then you again give K+1 candies to first K+2 candies 
	// to second and so on, 
	
	//Find the number of candies each child gets
	// Input 1: Number of candies
	//Input 2: Number of children
	
	// 10,3 > {1,2,3,4}
	// 3,6
	// 17,5> 1,2,3,4,5> 
	static int  iteration = 0;
	static int[] x ;
	
	public static void main(String[] args) {
		
		int candies = 48;
		int children = 5;// 1,2,3,4,5> 7,9,11,13,5
		x = new int[children+1];
		x= getCandies2(candies,children); 
		for(int j=0; j<x.length; j++){
			System.out.println(x[j]);
		}
		
		
	}
	
	
	private static int[] getCandies2(int n, int k){
		
		int candiesLeft = n;// n number of candies
		
		for(int i=1; i<=k && candiesLeft>0 ; i++){
			
			if(candiesLeft>iteration+i){
				x[i-1] =x[i-1]+iteration+i;
				candiesLeft = candiesLeft-(iteration+i);
			}
			
			
			if(candiesLeft>0 && candiesLeft<iteration+i){
				x[i] = x[i]+candiesLeft;
				return x;
			}
			
		}
		
		if(candiesLeft>0){
			iteration= k;
			getCandies2(candiesLeft,k);
		}
		 
		
		return x;
	}
	
	
	
	

}
