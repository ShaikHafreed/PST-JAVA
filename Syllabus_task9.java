import java.util.*;

public class Syllabus_task9 {
    static int add(int a, int b) {
        return a + b;
    }

    static int divide(int a, int b) {
        return a / b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] parts = sc.nextLine().trim().split("\\s+");
        int a = Integer.parseInt(parts[0]);
        String operator = parts[1];
        int b = Integer.parseInt(parts[2]);

        boolean passed;
        try {
            if (operator.equals("+")) {
                passed = add(a, b) == (a + b);
            } else if (operator.equals("/")) {
                passed = divide(a, b) == (a / b);
            } else {
                passed = false;
            }
        } catch (ArithmeticException e) {
            passed = false;
        }

        System.out.println(passed ? "Test Passed" : "Test Failed");
    }
}
