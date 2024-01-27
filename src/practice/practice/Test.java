package practice.practice;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

public class Test {

	public static void main(String[] args) {

		List<Employee> employes = new ArrayList<>();
		employes.add(new Employee("Rinku", 26, 1000));
		employes.add(new Employee("navin", 27, 10));
		employes.add(new Employee("ajay", 24, 2));
		employes.add(new Employee("amar", 25, 8));
		employes.add(new Employee("mohit", 26, 9));
		System.out.println(employes);
		List<Employee> modifiedlist = employes.stream().map(e -> {
			if (e.getAge() > 25)
				e.setSalary(e.getSalary() * 0.10);
			return e;
		}).collect(Collectors.toList());
		System.out.println(modifiedlist);
		Iterator<Employee> it = modifiedlist.iterator();
		while (it.hasNext()) {
			Employee e = it.next();
			System.out.print(e.getAge() + "   " + e.getName() + "    " + e.getSalary());

		}

	}
}
