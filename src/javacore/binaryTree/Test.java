package javacore.binaryTree;

public class Test {
    public static void main(String[] args) {
        Node node5 = new Node(5,null,null);
        Node node4 = new Node(4,null,node5);
        Node node7 = new Node(7,null,null);
        Node node3 = new Node(3,null,null);
        Node node6 = new Node(6,null,node7);
        Node node2 = new Node(2,node3,node6);
        Node root = new Node(1,node4,node2);
        BinaryTree binaryTree = new LinkedBinaryTree(root);
        System.out.println(binaryTree.size());
        System.out.println(binaryTree.getHeight());
        binaryTree.postOrderTraverse(root);
        binaryTree.preOrderTraverse(root);
        binaryTree.inOrderTraverse(root);
    }
}
