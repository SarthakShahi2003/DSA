public class ArrToLL {
    static class Node {
        int data;
        Node next;

        Node(int data1) {
            this.data = data1;
            this.next = null;
        }
    }

    private static Node convertArr2LL(int[] arr) {
        Node head = new Node(arr[0]);
        Node mover = head;
        for (int i = 1; i < arr.length; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
            mover = temp;
        }
        return head;
    }

   
    public static void main(String[] args) {
        int[] arr = {12, 3, 5, 6, 8};
        Node head = convertArr2LL(arr);
        System.out.println(head.data);
    }
}
