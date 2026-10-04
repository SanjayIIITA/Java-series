public class TypeConversion{
    public static void main(String[] args) {
        //1. Implicit type conversion
        // byte b = 24;
        // int i;
        // i = b;
        // System.out.println(b + ", " + i); // 24

        // char to int
        char ch = 'A';
        int a = ch;
         
        System.out.println(ch + ", " + a);   

        //2.Explicit type conversion

        int i = 300;
        byte b;  // range (-128 to 127)=> 256
        // byte b = (byte) i;
        b = (byte) i;
        System.out.println(i +" " + b ); // 300 % 256 = 44

        //3. Trucating conversion

        float f = 300.00f;

        int i1 ;
        i1 = (int)f;
        System.out.println(f + " " + i1);

        // 4. Boolean conversion is not possible in java

        // boolean bool = true;
        // int i = (int) bool;

        // 5. Automatic type promotion in expression
        byte b1 = 100;
        byte b2 = 50;
        b2 = (byte)(b2*2); // typecasting
        System.out.println("" + b2);
        byte b3 = (byte)(b1 * b2);
        System.err.println("" + b3);
        int c = (b3 * b2)/b1; 
        System.out.println(c);

        
    }
}