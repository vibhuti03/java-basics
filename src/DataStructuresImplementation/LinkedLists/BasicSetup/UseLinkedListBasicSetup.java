package DataStructuresImplementation.LinkedLists.BasicSetup;

public class UseLinkedListBasicSetup {
    public static void main(String[] args) {
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);

        Node head = n1;
        head.next = n2;
        n2.next = n3;

        System.out.println(head);
        System.out.println(n1.data);
        System.out.println(n1.next);
        System.out.println(n1.next.data); //equal to n2.data
        System.out.println(n2.data);
        System.out.println(n3.next);
    }
}
