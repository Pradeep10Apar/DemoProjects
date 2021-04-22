package com.principal.ris.Demo;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class ArrayListDemo{



	
			public static void main(String args[]){	
				
			ArrayList<String> al = new ArrayList<String>();
			
			al.add("A");
			al.add("B");
			al.add("C");
			
			al.add("D");
			al.add("E");
			al.add("F");
			
			al.add("A");
			al.add("B");
			
			
			
			ArrayList<Integer> al3 = new ArrayList<Integer>();
						
						al3.add(1);
						al3.add(2);
						al3.add(3);
						
						al3.add(4);
						al3.add(5);
						al3.add(6);
						
						al3.add(2);
						al3.add(4);
			
			
			
			
			
			LinkedHashSet<String> lhs = new LinkedHashSet<String>(al);
			
			//Removing duplicates
			lhs.forEach(h-> System.out.println(h));
			
			List<String> filteredList = al.stream().distinct().collect(Collectors.toList());
			
			
			//Removing duplicates using distinct
			
			System.out.println("*********************");
			filteredList.forEach(h->System.out.println(h));
			
			
			
			
			Object[] array = al3.toArray();
			
			Map<Object,String> hm = new HashMap();
			for (Object a : array){
				hm.put(a, a.toString());

			}
			ArrayList al2 = new ArrayList();
			System.out.println("Using map");
			hm.forEach((key,value)->al2.add(key));
			System.out.println("map keys into Array");
			al2.forEach(h->System.out.println(h));
			
			}
			
			
			
			
}