package Day8;

public class Insert at kth Position in linkedlist{

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node insertAtKthPosition(Node head, int value, int k) {

        // Insert at first position
        if (k == 1) {
            Node newNode = new Node(value);
            newNode.next = head;
            return newNode;
        }

        Node newNode = new Node(value);
        Node current = head;

        // Move to (k-1)th node
        for (int i = 1; i < k - 1 && current != null; i++) {
            current = current.next;
        }

        // Invalid position
        if (current == null) {
            return head;
        }

        // Insert new node
        newNode.next = current.next;
        current.next = newNode;

        return head;
    }

    public static void main(String[] args) {

        Node head = new Node(10);
        head.next = new Node(20);
        head.next.next = new Node(30);
        head.next.next.next = new Node(40);

        int value = 25;
        int k = 3;

        head = insertAtKthPosition(head, value, k);

        // Traverse
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}