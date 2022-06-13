public class Node {

    // variables
    int minHeap;

    /**
     * Constructor
     * 
     * @param capacity
     */
    public Node(int capacity) {
        minHeap = capacity;
    }

    @Override
    public String toString() {

        return "Priority:" + minHeap;
    }
}