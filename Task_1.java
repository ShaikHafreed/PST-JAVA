import java.util.Scanner;

public class Task_1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        
        int n = sc.nextInt();

        // Create array
        int[] salary = new int[n];

        // Read salaries
        for (int i = 0; i < n; i++) {
            salary[i] = sc.nextInt();
        }

        // Increase salary by 10% and print
        System.out.println("Updated Salaries:");

        for (int i = 0; i < n; i++) {
            salary[i] = salary[i] + (salary[i] * 10 / 100);
            System.out.print(salary[i] + " ");
        }

        sc.close();
    }
}