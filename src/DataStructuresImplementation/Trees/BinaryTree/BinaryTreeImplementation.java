package DataStructuresImplementation.Trees.BinaryTree;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node{
    char data;
    Node left;
    Node right;

    Node(char data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTreeImplementation implements BinaryTree {

    Scanner sc = new Scanner(System.in);

    @Override
    public Node createTree() {
        System.out.print("Enter value - ");
        char value = sc.next().charAt(0);

        if(value == 'X')
            return null;

        Node root = new Node(value);

        System.out.print("Enter data for left of " +value+ ":");
        System.out.println();
        root.left = createTree();
        System.out.print("Enter data for right of " +value+ ":");
        System.out.println();
        root.right = createTree();

        return root;
    }

    @Override
    public void inOrder(Node root) {
        if(root==null) return;

        // left  node  right
        inOrder(root.left);
        System.out.print(root.data + "---");
        inOrder(root.right);
    }

    @Override
    public void preOrder(Node root) {
        if(root==null) return;

        //node left right
        System.out.print(root.data + "---");
        preOrder(root.left);
        preOrder(root.right);
    }

    @Override
    public void postOrder(Node root) {
        if(root==null) return;

        //left right node
        postOrder(root.left);
        postOrder(root.right);
        System.out.print(root.data+"---");
    }

    @Override
    public void levelOrderSameLine(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        while(!queue.isEmpty())
        {
            Node current = queue.poll();
            System.out.print(current.data+"---");

            if(current.left!=null)
                queue.add(current.left);
            if(current.right!=null)
                queue.add(current.right);
        }
    }

    @Override
    public void levelOrderLevelBasedLine(Node root) {
        Queue<Node> queue = new LinkedList<>();

        queue.add(root);
        queue.add(null);
        while (!queue.isEmpty()){
            Node current = queue.poll();
            if(current==null)
            {
                if(queue.isEmpty())
                    return;
                System.out.println();
                queue.add(null);
                continue;
            }

            System.out.print(current.data+"---");
            if(current.left!=null)
                queue.add(current.left);
            if(current.right!=null)
                queue.add(current.right);
        }
    }
}
