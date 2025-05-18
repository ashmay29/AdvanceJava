import java.util.LinkedList;

class TaskQueue {
    public static void main(String[] args) {
        LinkedList<String> queue = new LinkedList<>();

        queue.add("Send email");
        queue.add("Process payment");
        queue.add("Generate report");

        System.out.println("Tasks added to the queue.");
        String firstTask = queue.poll();
        System.out.println("Processing: " + firstTask);
        String secondTask = queue.poll();
        System.out.println("Processing: " + secondTask);

        System.out.println("Remaining tasks:");
        for (String task : queue) {
            System.out.println(task);
        }
    }
}
