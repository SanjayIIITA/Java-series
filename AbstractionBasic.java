class AbstractionBasic{
    public static void main(String [] args){

        // Car car = new Car();// can not create object bcz can't instantiate
        // Car fc = new FuelCar();
        // fc.accelarate();
        // fc.brake();
        // fc.start();

        Car ec = new ElectricCar();

        ec.accelarate();
        ec.brake();
        ec.start();

    }
}

//abstract method body will be inside the child and child class has responsiblity to decalre becasue each has 
// different implementation just method name same will not helpful
abstract class Car {
    void start(){
        System.out.println("Car started");
    }

   abstract void accelarate();
   abstract void brake();
}

class FuelCar extends Car {

    @Override
    void accelarate(){
        System.out.println("Fuel Car accelarated");
    }
    @Override
    void brake(){
        System.out.println("Fuel Car stopped");
    }

}

class ElectricCar extends Car {

    @Override //it is just tell to java i have been inplement separately
    void accelarate(){
        System.out.println("Electric Car accelarated");
    }

    @Override // It is just implement separately ownlogic
    void brake() {
        System.out.println("Electric Car stopped");
    }

}