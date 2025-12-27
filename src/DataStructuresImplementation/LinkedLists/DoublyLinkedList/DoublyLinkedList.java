package DataStructuresImplementation.LinkedLists.DoublyLinkedList;

public interface DoublyLinkedList {
    void traverseFromBeginning(Node head);

    void traverseFromEnd(Node tail);

    Node insertion(char data, int position, Node head);

    Node deletion(int position, Node head);

}
