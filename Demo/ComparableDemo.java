package com.principal.ris.Demo;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;

public class ComparableDemo {
	
	public static void main(String[] args) {
		
		Employee2 e1 = new Employee2("A",13);
		Employee2 e2 = new Employee2("B",154);
		Employee2 e3 = new Employee2("C",14);
		Employee2 e4 = new Employee2("A",155);
		Employee2 e5 = new Employee2("A",155);
		
		List<Employee2> ts = new ArrayList<>();
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		System.out.println("Before sorting");
		ts.forEach(h1-> System.out.println(h1));
		
		Collections.sort(ts);
		
		System.out.println("After sorting");
		ts.forEach(h1-> System.out.println(h1));
		
		
		
		
		
	}

}
