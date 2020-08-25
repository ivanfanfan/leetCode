package javacore.binaryTree;

import javax.swing.*;

public class LinkedBinaryTree implements BinaryTree{

    private Node root;
    public LinkedBinaryTree() {
    }
    public LinkedBinaryTree(Node node) {
        super();
        this.root = node;
    }
    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return this.size(root);
    }
    public int size(Node root){
        if(root==null){
            return 0;
        }
        int leftSize = this.size(root.leftChild);
        int rightSize = this.size(root.rightChild);
        return 1+leftSize+rightSize;
    }
    @Override
    public int getHeight() {
        return this.getHeight(root);
    }

    private int getHeight(Node root) {
//        递归结束条件
        if(root==null){
            return 0;
        }
        //获取左子树的高度
        int lHeight = getHeight(root.leftChild);
        //获取右子树的高度
        int rHegiht = getHeight(root.rightChild);
        //比较左右大小
        int num = lHeight>rHegiht?lHeight:rHegiht;
        return num+1;
    }

    @Override
    public Node findKey(int value) {
        return null;
    }

    @Override
    public void preOrderTraverse(Node root) {
        //先
        if(root != null){
            System.out.print(root.value);
            preOrderTraverse(root.leftChild);
            preOrderTraverse(root.rightChild);
        }
    }

    @Override
    public void inOrderTraverse(Node root) {
        //中序遍历
        if(root!=null){
            inOrderTraverse(root.leftChild);
            System.out.print(root.value);
            inOrderTraverse(root.rightChild);
        }
    }

    @Override
    public void postOrderTraverse(Node root) {
        if(root == null){
            return;
        }
        //先左
        postOrderTraverse(root.leftChild);
        postOrderTraverse(root.rightChild);
        System.out.print(root.value);
    }

    @Override
    public void levelOrderByStack() {

    }
}
