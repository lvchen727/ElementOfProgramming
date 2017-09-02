package chapter10_binary_trees;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Student{
	public double GPA;
	public String name;
	
	public Student(double gpa, String name){
		this.GPA = gpa;
		this.name = name;
	}
	
	private static final Comparator<Student> compGPA = new Comparator<Student>(){
		public int compare(Student a, Student b){
			if(a.GPA != b.GPA){
				return Double.compare(a.GPA, b.GPA);
			}
			return a.name.compareTo(b.name);
		}
	};

	
	public static boolean searchStudent(List<Student> students, Student target, Comparator<Student> compGPA){
		return Collections.binarySearch(students, target, compGPA) >= 0;
	}
}










