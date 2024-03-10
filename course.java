
public class course {
    private String name;
    private String course;

    public course(String name, String course) {
        this.name = name;
        this.course = course;
    }

    public void displayCourseDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Course: " + course);
    }

    public static void main(String[] args) {
        course student1 = new course("John Doe", "Java Programming");
        course student2 = new course("Jane Smith", "Data Science");

        student1.displayCourseDetails();
        student2.displayCourseDetails();
    }
}