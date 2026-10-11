public class FinalKeyword2{
    public static void main(String[] args){
        
        final int x = 10; // final variable
        // x = 20; // cannot assign a value to final variable

        System.out.println(x);

        System.out.println("Number of Arguments: " + args.length); // final variable can be accessed using class name

        for(int i = 0; i < args.length; i++){
            System.out.println("Argument " + i + " = " + args[i]);
        }
    }
}