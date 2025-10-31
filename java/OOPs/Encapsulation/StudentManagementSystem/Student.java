package test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Student {
	private String name;
	private int id;
	private List<Course> courses = new ArrayList<>();
	public Student(String name, int id) {
		super();
		this.name = name;
		if(id<=0) {
			throw new IllegalArgumentException("Id must be positive");
		}
		this.id = id;
		
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
        if(name == null || name.trim().length() < 3) {
            throw new IllegalArgumentException("Name must be at least 3 characters");
        }
        this.name = name;
    }
	
	public int getId() {
		return id;
	}
	
	 public List<Course> getCourses() {
	    return Collections.unmodifiableList(courses); // prevents direct modification
	 }
	public void enrollCourse(Course course) {
		courses.add(course);
	}
	public void dropCourse(String courseName) {
		courses.removeIf(c->c.getCourseName().equalsIgnoreCase(courseName));
	}
	
}
