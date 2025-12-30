package DataStructuresImplementation.Trees.BinaryTree;

public interface BinaryTree {
    Node createTree();

    void inOrder(Node root);

    void preOrder(Node root);

    void postOrder(Node root);
}
