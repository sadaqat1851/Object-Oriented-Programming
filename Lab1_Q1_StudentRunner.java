class Student {
    // Data Members
    public String name;
    public String id;
    public String program;
    public int age;
    public String department;
    public String email;
    public double sub1, sub2, sub3;
    public double GPA;

    // registerCourse()
    public void registerCourse(String courseName) {
        System.out.println(name + " has successfully registered for the course: " + courseName);
    }

    // calculateGPA()
    public void calculateGPA() {
        double avg = (sub1 + sub2 + sub3) / 3;

        // GPA calculation
        if (avg >= 85)
            GPA = 4.0;
        else if (avg >= 75)
            GPA = 3.5;
        else if (avg >= 65)
            GPA = 3.0;
        else if (avg >= 50)
            GPA = 2.0;
        else
            GPA = 0.0;
    }

    // displayProfile()
    public void displayProfile() {
        System.out.println("Student Profile");
        System.out.println("Name: " + name);
        System.out.println("ID: " + id);
        System.out.println("Program: " + program);
        System.out.println("Department: " + department);
        System.out.println("Age: " + age);
        System.out.println("Email: " + email);
        System.out.println("GPA: " + GPA);
    }
}

// Lab1_Q1_StudentRunner.java
public class Lab1_Q1_StudentRunner {
    public static void main(String[] args) {
        // Create Student object
        Student s = new Student();

        // Assign values
        s.name = "Ali";
        s.id = "S1001";
        s.program = "BSCS";
        s.department = "Computer Science";
        s.age = 20;
        s.email = "ali@example.com";
        s.sub1 = 88;
        s.sub2 = 92;
        s.sub3 = 80;

        // Call methods
        s.registerCourse("Object Oriented Programming");
        s.calculateGPA();
        s.displayProfile();
    }
}

