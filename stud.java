 import java.util.Scanner;

class Student {
    String name;
    int rollno;
    int math, phy, eng;

    void getStudentDetails() {
        // removed user input
        name = "John Doe";
        rollno = 12345;
        math = 85;
        phy = 90;
        eng = 80;
    }

    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollno + "\nName: " + name);
        System.out.println("Marks (Maths, Physics, English): " + math + "," + phy + "," + eng);
        System.out.println("Total: " + (math + phy + eng) + "\tPercentage: " + ((math + phy + eng) * 100 / 300));
    }
}

class Main {
    public static void main(String[] args) {
        Student s = new Student();
        s.getStudentDetails();
        s.displayStudentDetails();
    }
}
