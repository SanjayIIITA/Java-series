
public class Recursion {

    public static void main(String[] args) {
        int n = 10;
        System.out.println("Fibonacci series up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(fibonacciRecursive(i) + " ");
        }

        fibonacciIterative(n);
        factorialIterative(n);
        System.out.println("\nFactorial of " + n + " is: " + factorialRecursive(5));
    }
    
    static int fibonacciRecursive(int n) {
        if (n <= 0) {
            return 0;
        }
        if (n == 1) {
            return 1;
        }
        return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

    static void fibonacciIterative(int n) {
        int a = 0, b = 1;
        System.out.println("\nFibonacci series (iterative) up to " + n + " terms:");
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); // 0, 1, 1, 2,  3
            int next = a + b; // 0 + 1, 1 +1, 2, 5, 8
            a = b; // 1, 1, 2, 3, 5
            b = next; // 1, 2,3, 5, 8
        }
    }

    static void factorialIterative(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        System.out.println("\nFactorial of " + n + " is: " + result);
    }

    static int factorialRecursive(int n) {
        if (n == 0) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }

    /*
        5 * factorial(4)
        5 * 4 * factorial(3)
        5 * 4 * 3 * factorial(2)
        5 * 4 * 3 * 2 * factorial(1)
        5 * 4 * 3 * 2 * 1 * factorial(0) → returns 1
        = 120
     */
}
