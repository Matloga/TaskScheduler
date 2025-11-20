import java.util.*;

public class Graph {
    private Map<String, List<String>> adj = new HashMap<>();

    public void addNode(String node) {
        adj.putIfAbsent(node, new ArrayList<>());
    }

    public void addEdge(String a, String b) {
        adj.get(a).add(b);
        adj.get(b).add(a);
    }

    public List<String> getNeighbors(String node) {
        return adj.getOrDefault(node, new ArrayList<>());
    }
}
