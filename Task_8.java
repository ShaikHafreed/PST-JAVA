import java.util.Scanner;

// Custom functional interface for the Fibonacci calculation
interface Fibonacci {
    long calculate(int n);
}

public class Task_8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter N: ");
        int n = sc.nextInt();

        // Lambda expression implementing Fibonacci (iterative, 0-indexed: fib(0)=0, fib(1)=1)
        Fibonacci fib = num -> {
            long a = 0, b = 1;
            for (int i = 0; i < num; i++) {
                long next = a + b;
                a = b;
                b = next;
            }
            return a;
        };

        System.out.println(n + "th Fibonacci number is: " + fib.calculate(n));
    }
}