import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.TreeSet;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import com.principal.ris.Demo.Employee;
import com.principal.ris.Demo.MyComparator;

public class ComparatorDemo {
	
	
	
	public static void main(String[] args) {
		
		Employee e1 = new Employee("A",13);
		Employee e2 = new Employee("B",154);
		Employee e3 = new Employee("C",14);
		Employee e4 = new Employee("A",155);
		Employee e5 = new Employee("A",155);
		MyComparator myComparator  = new MyComparator();
		TreeSet<Employee> ts = new TreeSet<>(myComparator);
		List<Employee> ts1 = new ArrayList<>();
		
		
		
		
		ts.add(e1);
		ts.add(e2);
		ts.add(e3);
		ts.add(e4);
		ts.add(e5);
		
		ts1.add(e1);
		ts1.add(e2);
		ts1.add(e3);
		ts1.add(e4);
		ts1.add(e5);
		
		ts.forEach(h1->System.out.println(h1));
		
		System.out.println("********************");
		
		ts1.forEach(h1->System.out.println(h1));
		
		System.out.println("After sorting");
		Collections.sort(ts1, myComparator);
		ts1.forEach(h1->System.out.println(h1));
		
		
		
		

		
		
		
	}

}
