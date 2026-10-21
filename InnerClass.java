public class InnerClass {
    public static void main(String[] args) {

        Outer outer = new Outer(); // outer class object

        // Non-static Inner Class:
        // - must create Outer object first
        // - then create Inner object using outer object
        Outer.Inner inner = outer.new Inner(); // ✅ valid for non-static inner class
        // Outer.Inner inner = new Outer().new Inner(); // ✅ also valid
        inner.fun();
        inner.gun();
        // Outer.Inner.gun();
    }
}

// Non-static Inner Class Rules:
// 1. associated with object of Outer class, not the class itself
// 2. can directly access both static and non-static members of Outer class
// 3. must create Outer object first to create Inner object
// 4. syntax: Outer.Inner inner = outerObject.new Inner();

class Outer {
    int x = 10;

    Outer() {
        System.out.println(x);
    }
   

    class Inner {
        int x = 20;
        // Outer outer; // implicitly present by jvm
        public void fun() {
            System.out.println("Hello");
            System.out.println(x); // ✅ directly accessible (non-static inner class has access to outer members)
            System.out.println(Outer.this.x);
        }

        static void gun(){
            System.out.println("Bye");
            // System.out.println(x); // ❌ not accessible
            // System.out.println(Outer.this.x); // ❌ not accessible
        }
        // Java 16  onword static method are allowed in inner class
    }
}


class A {

    class B{
        static int x;
        // static method belong to class not object
    }
}