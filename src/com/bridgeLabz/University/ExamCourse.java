package src.com.bridgeLabz.University;



public class ExamCourse extends CourseType {
    public ExamCourse(String courseName, String department) {
        super(courseName, department);
    }

    @Override
    public String getEvaluationMethod() {
        return "Exam-Based Evaluation";
    }
}
