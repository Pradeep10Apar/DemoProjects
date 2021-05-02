package com.principal.ris.Demo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo {
	
	
	public static void main(String args[]){
		
	LinkedList<String> ls = new LinkedList<String>();
	ls.add("A");
	ls.add("C");
	ls.add("D");
	ls.add("B");
	ls.add("E");
	ls.add("F");
	ls.add("G");
	
	//even 
	ls.add("H");
	
	//if List size  is odd
	if(ls.size()!=0 && ls.size()%2!=0){
		System.out.println(ls.get((ls.size()-1)/ 2));
	}else{
		System.out.println(ls.get((ls.size()/ 2)));
	}
			
			
	ListIterator<String> itr = ls.listIterator();
	
	while(itr.hasNext()){
		System.out.println();
		
	}
	
	
		
	}
	

	
	
	
}
