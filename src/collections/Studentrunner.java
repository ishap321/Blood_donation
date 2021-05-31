package collections;
import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Studentrunner {

	public static void main(String[] args) {
		/*
		 * List<Student> students =List.of(new Student(1,"Isha"), new Student(2,"Yash"),
		 * new Student(3,"priya"));
		 */
		List<Student> studentsAl = new ArrayList<Student>();


		studentsAl.add(new Student(1,"Isha"));
		studentsAl.add(new Student(2,"bsha"));
		studentsAl.add(new Student(3,"psha"));
		System.out.println(studentsAl);
		Collections.sort(studentsAl);
		System.out.println(studentsAl);
		
		
	}

}
