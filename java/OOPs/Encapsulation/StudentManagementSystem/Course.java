package test;

public class Course {
    private String courseName;
    private int durationInMonths;

    public Course(String courseName, int durationInMonths) {
        this.setCourseName(courseName);
        this.setDurationInMonths(durationInMonths);
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        if(courseName == null || courseName.trim().isEmpty()) {
            throw new IllegalArgumentException("Course name cannot be empty");
        }
        this.courseName = courseName;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        if(durationInMonths <= 0) {
            throw new IllegalArgumentException("Duration must be more than 0 months");
        }
        this.durationInMonths = durationInMonths;
    }
}
