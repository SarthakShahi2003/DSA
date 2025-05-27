public class basic {
    static class Node {
        int data;
        Node next;

        Node(int data1, Node next1) {
            this.data = data1;
            this.next = next1;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 34, 5};
        Node y = new Node(arr[2], null);
        System.out.println("Node data: " + y.data);
    }
}
