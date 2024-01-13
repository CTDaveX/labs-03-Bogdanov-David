package lab05$hashtrees.trees;

/**
 * Class for storing a single node in a binary tree of integers
 */

public class IntTreeNode {

    public int data;            // data stored at this node
    public IntTreeNode left;
    public IntTreeNode right;

    // constructs a leaf node with given data
    public IntTreeNode(int data) {
        this(data, null, null);
    }

    // constructs a node with given data, left subtree,
    // right subtree
    public IntTreeNode(int data, IntTreeNode left, IntTreeNode right) {
        this.data = data;
        this.left = left;
        this.right = right;
    }

}

