public class InterfaceFeatureAfter8{
    public static void main(String[] args) {
        Vehical v = new Car ();
        v.drive();
        // Vehical.refuel();
    }
}

//  After Java 8 ----> default methods
//After java 9 private method introduces
// List InterFace ---> new method introfuce krna tha 
//  to avoid breaking change ---> default methods

interface ListInterface{
    default void pushback(){
        System.out.println("Push back");
    }
}


interface Vehical {
    // void drive(); // by default public abstract
    //after java 8

    default void drive(){ // default method
        System.out.println("Vehical is Driving");
        accelarate();
    }

    static void refuel(){ // static method
        System.out.println("Vehical refueled");
    }

    private void accelarate(){ // private method
        System.out.println("accelarate private method");
    }
    
}

class Car implements Vehical {

    // @Override
    //  public void drive(){ // default method
    //     System.out.println("Car is Driving");
    // }
}