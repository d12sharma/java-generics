package src.com.bridgeLabz.University;



public class Course<T extends CourseType> {
    private T courseType;
    private int credits;

    public Course(T courseType, int credits) {
        this.courseType = courseType;
        this.credits = credits;
    }

    public T getCourseType() {
        return courseType;
    }

    public int getCredits() {
        return credits;
    }

    @Override
    public String toString() {
        return courseType.toString() + " | Credits: " + credits;
    }
}
