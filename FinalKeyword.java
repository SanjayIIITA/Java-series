public class FinalKeyword{
    public static void main(String[] args){
        Random r = new Random();
        System.out.println(r.PI);

        final int x ; // final variable, cannot be changed
        x = 10; // final variable can be initialized only once
        System.out.println(x);
    }
}

//Why main method is static in java?

//FinalKeyword f = new FinalKeyword();
//f.main();
//FinalKeyword.main(); 

// Because when the main method is static, it can be called without creating an object of the class.
// If the main method is not static, then we need to create an object of the class to call the main method. This is not possible because the main method is the entry point of the program. So, the main method is static.
 

class Random{

   // final double PI; // final variable, cannot be changed
    // final variable can be initialized only once, either at the time of declaration or in the constructor

    // static final double PI = 3.14159; // final variable can be initialized at the time of declaration
    static final double PI; // final variable can be initialized in static block

    // Random(){
    //     this.PI = 3.14159; // cannot assign a value to final variable PI after declaration
    // }
    static{
        PI  = 3.14159; // final variable can be initialized in static block
    }
}