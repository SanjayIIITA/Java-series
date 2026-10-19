public class AbstractQues{
    public static void main(String[] args) {
        Animal a = new Dog("Reshu");
        a.getName();
        a.makeSound();
    }
}


abstract class Animal{

    String name;
    static String type;

    Animal(String name) {
       this.name = name;
    }

    abstract void makeSound();

    void sleep() {
        System.out.println("Animal is sleeping");
    }

   final void getName(){
        System.out.println(name);
    }

    static void setType(){
        type = "Mammal";
        System.out.println(type);
    }

    // abstract private void abc();// not allowed both
    // abstract static void xyz(); // no allowed
    private void abc(){
        System.out.println("Hello");
    }
}

class Dog extends Animal{
    
    Dog(String name){
        super(name);
    }
   
    @Override
    void makeSound() {
        System.out.println("Dog barks");
    }
}

// Abstract classes
/*
1. Can not be instiated directly
2. Can have abstract methods(methods without body)
3. Can have concrete methods(methods with body)
4. Can have constructors it is iherited in child class
5. it meant to be extended
6. A class can extend only one abstract class

Question: 
1.Can we override static methods -> no
Reason: Yes, we can override static methods in Java.
2. can abstract class inherit another abstract class -> Yes
Reason: Yes, an abstract class can extend another abstract class.
3. Can abstract class have main method -> Yes
Reason: Yes, an abstract class can have a main method.
4. Can Abstract class implements interface -> Yes
Reason: Yes, an abstract class can implement any number of interfaces.
5. Can Abstract class have constructor? -----> yes
Reason: Yes, an abstract class can have a constructor. It is called when a subclass extends the abstract class.
6. Can we create object of abstract class? ------> No, but possible with the help of child class
Reason: We can't create object of abstract class directly but if we create child class of abstract class we can create object of child class which will have all properties of parent class.
7. Can we create static methods/variable in abstract class? ------> Yes but non abstract
Reason: Yes, we can create static methods and variables in abstract class.

8. Can we create final methods in abstract class? -------> Yes but non absctract
Reason: Yes, we can create final methods in abstract class. Final methods can not be overridden.
9. Can abstract class be final? -------> No
Reason: No, an abstract class cannot be final.
10. Can abstract class method private? -------> Yes but non abstrsct
11. can abstract class have no abstract method ? -----> yes

*/