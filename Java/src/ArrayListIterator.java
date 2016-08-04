import java.util.ArrayList;
import java.util.List;

class Student{
	int id ;
	String name;
	public Student(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}
	
	
	
}

public class ArrayListIterator {
	public static void main(String[] args) {
	
		ArrayList<Student> studentList = new ArrayList<Student>();
		
		studentList.add(new Student(1, "A"));
		studentList.add(new Student(2, "b"));
		studentList.add(new Student(3, "c"));
		studentList.add(new Student(4, "d"));
		studentList.add(new Student(5, "f"));
		studentList.add(new Student(6, "g"));
		studentList.add(new Student(7, "h"));
		studentList.add(new Student(8, "A"));
		studentList.add(new Student(9, "A"));
		studentList.add(new Student(9, "xyz"));

		for(Student std : studentList){
			if(std.id==7){
				System.out.println(std.name);
				std.name = "java";
				studentList.add(new Student(9, "xyz"));
			}
		}
		System.out.println(studentList);
	}
}
