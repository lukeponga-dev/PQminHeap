public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(6);

        // Test adding to the priority queue
        priorityQueue.insert(new Node(2));
        priorityQueue.insert(new Node(1));
        priorityQueue.insert(new Node(5));
        priorityQueue.insert(new Node(4));
        priorityQueue.insert(new Node(3));

        System.out.println();
        priorityQueue.dump();
        System.out.println(priorityQueue.delete());
        priorityQueue.dump();
    }
}
