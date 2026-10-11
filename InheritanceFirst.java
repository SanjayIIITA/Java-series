public class InheritanceFirst {
    public static void main(String[] args){

        Hosteller h = new Hosteller();
        h.id = 1;
        h.name = "Sanjay";
        h.college = "IIIT A.";
        h.roomNumber = 201;
        h.fees = 5000;
        h.display();
        h.payFees();
        h.markAttendence();

        System.out.println();

        EnginneringStudent e = new EnginneringStudent();
        e.id = 2;
        e.name = "Sanjay";
        e.markAttendence();
        e.display();
        e.attendLabs();

    }
}

class Student {
    int id;
    String name;
    String college;

    Student(){
        this.college = "IIIT Allahabad";  // parent sets its own college
    }

    void display(){
        System.out.println(id + " " + name + " " + college);
    }

    void markAttendence(){
        System.out.println("Students marks attendence");
    }
}

class Hosteller extends Student{
    int roomNumber;
    int fees;

    void display(){
        System.out.println(id + " " + name + " " + college + " " + roomNumber + " " + fees);
    }

    void payFees(){
        System.out.println("Hosteller pays fees");
    }
}

// Super keyword is used to refer to the parent class.
// It is used to differentiate between parent class and child class members.
// It is used to call the parent class constructor. It is used to call the parent class method.

// there are three types of inheritance supported in java
// single level
// Multilevel inheritance
// hierachical inheritance
// multiple inheritance is not supported in java

// Diamond problem raise
// but it is possible with the help of interface

// 1. Single Level
// class A {}
// class B extends A {}   // B → A

// 2. Multilevel
// class A {}
// class B extends A {}
// class C extends B {}   // C → B → A

// 3. Hierarchical
// class A {}
// class B extends A {}
// class C extends A {}   // B and C both → A

// 4. Multiple - not allowed in Java
// class A {}
// class B {}
// class C extends A, B {}  // not allowed in Java

//       A
//      / \
//     B   C
//      \ /
//       D

class EnginneringStudent extends Student{
    String college = "IIIT A";

    void display(){
        System.out.println(super.id + " " + super.name + " " + this.college + ", " + super.college);
    }

    void attendLabs(){
        System.out.println("Engineering student attends labs");
    }
}
