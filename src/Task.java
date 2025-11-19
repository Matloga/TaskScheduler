public class Task implements Comparable<Task> {
    String name;
    int priority; // Lower = Higher priority

    public Task(String name, int priority) {
        this.name = name;
        this.priority = priority;
    }

    @Override
    public int compareTo(Task other) {
        return Integer.compare(this.priority, other.priority);
    }

    @Override
    public String toString() {
        return name + " (priority " + priority + ")";
    }
}
