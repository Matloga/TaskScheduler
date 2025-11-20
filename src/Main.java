public class Main {
    public static void main(String[] args) {
        TaskScheduler scheduler = new TaskScheduler();
        scheduler.addTask("Fix bug", 1);
        scheduler.addTask("Write documentation", 4);
        scheduler.addTask("Push to GitHub",2);

        System.out.println("Processing Task by Priority:");
        while (!scheduler.isEmpty()) {
            System.out.println("Done: " + scheduler.processNextTask());
        }

        Graph graph = new Graph();
        String[] nodes = {"A", "B", "C", "D", "E"};

        for (String n : nodes) graph.addNode(n);

        graph.addEdge("A", "B");
        graph.addEdge("B", "C");
        graph.addEdge("C", "D");
        graph.addEdge("D", "E");

        System.out.println("\nShortest path from A to D:");
        System.out.println(PathFinder.bfsShortestPath(graph, "A", "D"));
    }
}