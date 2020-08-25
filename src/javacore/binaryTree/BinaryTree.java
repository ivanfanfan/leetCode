package javacore.binaryTree;

public interface BinaryTree {
    /**
     * 判断是否为空
     * @return
     */
    boolean isEmpty();

    int size();

    int getHeight();

    Node findKey(int value);

    /**
     * 先序遍历
     */
    void preOrderTraverse(Node root);

    /**
     * 中序遍历
     */
    void inOrderTraverse(Node root);

    /**
     * 后序遍历
     */
    void postOrderTraverse(Node root);
    /**
     * 按照层次遍历
     */
    void levelOrderByStack();


}

