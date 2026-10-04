import java.util.Scanner;
public class Practice{
    public static void main(String[] args) {

        //1. enter a user input number and check 

        Scanner scanner = new Scanner(System.in);
        System.out.print("Input: ");
        int a = scanner.nextInt();
        if (a > 0 ){

            System.out.println("Positive Number");
        }
        else {
            System.out.println(" Negative number");
        }

        //2. even odd
        if (a % 2  == 0 ){

            System.out.println("Even Number");
        }
        else {
            System.out.println("odd number");
        }

        //3. EligIble for voting or not

        if (a >= 18 ){

            System.out.println("Eligible for voting");
        }
        else{
         System.err.println("NOT ELIGIBALE ");
        }

        // 4. find largest number between two numbers

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter second number: ");
        int b = scanner.nextInt();

        if (a > b){

            System.out.println("Largest number is: " + a);
        }
        else{
            System.out.println("Largest number is: " + b);
        }

        // 5. Temprature into category

        if (a <= 10){

            System.out.println("Cold weather");
        } 
        else if(a >= 10 && a <= 25){
            System.out.println("Moderate temp");
        }
        else if(a >= 25){
            System.err.println("Hot temp");
        }

        // 6. Student grade calculator

        if (a >= 90){

            System.out.println("Grade A");
        }
        else if (a >= 75){
            System.err.println("Grade B");
        }
        else if (a >= 60){
            System.out.println("Grade C");
        }
        else if(a >= 40){
            System.out.println("Grade D");
        }
        else if (a < 40){
            System.err.println("Fail");
        }

        // 7. find largest number between three numbers
        Scanner sc1 = new Scanner(System.in);
        System.out.print("Enter third number: ");
        int c = scanner.nextInt();
        if (a > b && a > c){
            System.out.println("Greatest number is: " + a);
        }
        else if (b > a && b > c){
            System.out.println("Greatest number is: " + b);
        }
        else {
            System.out.println("Greatest number is: " + c);
        }

        // 8. find negative positive zero number
        if (a > 0){
            System.out.println("Number is positive");
        }
        else if (a < 0){
            System.out.println("Number is negative");
        }
        else {
            System.out.println("Number is zero");
        }

        //9. find leap year or not

        if (a % 4 == 0 && a % 100 != 0 || a % 400 == 0){
            System.out.println("Leap year");
        }
        else{
            System.out.println("Not a leap year");
        }

        // 10. check vowel or consonant
        char ch = 'i';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println("Vowel");
        }
        else{
            System.out.println("Consonant");
        }

        // 11. Calculator
        if (ch == '+'){
            System.out.println(a + b);
        }

        else if (ch == '-'){
            System.out.println(a - b);
        }

        else if (ch == '*'){
            System.out.println(a * b);
        }
        else if (ch == '/'){
            System.out.println(a / b);
        }


        // 12. day of week (calender)

        switch (a) {
            case 1:
                System.out.println("Sunday");
                break;
            case 2:
                System.out.println("Monday");
                break;
            case 3:
                System.out.println("Tuesday");
                break;
            case 4:
                System.out.println("Wednesday");
                break;
            case 5:
                System.out.println("Thursday");
                break;
            case 6:
                System.out.println("Friday");
                break;
            case 7:
                System.out.println("Saturday");
                break;
        
            default:
            System.out.println("Invalid Input");
                break;
        }
    }
    
}