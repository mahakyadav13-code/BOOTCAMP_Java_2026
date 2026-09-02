package Day11;

public class Create a linkedlist and traverse {
     static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static void main(String[] args) {

        // Create nodes
        Node first = new Node(10);
        Node second = new Node(20);
        Node third = new Node(30);

        // Connect nodes
        first.next = second;
        second.next = third;

        // First node is the head
        Node head = first;

        // Traverse the linked list
        Node current = head;

        while (current != null) {
            System.out.print(current.data + " ");
            current = current.next;
        }
    }
}
