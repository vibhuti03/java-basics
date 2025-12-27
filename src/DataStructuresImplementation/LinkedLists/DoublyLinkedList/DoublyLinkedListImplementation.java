package DataStructuresImplementation.LinkedLists.DoublyLinkedList;

class Node{
    char data;
    Node prev;
    Node next;

    Node(char data){
        this.data = data;
        prev = next = null;
    }
}

public class DoublyLinkedListImplementation implements DoublyLinkedList{
    @Override
    public void traverseFromBeginning(Node head) {
        while(head!=null){
            System.out.print(head.data+"-----");
            head = head.next;
        }
        System.out.println();
    }

    @Override
    public void traverseFromEnd(Node tail) {
        while(tail!=null){
            System.out.print(tail.data+"-----");
            tail = tail.prev;
        }
        System.out.println();
    }

    @Override
    public Node insertion(char data, int position, Node head) {
        Node newNode = new Node(data);
        if(position == 1){
            newNode.next = head;
            head.prev = newNode;
            head = newNode;
            return head;
        }
        int i = 1;
        Node current = head;
        while(i<position-1){
            current = current.next;
            i++;
        }
        newNode.next = current.next;
        newNode.prev = current;
        current.next = newNode;
        return head;
    }

    @Override
    public Node deletion(int position, Node head) {
        if(position<1){
            return head;
        }
        if(position==1){
            head.next = head.next.next;
            head.next.prev = null;
            return head;
        }

        int i=1;
        Node current = head;
        while(i<position-1){
            if(current == null){
                return head;
            }
            current=current.next;
            i++;
        }
        if(current.next.next!=null) {
            current.next.next.prev = current;}
            current.next = current.next.next;

        return head;
    }
}
