package DataStructuresImplementation.LinkedLists.DoublyLinkedList.BasicSetup;

public class UseLinkedListBasicSetup {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;
        head.next = n2;
//        head.prev = null;

        n2.next = n3;
        n2.prev = head;

        n3.prev = n2;
        Node tail = n3;

        System.out.println(head);
        System.out.println(n1.data);
        System.out.println(n1.next);
        System.out.println(n1.next.data); //equal to n2.data
        System.out.println(n2.data);
        System.out.println(n3.next);


        System.out.println(tail); //n3
        System.out.println(tail.data); //n3
        System.out.println(tail.prev.data);//n2
        System.out.println(tail.prev.prev.data);//n1
//        System.out.println(tail.prev.prev.prev.data); //null pointer exception
    }
}
