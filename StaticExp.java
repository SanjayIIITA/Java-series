//static keyword is used for memory management mainly. We can apply static keyword with variables, methods, blocks and nested class. The static keyword belongs to the class than an instance of the class. This means that we can access a static member without creating an object of the class.
public class StaticExp {
  public static void main(String args[]) {
    Student s1 = new Student("Sanjay", 28, 101);
    Student s2 = new Student("Mandeep", 29, 102);

    //Student.collegeName = "IIIT Allahabad"; // this is also allowed

    System.out.println("Student " + s1.name + " is created with age " + s1.age + " and roll no " + s1.rollNo + " and college name " + Student.collegeName + " and grade " + Student.grade);
    System.out.println("Student " + s2.name + " is created with age " + s2.age + " and roll no " + s2.rollNo + " and college name " + Student.collegeName + " and grade " + Student.grade);
  }
  
}

class Student{

    String name;
    int age;
    int rollNo;
    static String collegeName;
    static int grade;

    Student(String name, int age, int rollNo){
        this.name = name;
        this.age = age;
        this.rollNo = rollNo;
    }

    //static block is used to initialize the static variables. It is executed before the main method at the time of class loading.
    // It is executed only once at the time of class loading. It is used to initialize the static variables. It is executed before the main method at the time of class loading.
    // It is executed only once at the time of class loading. It is used to initialize the static variables. It is executed before the main method at the time of class loading. It is executed only once at the time of class loading.
    static {
        collegeName = "IIIT Allahabad";
        grade = 10;
    }
}