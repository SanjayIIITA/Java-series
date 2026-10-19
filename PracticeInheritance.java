public class PracticeInheritance {
    public static void main(String[] args) {

        // Method Hiding (static methods)
        // decided at compile time based on reference type, not object type
        Parent p = new Child(); // reference is Parent, object is Child
        p.show(); // calls Parent's show() → "Parent" (reference type decides)

        // Method Overriding (instance methods)
        // decided at runtime based on actual object type
        ParentInstance pi = new ChildInstance(); // reference is ParentInstance, object is ChildInstance
        pi.show(); // calls ChildInstance's show() → "Child" (object type decides)
    }
}

// Method Hiding - static methods belong to class, not object
class Parent {
    static void show() {
        System.out.println("Parent");
    }
}

class Child extends Parent {
    static void show() {
        System.out.println("Child");
    }
}

// Method Overriding - instance methods are resolved at runtime
class ParentInstance {
    void show() {
        System.out.println("Parent");
    }
}

class ChildInstance extends ParentInstance {
    @Override
    void show() {
        System.out.println("Child");
    }
}
