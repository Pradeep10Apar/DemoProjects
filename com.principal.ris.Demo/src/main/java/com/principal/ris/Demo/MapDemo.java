package com.principal.ris.Demo;

import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.*;;

public class MapDemo {
	
	
	//Not overrding equals but hashcode method
	public static void main (String args[]){
		
		Map<Integer, Integer> hm = new HashMap<Integer, Integer>();
		
		Student s = new Student();
		
		hm.put(2,3);
		hm.put(12,33);
		hm.put(22,33);
		hm.put(25,33);
		hm.put(26,3343);
		hm.put(4,55);
		hm.put(23,33);
		
		
		
		Set<Map.Entry<Integer, Integer>> entrySet = hm.entrySet();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		Set<Map.Entry<Integer, Integer>> entries = hm.entrySet();
		System.out.println("***************");
		entries.forEach(h1-> System.out.println(h1));
		System.out.println("***************");
		
		Set<Integer> sets =  hm.keySet();
		Set<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.addAll(sets);
		
		
		
		System.out.println("GGGGGGGGGGGGGG");
		
		linkedHashSet.forEach(h1-> System.out.println(h1));
		System.out.println("GGGGGGGGGGGGGG");
		
		Stream<Map.Entry<Integer, Integer>> filteredStream = hm.entrySet().stream().filter(h-> h.getKey()>20);
		System.out.println("??????????????");
		filteredStream.forEach(k1-> System.out.println(k1));
		System.out.println("???????????????");
		
		Collection<Integer> valuesCollection = hm.values();
		System.out.println("Before");
		valuesCollection.forEach(j1-> System.out.println(j1));
		System.out.println("after");
		valuesCollection.stream().filter(j1->j1>20).forEach(j1-> System.out.println(j1));;
		
		
		Collection<Integer> uniqueValues = hm.values();
		
		System.out.println("unique vaue greater than 20");
		uniqueValues.stream().filter(j1->j1>20).forEach(j1-> System.out.println(j1));
		
		
		System.out.println("---------------------------");
		
		Optional<Integer> opt = hm.entrySet().stream().filter(h1->h1.getValue()>20).map(Map.Entry::getValue).findAny();
		
		
		List<Integer> list = hm.entrySet().stream().filter(h1->h1.getValue()>20).map(Map.Entry::getValue).collect(Collectors.toList());
		
		Set<Integer> set = hm.entrySet().stream().filter(h1->h1.getValue()>20).map(Map.Entry::getValue).collect(Collectors.toSet());
		
		System.out.println(opt);
		System.out.println("---------------------------");
		
		System.out.println(list);
		System.out.println(set);
		
		
		System.out.println("---------------------------");
	}

}
