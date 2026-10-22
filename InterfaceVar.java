public class InterfaceVar{
    public static void main(String[] args) {
        // Random r = new Random();
        // r.display();

        MathConstant r1= new Random();
        r1.display();
        
    }
}

interface MathConstant {
    double PI_VALUE = 3.14;
    int VALUE = 10;

    void display();
}

class Random implements MathConstant{
    
    @Override
    public void display(){
        System.out.println(PI_VALUE); // we can access directly without using object reference
        System.out.println(VALUE);
    }
}