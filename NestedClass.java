public class NestedClass {
    public static void main(String[] args) {

        // Static Nested Class:
        // - associated with Outer class, not an object
        // - can be instantiated without creating Outer class object
        // - accessed using: Outer.Inner

        Outer outer = new Outer();

        // Creating Inner class object without Outer object (static nested class)
        // Outer.Inner inner = new Outer.Inner(); // ✅ valid for static nested class

        // Passing outer object via constructor to access non-static members
        Outer.Inner inner = new Outer.Inner(outer);
        inner.fun();
    }
    
}

// Static Nested Class Rules:
// 1. declared with static keyword inside outer class
// 2. can only directly access static members of outer class
// 3. to access non-static members → need reference of outer class
// 4. can extend and implement any class/interface
// 5. accessed using ClassName: Outer.Inner (not via object)

class Outer {
    private static int x = 4; // static → belongs to class, accessible in static nested class
    int y = 0;                 // non-static → belongs to object, NOT directly accessible in static nested class
    private String s;
    static class Inner {

        Outer outer; // reference to Outer class to access non-static members

        // Option 1: pass Outer reference via constructor
        Inner(Outer outer) {
            this.outer = outer;
        }

        void fun() {
            System.out.println("x = " + x);         // ✅ directly accessible (static member)
            // System.out.println(y);               // ❌ not accessible (non-static, needs object)
            System.out.println("y = " + outer.y);   // ✅ accessible via outer class reference
        }
    }
}

// Summary:
// - static nested class → use Outer.Inner, no need for Outer object
// - to access non-static members of Outer → pass Outer reference via constructor or method
// - Option 2: pass Outer reference via method parameter → void fun(Outer outer)


//Example

class BankAccount{

   private static class InterestCalculator { // it is hodden its implementation detail for outer world
       static double calculateSimpleInterest(double principle, double rate, double time){
            return (principle * rate * time) / 100;
        }

       static double calculateCompoundInterest(double principle, double rate, double time){
            return principle * Math.pow((1 + rate/100), time) - principle;
        }
       static double calculateTotalAmount(double principle, double rate, double time){
            return principle + calculateSimpleInterest(principle, rate, time);
        }

        static double CalculateYearly(double principal, double rate){
            return principal*rate;

        }
    }

    public double ComputeInterest(double principle, double rate, double time){
       return InterestCalculator.CalculateYearly(principle, 9.0);

    }

    public double ComputeInterest1(double principle, double rate, double time){
       return InterestCalculator.calculateTotalAmount(principle, rate, time);

    }

    public double CalculateSimpleInt(double principal, double rate, double time){
        return InterestCalculator.calculateSimpleInterest(principal, rate, time);
    }

}

// Use cases of static nested class
/*
As a helper class for any outer class
To group classes that are only used in one place
Builder design pattern
Req/res DTO
*/