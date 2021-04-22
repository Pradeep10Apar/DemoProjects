package com.principal.ris.Demo;

public class PracticeClass {







	public static void main(String args[]){

		int[] a = {2,13,13,65,24,65,78,9,9,9,92};

		
		for(int m = 0; m<a.length ; m++){
			System.out.println(a[m]);
			}
		
		for(int i =0; i<a.length-1 ; i++){
			int smallest = a[i];
			int location = i;
			int temp = 0;

			for(int j =i; j<a.length-1; j++){//32,13,24,65,78,9,92,2 >

				if(a[j+1]<smallest){
					
					smallest = a[j+1];
					location= j+1;
					
				}
			}
			
			temp = a[i];
			a[i] = smallest;
			a[location] =temp;
			
			System.out.println("******************");
			
			for(int m = 0; m<a.length; m++){
				System.out.println(a[m]);
				}
			
			System.out.println("******************");
		}
		
		

		

	}

}
