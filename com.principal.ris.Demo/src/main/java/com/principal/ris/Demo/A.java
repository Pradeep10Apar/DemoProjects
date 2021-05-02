package com.principal.ris.Demo;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Arrays;

public class A {
	
	
	
	public static void main(String args[])
	
	{
		int a[] = new int[]{100, 9, 111,777, 3,3, 3, 4, 5,999,10,20,20,333333,6,7,8,999,9999}; //4,5,3,2,1 
		
		int temp[] = new int[]{0};
		for(int i =1 ; i< a.length; i++){
			for(int j =1 ; j< a.length; j++){
				// arrange number is in ascending and get 8th element
				if(a[j-1] > a[j]){
					temp [0] = a[j];
					a[j] = a[j-1];
					a[j-1] = temp[0];
				}
			}
		}
		
		for(int j =0 ; j< a.length; j++){
			// print
			System.out.println(a[j]);
			
		}
		

		
		//find duplicatye 
		int count = 0;
		
		for(int m =0 ; m< a.length; m++){	
			for(int n =0 ; n< a.length; n++){
				if (a[m] <a[n]){
					count= count +1;
				}
				
				if(count==7){
					System.out.println("8th element is:" +a[n]);
					
				}
			}
			
		}
		
		
	}

		
		
	}
	

