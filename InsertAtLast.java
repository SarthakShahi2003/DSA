public class InsertAtLast {
    static class Node {
        int data;
        Node next;

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }

    private static Node traverseLL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

    private static Node InsertAtLast(Node head, int val) {
        Node temp2 = new Node(val);
        if (head == null)
            return temp2; // if the list is empty, return the new node as head

        Node temp1 = head;
        while (temp1.next != null) {
            temp1 = temp1.next;
        }
        temp1.next = temp2;
        return head;
    }

    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = { 12, 3, 5, 6, 8 };
        Node head = traverseLL(arr);
        head = InsertAtLast(head, 100);
        print(head); // Output: 100 12 3 5 6 8
    }
}
