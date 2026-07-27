import java.util.*;

public class Syllabus_task8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] firstLine = sc.nextLine().trim().split("\\s+");
        int n = Integer.parseInt(firstLine[0]);
        int m = Integer.parseInt(firstLine[1]);

        Map<Integer, List<Integer>> graph = new HashMap<>();
        for (int i = 1; i <= n; i++) {
            graph.put(i, new ArrayList<>());
        }

        for (int i = 0; i < m; i++) {
            String[] edge = sc.nextLine().trim().split("\\s+");
            int u = Integer.parseInt(edge[0]);
            int v = Integer.parseInt(edge[1]);
            graph.get(u).add(v);
            graph.get(v).add(u);
        }

        String[] query = sc.nextLine().trim().split("\\s+");
        int source = Integer.parseInt(query[0]);
        int destination = Integer.parseInt(query[1]);

        Set<Integer> visited = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(source);
        visited.add(source);
        boolean found = false;

        while (!queue.isEmpty()) {
            int current = queue.poll();
            if (current == destination) {
                found = true;
                break;
            }
            for (int neighbor : graph.get(current)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }

        System.out.println(found ? "YES" : "NO");
    }
}
