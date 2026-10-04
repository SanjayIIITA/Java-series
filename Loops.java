public class Loops{
    public static void main(String[] args) {

        for (int i=1; i <=5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* "); // imp point to note
            } 
            System.out.println();
        }

         System.out.println();
         
        for(int i=5; i >=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}

/*
    *
    **
    ***
    ****
    *****
 */

/*

        for (int i=1; i <=5; i++){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        *****
        ****
        **
        *

*/

/*
    for(int i=5; i >=1; i--){
            for(int j = 1; j <= i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }

*/

/*
    1. for loop
    2. while loop
    3. do-while loop

    for(initialization; condition; increment/decrement){
        // statements
    }

    while(condition){
        // statements
        increment/decrement
    }

    do{
        // statements
        increment/decrement
    }while(condition);

*/
