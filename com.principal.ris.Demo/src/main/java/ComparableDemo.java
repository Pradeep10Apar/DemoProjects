

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

import com.principal.ris.Demo.Employee2;

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
		
			
		//Sorted List
		System.out.println("Before sorting");
		ts.forEach(h1-> System.out.println(h1));
		
		//Collections.sort(ts);
		
		System.out.println("After sorting");
		ts.forEach(h1-> System.out.println(h1));
		
		//Tree set
		Set<Employee2> treeSet = new TreeSet<>();
		treeSet.add(e1);
		treeSet.add(e2);
		treeSet.add(e3);
		treeSet.add(e4);
		treeSet.add(e5);
		
		System.out.println("Tres Set Before sorting");
		treeSet.forEach(h1-> System.out.println(h1));
		
		
		System.out.println("Tree Set After sorting");
		treeSet.forEach(h1-> System.out.println(h1));
		
		
		
		
	}

}
