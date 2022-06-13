public class Main {
    public static void main(String[] args) {
        PriorityQueue priorityQueue = new PriorityQueue(10);

        priorityQueue.insert(new Node(2));
        priorityQueue.insert(new Node(2));
        priorityQueue.insert(new Node(2));

        priorityQueue.node.print();
    }
}