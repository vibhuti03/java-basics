package DataStructuresImplementation.Trees.BinaryTree;

class BinaryTreeNode{
    char data;
    BinaryTreeNode left;
    BinaryTreeNode right;

    BinaryTreeNode(char data){
        this.data = data;
        left = null;
        right = null;
    }
}

public class BinaryTreeCreationLaymanMethod {
    public static void main(String[] args) {
        /*
                  a
               /     \
              b       c
             / \     / \
            d   e   f   g
           /\  /\  /\  /\
          h i   k   m  n p
         */
        BinaryTreeNode root = new BinaryTreeNode('a');
        root.left = new BinaryTreeNode('b');
        root.left.left = new BinaryTreeNode('d');
        root.left.left.left = new BinaryTreeNode('h');
        root.left.left.right = new BinaryTreeNode('i');
        root.left.right = new BinaryTreeNode('e');
        root.left.left.left = null;
        root.left.left.right = new BinaryTreeNode('k');

        root.right = new BinaryTreeNode('c');
        root.right.left = new BinaryTreeNode('f');
        root.right.left.left = null;
        root.right.left.right = new BinaryTreeNode('m');
        root.right.right = new BinaryTreeNode('g');
        root.right.right.left = new BinaryTreeNode('n');
        root.right.right.right = new BinaryTreeNode('p');
    }
}
