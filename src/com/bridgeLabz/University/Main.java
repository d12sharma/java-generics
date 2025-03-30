package src.com.bridgeLabz.University;



public class Main {
    public static void main(String[] args) {

        ExamCourse mathCourse = new ExamCourse("Mathematics", "Science");
        AssignmentCourse historyCourse = new AssignmentCourse("History", "Arts");
        ResearchCourse aiCourse = new ResearchCourse("Artificial Intelligence", "Computer Science");


        Course<ExamCourse> math = new Course<>(mathCourse, 4);
        Course<AssignmentCourse> history = new Course<>(historyCourse, 3);
        Course<ResearchCourse> aiResearch = new Course<>(aiCourse, 5);


        CourseCatalog catalog = new CourseCatalog();
        catalog.addCourse(math);
        catalog.addCourse(history);
        catalog.addCourse(aiResearch);


        System.out.println("University Course Catalog:");
        catalog.showCourses();
    }
}
