import java.util.PriorityQueue;

public class TaskScheduler {
    private PriorityQueue<Task> queue = new PriorityQueue<>();

    public void addTask(String name, int priority) {
        queue.add(new Task(name, priority));
    }

    public Task processNextTask() {
        return queue.poll();
    }

    public boolean isEmpty() {
        return queue.isEmpty();
    }
}
