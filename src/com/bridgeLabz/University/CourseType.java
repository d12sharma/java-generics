package src.com.bridgeLabz.University;



public abstract class CourseType {
    private String courseName;
    private String department;

    public CourseType(String courseName, String department) {
        this.courseName = courseName;
        this.department = department;
    }

    public String getCourseName() {
        return courseName;
    }

    public String getDepartment() {
        return department;
    }

    public abstract String getEvaluationMethod();

    @Override
    public String toString() {
        return courseName + " (" + department + ") - " + getEvaluationMethod();
    }
}
