import java.util.Scanner;

public class ScannerInput {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();  // reads full line including spaces
        // String name = sc.next();   // reads single word (stops at space)
        // int age = sc.nextInt();    // reads integer
        // double amount = sc.nextDouble(); // reads decimal number
        // boolean bool = sc.nextBoolean(); // reads true/false

        System.out.println("Hello " + name);

        sc.close(); // always close scanner after use to avoid resource leak
    }
}

/*
 * Scanner vs BufferedReader
 *
 * Scanner:
 * - easier to use, built-in methods for all data types (nextInt, nextDouble etc.)
 * - slower because it parses input using regex
 * - suitable for small inputs / competitive programming
 * - can read int, double, boolean directly without parsing
 *
 * BufferedReader:
 * - faster because it reads raw characters without parsing
 * - only reads String → need to manually parse (Integer.parseInt etc.)
 * - suitable for large inputs / performance critical applications
 * - needs throws IOException
 *
 * Rule: use Scanner for simplicity, BufferedReader for performance
 */
