public class CallbyValue {
    public static void main(String[] args) {
        // int x = 10;
        // System.out.println("Before calling method: " + x);
        // changeValue(x);
        // System.out.println("After calling method: " + x);

        int x = 10;
        int y = 20;
        System.out.println("Before calling method: x = " + x + ", y = " + y);
        
        twoNumbers(x, y); 
        // again it is referencing the original values of x and y in main method, so the changes made inside the method will not affect the original variables x and y in main method.
        System.out.println("After calling method: x = " + x + ", y = " + y); // Output: x = 10, y = 20
    }

    // static void changeValue(int num) {
    //     num = 20;
    //     System.out.println("Inside method: " + num);
    // }

    static void twoNumbers(int x, int y) { // x, y are local copies of the original variables
        x = x + 5; // This change will not affect the original variable x in main method
        y = y + 6; // This change will not affect the original variable y in main method
        System.out.println("Inside method: x = " + x + ", y = " + y);
    } // x = 15, y = 26 it function call finish going back to main method will not affect the original values of x and y in main method, because they are passed by value.
    // In Java, when you pass primitive data types (like int, float, etc.) to a method, it is passed by value. 
    //This means that a copy of the variable is made and used inside the method. Any changes made to the parameter inside the method do not affect the original variable outside the method.
}