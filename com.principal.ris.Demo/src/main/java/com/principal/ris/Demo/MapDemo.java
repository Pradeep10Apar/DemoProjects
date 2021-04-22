package com.principal.ris.Demo;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class MapDemo {
	
	
	//Not overrding equals but hashcode method
	public static void main (String args[]){
		
		Map<Object, Object> hm = new HashMap();
		
		Student s = new Student();
		
		hm.put(s, null);
		hm.put(s, null);
		
		hm.put(s, null);
		hm.put(s, null);
		
		hm.put(s, null);
		hm.put(s, null);
		
		Set s1 = hm.keySet();
		System.out.println("Keys are");
		s1.forEach(h->System.out.println(h));
		hm.forEach((key,value)-> System.out.println("key =" + key + "and value" + value + "and hashcode is " + key.hashCode()));
		System.out.println(hm.size());
		
		
		
		
		
	}

}
