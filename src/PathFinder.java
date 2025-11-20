import java.util.*;

public class PathFinder {

    public static List<String> bfsShortestPath(Graph graph, String start, String end) {
        Queue<List<String>> queue = new LinkedList<>();
        Set<String> visited = new HashSet<>();

        queue.add(Arrays.asList(start));
        visited.add(start);

        while (!queue.isEmpty()) {
            List<String> path = queue.poll();
            String last = path.get(path.size() - 1);

            if (last.equals(end)) return path;

            for (String neighbor : graph.getNeighbors(last)) {
                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);

                    List<String> newPath = new ArrayList<>(path);
                    newPath.add(neighbor);
                    queue.add(newPath);
                }
            }
        }
        return null;
    }
}
