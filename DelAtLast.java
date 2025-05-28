public class DelAtLast {
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

    private static Node DeleteAtLast(Node head) {
        if (head == null||head.next==null) return null;
        Node temp=head;
        while (temp.next.next!=null) {
            temp=temp.next;
            
        }
        temp.next=null;
        return head   ;
    }

    private static void print(Node head) {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
    }

    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 6, 8};
        Node head = traverseLL(arr);
        head = DeleteAtLast(head);
        print(head); // Prints: 3 5 6 8
    }
}
