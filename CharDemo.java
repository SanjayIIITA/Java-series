

public class CharDemo {
    public static void main(String args[]){
        //Integer-- int byte short long
        byte b = 5;
        short s = 10;
        int i = 4000;
        long l = 1000; // use 20_90_87_98 both can be uses


        byte bb= 0b101; // binary number
        byte o = 05; // range(0-7) octal number
        byte h = 0XA; // Hexadecimal(0-15)

        // Real number
        float f = 12.89f;
        double d = 12.897654321;

        // char value
        char ch = 'A';  // 'A' -----> Integer ----> bunary----> store

        // Boolean value 

        boolean bool = false;




        System.out.println("Integer values----> " + b + "," + s + "," + i + "," + l + ", " + bb );
        System.out.println("Decimal values----> " + f + ", " + d);
        System.out.println("Character value----> " + ch);
        System.out.println("Boolean value----> " + bool);         
    }
}
