import java.util.*;

public class Syllabus_task7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = Integer.parseInt(sc.nextLine().trim());
        Map<String, Integer> frequency = new LinkedHashMap<>();

        for (int i = 0; i < n; i++) {
            String tag = sc.nextLine().trim();
            frequency.merge(tag, 1, Integer::sum);
        }

        for (Map.Entry<String, Integer> entry : frequency.entrySet()) {
            System.out.println(entry.getKey() + " " + entry.getValue());
        }
    }
}
