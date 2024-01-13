package lab02$linkedlists;

/**
 * CODING EXAMPLE
 * This is a class for storing a single node of a linked list.
 *
 * data fields are not encapsulated.
 * methods must be in alphabetical order.
 *
 * TODO: Use this example to build a "generic" inner static node class.
 *
 */

public class IntNode {

    public int data;            // data stored in node
    public IntNode next;        // reference to next node in list

    /**
     * constructs node object with data specified, and sets next
     * reference to null.
     * @param data entry to list.
     */
    public IntNode(int data){
        this(data, null);
    }


    /**
     * constructs a node object to store specified data and location
     * of next node in list.
     * @param data entry to list.
     * @param next node in list.
     */
    public IntNode(int data, IntNode next){
        this.data = data;
        this.next = next;
    }

}
