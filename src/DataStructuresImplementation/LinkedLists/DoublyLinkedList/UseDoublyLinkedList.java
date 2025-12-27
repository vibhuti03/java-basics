package DataStructuresImplementation.LinkedLists.DoublyLinkedList;

public class UseDoublyLinkedList {
    public static void main(String[] args) {
        Node n1 = new Node('a');
        Node n2 = new Node('b');
        Node n3 = new Node('d');
        Node n4 = new Node('e');
        Node n5 = new Node('f');

        n1.next = n2;

        n2.prev = n1;
        n2.next = n3;

        n3.prev = n2;
        n3.next = n4;

        n4.prev = n3;
        n4.next = n5;

        n5.prev = n4;

        Node head = n1;
        Node tail = n5;

        DoublyLinkedList doublyLinkedList = new DoublyLinkedListImplementation();

        doublyLinkedList.traverseFromBeginning(head);
        doublyLinkedList.traverseFromEnd(tail);

        doublyLinkedList.insertion('c',3,head);
        doublyLinkedList.traverseFromBeginning(head);


        doublyLinkedList.deletion(4,head);
        doublyLinkedList.traverseFromBeginning(head);
    }
}
