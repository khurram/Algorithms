package me.aslam.khurram.trees;

public class BinaryTree {

    public Node findNode(Node root, int value) {
        while (root != null) {
            int currval = root.getValue();
            if (currval == value) {
                break;
            }

            if (currval < value) {
                root = root.getRight();
            } else {
                root = root.getLeft();
            }
        }
        return root;
    }

    public Node findNodeRecursive(Node root, int value) {
        if (root == null) {
            return null;
        }

        int currval = root.getValue();
        if (currval == value) {
            return root;
        }
        if (currval < value) {
            return findNodeRecursive(root.getRight(), value);
        } else {
            return findNodeRecursive(root.getLeft(), value);
        }
    }

    public static int treeHeight(Node n) {
        if (n == null) {
            return 0;
        } else {
            return 1 + Math.max(treeHeight(n.getLeft()), treeHeight(n.getRight()));
        }
    }

    public void preorderTraversal(Node root) {
        if (root == null)
            return;
        root.printValue();
        preorderTraversal(root.getLeft());
        preorderTraversal(root.getRight());
    }

    public void inorderTraversal(Node root) {
        if (root == null)
            return;
        inorderTraversal(root.getLeft());
        root.printValue();
        inorderTraversal(root.getRight());
    }

    public void postorderTraversal(Node root) {
        if (root == null)
            return;
        postorderTraversal(root.getLeft());
        postorderTraversal(root.getRight());
        root.printValue();
    }
}