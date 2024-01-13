package lab05$hashtrees.trees;

import java.util.NoSuchElementException;

public class IntSearchTree {

    private IntTreeNode root;

    // constructs an empty tree
    public IntSearchTree() {
        root = null;
    }

    /**
     * value is added to overall tree to preserve the
     * binary search tree property
     */
    public void add(int value) {
        root = add(root, value);
    }

    /**
     * value is added to given tree to preserve the
     * binary search tree property
     */
    private IntTreeNode add(IntTreeNode root, int value) {
        if (root == null) {
            root = new IntTreeNode(value);
        } else if (value <= root.data) {
            root.left = add(root.left, value);
        } else {
            root.right = add(root.right, value);
        }
        return root;
    }

    /**
     * returns true, if overall tree contains value specified
     */
    public boolean contains(int value) {
        return contains(root, value);
    }   

    /**
     * returns true, if given tree contains value
     */
    private boolean contains(IntTreeNode root, int value) {
        if (root == null) {
            return false;
        } else if (value == root.data) {
            return true;
        } else if (value < root.data) {
            return contains(root.left, value);
        } else {  // value > root.data
            return contains(root.right, value);
        }
    }
    
    /**
     * returns the minimum value from this BST.
     * throws a NoSuchElementException if the tree is empty.
     */
    public int getMin() {
        if (root == null) {
            throw new NoSuchElementException();
        }
        return getMin(root);
    }
    
    private int getMin(IntTreeNode root) {
        if (root.left == null) {
            return root.data;
        } else {
            return getMin(root.left);
        }
    }

    /**
     * prints the tree contents using an inorder traversal
     */
    public void print() {
        printInorder(root);
        System.out.println();
    }

    /**
     * prints contents of the tree with given root using an
     * inorder traversal
     */
    private void printInorder(IntTreeNode root) {
        if (root != null) {
            printInorder(root.left);
            System.out.print(root.data + " " );
            printInorder(root.right);
        }
    }

    /**
     *  prints the tree contents, one per line, following an
     *  inorder traversal and using indentation to indicate
     *  node depth; prints right to left so that it looks
     *  correct when the output is rotated.
     */
    public void printSideways() {
        printSideways(root, 0);
    }

    /** prints in reversed preorder the tree with given
     *  root, indenting each line to the given level
     */
    private void printSideways(IntTreeNode root, int level) {
        if (root != null) {
            printSideways(root.right, level + 1);
            for (int i = 0; i < level; i++) {
                System.out.print("    ");
            }
            System.out.println(root.data);
            printSideways(root.left, level + 1);
        }
    }
    
    
    /**
     * Removes the given value from this BST, if it exists.
     * */
    public void remove(int value) {
        root = remove(root, value);
    }
    
    private IntTreeNode remove(IntTreeNode root, int value) {
        if (root == null) {
            return null;
        }else if (root.data > value) {
            root.left = remove(root.left, value);
        }else if (root.data < value) {
            root.right = remove(root.right, value);
        }else {
            // root.data == value; remove this node
            if (root.right == null) {
                return root.left;               // no R child; replace w/ L
            } else if (root.left == null) {
                return root.right;              // no L child; replace w/ R
            } else {
                // both children; replace w/ min from R
                root.data = getMin(root.right);
                root.right = remove(root.right, root.data);
            }
        }
        return root;
    } 

}
