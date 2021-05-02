package com.principal.ris.Demo;

public class SelectionSort {
	
	
	
	
	
	public static void main(String args[]){
	
		
		//38,52,9, 18,63, 6, 13
		//6,52,9,18,63,38,13
		//6,9,52,18,63,38,13
		//6,9,13,18,63,38,52
		//6,9,13,18,38,63,52
		//6,9,13,18,38,52,63
		
	
		int[] a = {38,52,9, 18,63, 6, 13};
		int temp = 0;
		
		for(int m= 0; m<a.length; m++){
			System.out.println(a[m]);
		}
		System.out.println("Before");
		
		for (int i=0; i<a.length-1; i++){
		
			int smallest = a[i];
			int location= i;
			
			for(int j= i; j<a.length-1; j++){//38,52,9, 18,63, 6, 13
				
				if(a[j+1]<smallest){
					smallest = a[j+1]; // smallest=9,location2>  smallest =6, location 5> 
					location=j+1;
					
				}
			}
			
			temp = a[i];
			a[i] = smallest;
			a[location] =temp;
			
			System.out.println("**************");
			//printing arrays
			for(int m= 0; m<a.length; m++){
				System.out.println(a[m]);
			}
			

			System.out.println("**************");
			
		}
		
		
		
	}
	
	

}
