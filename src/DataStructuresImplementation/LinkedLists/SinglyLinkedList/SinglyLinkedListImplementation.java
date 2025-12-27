package DataStructuresImplementation.LinkedLists.SinglyLinkedList;

class Node<T>{
    T data;
    Node next;

    Node(T data){
        this.data = data;
        this.next = null;
    }
}

public class SinglyLinkedListImplementation implements SinglyLinkedList {
    Node head;
    SinglyLinkedListImplementation(Node head){
        this.head =  head;
    }

    @Override
    public int search(Object valueToSearch) {
        Node current = head;
        int foundAt = 1;
        while(current!=null){
            if(current.data == valueToSearch){
                return foundAt;
            }
            foundAt++;
            current = current.next;
        }
        return -1;
    }

    @Override
    public Node insert(Object dataToInsert, int positionToInsertAt) {
        Node newNode = new Node(dataToInsert);
        if(positionToInsertAt == 1){ //insert before head
            newNode.next = head;
            head = newNode;
            return head;
        }

        Node previous = head;
        for(int i=1; i<positionToInsertAt-1;i++){
            previous = previous.next;
        }
        newNode.next = previous.next;
        previous.next = newNode;

        return head;
    }

    @Override
    public Node delete(int positionToDeleteAt) {
        if(positionToDeleteAt == 1){ //delete first node or the head node
            head = head.next;
            return head;
        }

        //any other position
        Node previous = head;
        for(int i=1; i<positionToDeleteAt-1;i++){
            previous = previous.next;
        }
        previous.next = previous.next.next;
        return head;
    }

    public Node reverse(){
        Node current = head;
        Node previous = null;
        while(current!=null){
            Node temp = current.next; //<- saving the next node
            current.next = previous; //<- reversed the current node
            previous = current; //<-previous pointer moved to the current node
            current = temp; //<- current pointer moved to the next node
        }
        head = previous;
        return head;
    }
}
