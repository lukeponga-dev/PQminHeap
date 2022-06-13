import java.util.Arrays;

public class Node {
    Node[] heapArray;
    public int next = 0;

    public Node(int capacity) {
        heapArray = new Node[capacity + 1];
        next = 1;
    }

    public void print() {
        System.out.println(Arrays.toString(heapArray));
    }

}