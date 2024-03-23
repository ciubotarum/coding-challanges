import java.io.BufferedWriter;
import java.io.IOException;

public class Task19 {
    static class SinglyLinkedListNode {
        public int data;
        public SinglyLinkedListNode next;

        public SinglyLinkedListNode(int nodeData) {
            this.data = nodeData;
            this.next = null;
        }
    }

    static class SinglyLinkedList {
        public SinglyLinkedListNode head;

        public SinglyLinkedList() {
            this.head = null;
        }


    }

    public static void printSinglyLinkedList(SinglyLinkedListNode node, String sep, BufferedWriter bufferedWriter) throws IOException {
        while (node != null) {
            bufferedWriter.write(String.valueOf(node.data));

            node = node.next;

            if (node != null) {
                bufferedWriter.write(sep);
            }
        }
    }

    // Complete the insertNodeAtTail function below.

    /*
     * For your reference:
     *
     * SinglyLinkedListNode {
     *     int data;
     *     SinglyLinkedListNode next;
     * }
     *
     */
    static SinglyLinkedListNode insertNodeAtTail(SinglyLinkedListNode head, int data) {
        SinglyLinkedListNode newNode = new SinglyLinkedListNode(data);

        if (head == null) {
            return newNode;
        }

        SinglyLinkedListNode current = head;
        while (current.next != null) {
            current = current.next;
        }

        current.next = newNode;
        return head;

    }

    public static void main(String[] args) {
        SinglyLinkedList linkedList = new SinglyLinkedList();

        insertNodeAtTail(linkedList.head, 141);
        insertNodeAtTail(linkedList.head, 302);
        insertNodeAtTail(linkedList.head, 164);
        insertNodeAtTail(linkedList.head, 530);
        insertNodeAtTail(linkedList.head, 474);

//        printSinglyLinkedList(linkedList.head);
    }
}
