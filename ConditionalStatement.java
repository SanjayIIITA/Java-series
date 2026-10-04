

public class ConditionalStatement{
    public static void main(String[] args) {
        // int x = 10;
        // int y = 12;
    //     if(x>y){
    //         System.out.println("x is greater than y");
    //     }
    //     else{
    //         System.out.println("y is greater than x");
    //     }

    //     System.out.println((x>y)?"x is greater":"y is greater");
    //     boolean b = true;
    //     int i = 5;
    //     // selection statement
    //     // Normal if
    //     if (i == 5) {
    //         System.out.println("i is equal to 5");
    //     }
    //    else {
    //      System.out.println("i is not equal to 5");
    //     }

    int i = 6 ;
    // if (i % 2 == 0) {
    //     System.out.println("Even Number");
    // }
    // else{   
    //     System.out.println("Odd Number");
    // }


    //Nested if else
    if (i > 5) {
        if (i < 10) {
            System.out.println("Positive Even Number");
        }
        else{
            System.out.println("Positive Odd Number");
        }
    }
    else {
        System.out.println("Number is less than 5");

    }
    // if-else-if ladder

    int age = 70;

    if (age > 70){
    System.out.println("Senior Citizen");
    } 
    else if (age > 45) {
        System.out.println("you are becoming old");
    }
    else if (age > 18) {
        System.out.println("Adult");
    }
    else {
        System.out.println("Child");
    }


    }
    //when compile javac --> byte code ---> Jvm --->  machine code 

}