public class InterfaceDeep{
    public static void main(String[] args) {
        // Car c = new Thar(); // interface ka object ni create krskte 
        Car c = new BlackThar();
        c.drive();

    }
}

interface Car{
    void drive();
}

abstract class Thar implements Car {
    // @Override
    // public void drive(){
    //     System.out.println("Thar is driven");
    // }
    //do want to override
    abstract public void drive();
   
}

class BlackThar extends Thar{

    @Override
    public void drive(){
        System.out.println("black thar is Drive");
    }
}

