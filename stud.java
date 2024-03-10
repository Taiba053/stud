import java.util.Scanner;

class stud {
    String name;
    int rollno;
    int math, phy, eng;

    public static void main(String[] args) {
        stud s = new stud();
        s.getStudentDetails();
        s.displayStudentDetails();
    }

    void getStudentDetails() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name: ");
        name = sc.next();
        System.out.println("Enter Roll Number: ");
        rollno = sc.nextInt();
        System.out.println("Enter marks in Maths, Physics, and English: ");
        math = sc.nextInt();
        phy = sc.nextInt();
        eng = sc.nextInt();
    }

    void displayStudentDetails() {
        System.out.println("Roll Number: " + rollno + "\nName: " + name);
        System.out.println("Marks (Maths, Physics, English): " + math + "," + phy + "," + eng);
        System.out.println("Total: " + (math + phy + eng) + "\tPercentage: " + ((math + phy + eng) * 100 / 300));
    }
}
