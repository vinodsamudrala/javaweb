import java.util.HashSet;

class Employee{
	int id;
	String name;
	public Employee(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Employee e = (Employee) obj;
		return (this.id == e.id) && (this.name.equals(e.name));
	}
	
	@Override
	public int hashCode() {
		return this.id;
	}
	
}

public class HashSetExample2 {
	
	public static void main(String[] args) {
		
		
		HashSet<Employee> hs = new HashSet<Employee>();
		
		Employee e1 = new Employee(1, "Ramesh");

		Employee e2 = new Employee(1, "Ramesh");
		
		Employee e3 = new Employee(1, "Java");
		
		hs.add(e1);
		hs.add(e2);
		hs.add(e3);
		
		System.out.println(hs);
		
		/*System.out.println(e1==e2);
		System.out.println(e1.equals(e2));*/
	}

}