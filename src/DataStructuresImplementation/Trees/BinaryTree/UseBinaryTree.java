package DataStructuresImplementation.Trees.BinaryTree;

public class UseBinaryTree {
    public static void main(String[] args) {
        BinaryTree binaryTree = new BinaryTreeImplementation();

        Node root = binaryTree.createTree();

        System.out.println("Inorder traversal");
        binaryTree.inOrder(root);

        System.out.println("\nPreorder traversal");
        binaryTree.preOrder(root);

        System.out.println("\nPostorder traversal");
        binaryTree.postOrder(root);

        System.out.println("\nLevel order traversal (same line)");
        binaryTree.levelOrderSameLine(root);

        System.out.println("\nLevel order traversal (level based line)");
        binaryTree.levelOrderLevelBasedLine(root);
    }
}
