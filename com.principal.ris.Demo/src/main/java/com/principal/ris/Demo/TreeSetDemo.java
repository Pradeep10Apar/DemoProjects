package com.principal.ris.Demo;
import java.util.TreeSet;

import com.principal.ris.Demo.Employee;

public class TreeSetDemo {
	
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("A",1);
		Employee e2 = new Employee("B",1);
		Employee e3 = new Employee("C",1);
		Employee e4 = new Employee("A",1);
		
		TreeSet<Employee> ts = new TreeSet<>();
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		
		ts.forEach(h1-> System.out.println(h1.getId()));
		
		
	}

}
