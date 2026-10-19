class AbstractionBasic {
    public static void main (String [] args) {
        
        Car car = new FuelCar();
        // Car car = new ElectricCar();

        car.start();
        car.accelarate();
        car.brake();

    }

}

interface Car{
    void start();
    void accelarate();
    void brake();
}


class FuelCar implements Car {

    @Override
    public void start(){
        System.out.println("Fuel Car started");
    }

    @Override
    public void accelarate(){
        System.out.println("Fuel Car accelarated");
    }

    @Override
    public void brake(){
        System.out.println("Fuel care stop");
    }
}

class ElectricCar implements Car {

    @Override
    public void start(){
        System.out.println("Electric Car started");
    }

    @Override
    public void accelarate(){
        System.out.println("Electric Car accelarated");
    }

    @Override
    public void brake(){
        System.out.println("Electric Car stopped");
    }

}
