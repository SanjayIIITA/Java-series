public class DemoOops {
    public static void main(String[] args) {
        // Object Oriented Programming
        // Class and Object
        // Class is a blueprint of object
        // Object is an instance of class
        // Class is a template, object is an instance of class
        // Class is a collection of objects, object is an instance of class
        // Class is a collection of methods and variables, object is an instance of class

        // Class and Object in java
        // Class is a blueprint of object, object is an instance of class
        // Class is a collection of methods and variables, object is an instance of class
        // Class is a collection of methods and variables, object is an instance of class

        Student s1 = new Student();
        s1.name = "Sanjay";
        s1.age = 28;
        s1.rollNo = 101;
        s1.collegeName = "IIIT Allahabad";

        Student s2 = new Student();
        s2.name = "Mandeep";
        s2.age = 29;
        s2.rollNo = 102;
        s2.collegeName = "IIIT Allahabad";

        s1.markAttendance();
        s2.markAttendance();
        s1.submitAssignment();
        s2.submitAssignment();
        s1.displayDetails();
        s2.displayDetails();

    }
}

class Student {
    String name;
    int age;
    int rollNo;
    String collegeName;

    void markAttendance() {
        System.out.println(name + " is present");
    }

    void submitAssignment() {
        System.out.println(name + " has submitted the assignment");
    }
    void displayDetails() {
        System.out.println("Name: " + name + " Age: " + age + " Roll No: " + rollNo + " College Name: " + collegeName);
    }
}