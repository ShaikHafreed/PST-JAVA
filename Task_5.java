import java.util.Scanner;
import java.util.Arrays;

public class Task_5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Enter " + n + " elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        System.out.print("Enter K: ");
        int k = sc.nextInt();

        if (k < 1 || k > n) {
            System.out.println("Invalid K!");
            return;
        }

        // simplest approach: sort a copy, then the Kth smallest is at index k-1
        int[] sorted = arr.clone();
        Arrays.sort(sorted);

        System.out.println("The " + k + "th smallest element is: " + sorted[k - 1]);
    }
}