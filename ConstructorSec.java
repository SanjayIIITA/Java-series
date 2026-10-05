public class ConstructorSec {
    public static void main(String[] args) {
        // Constructor in java
        // Constructor is a special method which is used to initialize the object
        // Constructor is called when the object is created
        // Constructor has same name as class name
        // Constructor does not have return type
        // Constructor can be overloaded

        Student s1 = new Student();
        Student s2 = new Student("Sanjay");
        Student s3 = new Student("Mandeep", 29);
        Student s4 = new Student("Guru", 30, 103);
        Student s5 = new Student("Vinarm", 31, 104, "IIIT Allahabad");

        System.out.println("Student " + s1.name );  
        System.out.println("Age: " + s1.age );
        System.out.println("Roll No: " + s1.rollNo );
        System.out.println("College Name: " + s1.collegeName );

    }
}
// This keyword always first line otherwise will get error
//Constructor Chaining in java
//Constructor Overloading is a technique in java where we can have multiple constructors with different parameters. It is used to initialize the object with different parameters. It is also used to call the constructor of the superclass. It is also used to avoid code duplication. It is also used to initialize the object with default values. It is also used to call another constructor from the same class. It is also used to initialize the object with different parameters. It is also used to call the constructor of the superclass. It is also used to avoid code duplication. It is also used to initialize the object with default values. It is also used to call another constructor from the same class.
class Student {

    String name;
    int age;
    int rollNo;
    String collegeName;

    //Default Constructor
    Student() {
        // this("Default Name", 0, 0, "Default College"); // calling another constructor
        this("Unknown"); // calling another constructor)
        System.out.println("Default Constructor called");
    }

    // Constructor
    Student(String name) {
        // this.name = name;
        // this(name, 0, 0, "Default College"); // calling another constructor
        this(name, 0); // calling another constructor
        System.out.println("First Constructor called");
    }

    Student(String name, int age) {
        // this.name = name;
        // this.age = age;
        // this(name, age, 0, "Default College"); // calling another constructor
        this(name, age, 0); // calling another constructor
        System.out.println("Second Constructor called");
    }

  
    Student(String name, int age, int rollNo) {
      this(name, age, rollNo, "Default College"); // calling another constructor
      System.out.println("Third Constructor called");

    }

      public Student(String name, int age, int rollNo, String collegeName) {
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
        this.collegeName = collegeName;
        System.out.println("Fourth Constructor called");
    }

    // this is called chain constructor, it is used to call another constructor from the same class.
    // It is used to avoid code duplication.
    // It is also used to initialize the object with different parameters. It is also used to call the constructor of the superclass.   
}