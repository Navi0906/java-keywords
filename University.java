class Student {
    private static String universityName = "RGPV University";
    private final int rollNumber;
    private String name;
    private String grade;

    public Student(int rollNumber, String name, String grade) {
        this.rollNumber = rollNumber;
        this.name = name;
        this.grade = grade;
    }

    public void displayStudentDetails() {
        if (this instanceof Student) {
            System.out.println("University: " + universityName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("Name: " + name);
            System.out.println("Grade: " + grade);
        }
    }
}

// Main class
public class University {
    public static void main(String[] args) {
        Student stu1 = new Student(101, "Dhruv", "D");
        Student stu2 = new Student(102, "Madhav", "C");

        stu1.displayStudentDetails();
        stu2.displayStudentDetails();
    }
}

