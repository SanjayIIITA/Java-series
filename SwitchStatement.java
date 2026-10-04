public class SwitchStatement {
    public static void main(String[] args) {

       int i = 4;

       switch(i) { // switch (expression) ----> byte, int, short, char, Enumeration
       // i > 3 not support
       case 1:

            System.out.println("Case 1 executed");
            break;
        case 2: 

            System.out.println("Case 2 executed");
            break;
        case 3:

            System.out.println("Case 3 executed");
            break;
        case 4: 

            System.out.println("Case 4 executed");
            break;
        default:
            System.out.println("Default case executed");
            break;
       }
    }

    // switch (expression) ----> byte, int, short, char, Enumeration
    // no duplicate case is allowed 
    // break statement is used to terminate the switch statement
    // After JDK7 string also used in switch case
    // After JDK 14 switch case enhaced too much
}