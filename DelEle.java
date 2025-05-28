public class DelEle {
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

    private static Node DeleteElemnt(Node head, int ele) {
        if (head == null)
            return head;
        if (head.data==ele) {
            
            head = head.next;

            return head;
        }
        
        Node prev = null;
        Node temp = head;

        while (temp != null) {
            
        
        if (temp.data==ele) {
            prev.next = prev.next.next;
            break;
        }
        prev = temp;
        temp = temp.next;
    }

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
        head = DeleteElemnt(head, 5);
        print(head); 
    }
}
