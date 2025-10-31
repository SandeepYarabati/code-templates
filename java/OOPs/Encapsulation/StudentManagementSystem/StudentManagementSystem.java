package test;

public class StudentManagementSystem {
	public static void main(String[] args) {
		Student sandeep = new Student("sandeep", 176);
		Course java = new Course("java", 4);
		Course dsa = new Course("dsa", 6);
		
		sandeep.enrollCourse(java);
		sandeep.enrollCourse(dsa);
		
		System.out.println(sandeep.getCourses());
		
		sandeep.dropCourse("dsa");
		
		System.out.println(sandeep.getCourses());
		
	}
}
