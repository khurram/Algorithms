package me.aslam.khurram.trees;

public class Node {
    private Node left;
    private Node right;
    private int value;

    public Node(Node left, Node right, int value) {
        this.left = left;
        this.right = right;
        this.value = value;
    }

    public Node getLeft() {
        return this.left;
    }

    public Node getRight() {
        return this.right;
    }

    public int getValue() {
        return this.value;
    }

    public void printValue() {
        System.out.println(value);
    }
}