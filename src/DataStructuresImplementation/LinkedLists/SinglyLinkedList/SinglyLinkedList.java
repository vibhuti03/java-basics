package DataStructuresImplementation.LinkedLists.SinglyLinkedList;

public interface SinglyLinkedList<T> {
    int search(T valueToSearch);

    Node insert(T dataToInsert, int positionToInsertAt);

    Node delete(int positionToDeleteAt);

    Node reverse();
}
