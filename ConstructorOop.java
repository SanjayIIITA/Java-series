
public class ConstructorOop {

    public static void main(String[] args) {
        // Constructor in java
        // Constructor is a special method which is used to initialize the object
        // Constructor is called when the object is created
        // Constructor has same name as class name
        // Constructor does not have return type
        // Constructor can be overloaded

        Student s1 = new Student("Sanjay", 28, 101, "IIIT Allahabad");
        // Student s2 = new Student("Mandeep", 29, 102, "IIIT Allahabad");

        System.out.println("Student " + s1.name + " is created with age " + s1.age + " and roll no " + s1.rollNo + " and college name " + s1.collegeName);
        // System.out.println("Student "+ s2.name + " is created with age "+ s2.age + " and roll no "+ s2.rollNo + " and college name "+ s2.collegeName);  

    }
}

class Student {

    String name;
    int age;
    int rollNo;
    String collegeName;

    // Constructor
    // Student(String n, int a, int r, String c) {
    //     name = n;
    //     age = a;
    //     rollNo = r;
    //     collegeName = c;
    // }
    // Student Sanjay is created with age 28 and roll no 101 and college name IIIT Allahabad
    //  Student(String name, int age, int rollNo, String collegeName) {
    //     name = name;
    //     age = age;
    //     rollNo = rollNo;
    //     collegeName = collegeName;
    // }
    // Student null is created with age 0 and roll no 0 and college name null
    //Java does not understand that the parameters and instance variables are different. It thinks that you are trying to assign the parameter to itself. To fix this, we can use the this keyword to refer to the instance variable.
    Student(String name, int age, int rollNo, String collegeName) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
    }
    // Student Sanjay is created with age 28 and roll no 101 and college name IIIT Allahabad
    // this keyword is used to refer to the current object. It is used to differentiate between instance variables and local variables. It is also used to call the constructor of the current class.
    // It is also used to pass the current object as a parameter to another method. It is also used to return the current object from a method.

    void displayDetails() {
        System.out.println("Name: " + name + " Age: " + age + " Roll No: " + rollNo + " College Name: " + collegeName);
    }
}
