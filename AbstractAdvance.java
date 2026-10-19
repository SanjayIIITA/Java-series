public class AbstractAdvance{
    public static void main(String[] args) {

        // Abstract class cannot be instantiated
        // Animal a = new Animal(); //  Compilation error

        // But we can create reference of abstract class
        Animal a = new Dog(); //  Valid
        a.fun(); // ✅ Works fine
        // a.sleep(); // ✅ Works fine

        // Abstract class can have both abstract and non-abstract methods
        // Abstract class can have constructors
        // Abstract class can have instance variables
        // Abstract class can have static variables
        // Abstract class can have static methods
        // Abstract class can have final methods
        // Abstract class can have private methods
        // Abstract class can have protected methods
        // Abstract class can have package-private methods

        A x = new B();
        B c = new B();
        // System.out.println(c.a); // 20
        // System.out.println(x.a); // 10 will print 
        // if you to print a value should print 20 then convert into method
        System.out.println(x.getA()); // methods participate in override

    }


}

// static --> they belong to class not object
// Private --> they can not be overriden
//final they can not be overriden and change once apply
// Filds/variable can not be polymorphic

//Final -----> class? ---> you can not create child class
class Animal {
    static void fun(){
        System.out.println("Hello");
    }

    private void sleep() {
        System.out.println("Animal is sleeping");
    }

    final void eat(){
        System.out.println("Animal is eating");
    }
}

class Dog extends Animal {
   
    private void sleep() {
        System.out.println("Dog is sleeping");
    }

    static void fun(){
        System.out.println("Bye");
    }

    //  void eat() {
    //     System.out.println("Dog is eating");
    // }

}

//final class A B will gwetting error
class A{
    // int a = 10;
    int getA(){
        return 10;
    }
}

class B extends A {
//    int a = 20;
    int getA(){
        return 20;
    }
}