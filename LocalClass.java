public class LocalClass {
    public static void main(String[] args) {
        Outer o = new Outer();
        o.greet();
    }
}

/*
 * Local Class:
 * - a class defined inside a method (local to that method)
 * - only accessible within the method it is defined in
 * - can access local variables of the method but only if they are effectively final
 * - can access all members (static and non-static) of the outer class
 *
 * Effectively Final Variable:
 * - a variable that is never modified after initialization
 * - does not need explicit 'final' keyword but behaves like final
 * - if you try to modify it after it is used in a local class → compilation error
 * - Example: int y = 5 → effectively final (never reassigned)
 *            y++ → breaks effectively final → compilation error
 *
 * Why local class can only access effectively final variables?
 * - local class may outlive the method (e.g. returned or stored)
 * - if variable changes after method ends → local class would have stale value
 * - Java captures a copy of the variable → must be final to ensure consistency
 */

class Outer {

    void greet() {
        int y = 5; // effectively final → never modified after initialization
        // y++; // ❌ breaks effectively final → compilation error if used in local class

        // Local Class: defined inside a method
        class Local {
            void sayHello() {
                System.out.println(y); // ✅ can access effectively final variable
            }
        }

        // Local class object can only be created inside the same method
        Local l = new Local();
        l.sayHello();
    }
}
