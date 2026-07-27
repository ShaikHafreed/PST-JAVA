import java.util.*;

public class Syllabus_task10 {
    static boolean validate(String username, String password) {
        boolean usernameValid = username.length() >= 3 && username.length() <= 20;
        boolean passwordValid = password.length() >= 6 && password.length() <= 20;
        return usernameValid && passwordValid;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());

        for (int i = 0; i < n; i++) {
            String[] parts = sc.nextLine().trim().split("\\s+");
            String username = parts[0];
            String password = parts[1];
            System.out.println(validate(username, password) ? "SUCCESS" : "FAILURE");
        }
    }
}
