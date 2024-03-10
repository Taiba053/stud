import java.util.Scanner;

class stud {
    String name;
    int rollno;
    int math, phy, eng;

    public static void main(String[] args) {
        stud s = new stud();
        s.name = "John Doe";
        s.rollno = 1;
        s.math = 80;
        s.phy = 90;
        s.eng = 85;
        s.getStudentDetails();
        s.displayStudentDetails();
    }

    void getStudentDetails() {
        // This method is used to get student details
    }

    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollno + "\nName: " + name);
        System.out.println("Marks (Maths, Physics, English): " + math + "," + phy + "," + eng);
        System.out.println("Total: " + (math + phy + eng) + "\tPercentage: " + ((math + phy + eng) * 100 / 300));
    }
}
