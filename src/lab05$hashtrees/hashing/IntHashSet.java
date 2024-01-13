package lab05$hashtrees.hashing;

/**
 * CODE EXAMPLE | SEPARATE CHAINING
 * TODO: See Data Structures - Implementing a Hash Table in zyBooks
 * This is an implementation of a Set using a hash table.
 * The hash table uses "separate chaining" to resolve collisions
 * by storing a list at each index.
 * */

public class IntHashSet {

    private static final double MAX_LOAD_FACTOR = 0.75;
    private Node[] array;
    private int size;


    /**
     * constructs a new empty set
     */
    public IntHashSet(){
        array = new Node[10];
        size = 0;
    }

    /**
     * How do we add an element to the hash table?
     *   - change either the front node or the next field of a node in the list.
     *   - must make sure to avoid duplicates.
     *   - adds an element to the set, if not already there.
     * */
    public void add(int value){

        //avoid duplicates
        if(!contains(value)){
            if (loadFactor() >= MAX_LOAD_FACTOR) {
                rehash();
            }

            //generate index for front of list
            int index   = hash(value);

            // add to front of linked list
            array[index] = new Node(value, array[index]);
            size++;
        }
    }

    /**
     * removes all elements from the set
     */
    public void clear(){
        for (int i = 0; i < array.length; i++) {
            array[i] = null;
        }
        size = 0;
    }

    /**
     * How do we search for an element to the hash table?
     *   - loop through list for index with corresponding value.
     *   - if we find the element, return true.
     * */
    public boolean contains(int value){
        int index = hash(value);

        for(Node node = array[index]; node != null; node = node.next){
            if(node.data == value){
                return true;
            }
        }

        return false;       // NOT FOUND
    }


    /**
     * hash function maps values to index
     * returns the preferred hash bucket index for the given value.
     */
    private int hash(int value){
        return Math.abs(value) % array.length;
    }

    public boolean isEmpty() {
        return size == 0;
    }

    private double loadFactor() {
        return (double) size / array.length;
    }

    /**
     * resizes the hash table to twice its original size.
     * - when the hash table get too full, we need to increase to a larger array
     * - we cannot simply "copy" to old array to a new one
     * - uses a load factor (many collections rehash when load factor about 0.75)
     */
    private void rehash(){
        Node[] oldArray  = array;

        //replace internal array with a larger empty version
        array = new Node[2 * oldArray.length];
        size = 0;

        // re-add the old data into new array
        for (int i = 0; i < oldArray.length; i++) {
            for (Node node = oldArray[i]; node != null; node = node.next){
                add(node.data);
            }
        }
    }

    /**
     * How do we remove an element from the hash table?
     *   - change the front reference or the next reference of the previous node.
     *   -removes the given value, if it is in the set.
     * */
    public void remove(int value){
        // get bucket index
        int index = hash(value);

        //go to front node
        Node front = array[index];

        if (front != null){
            //remove at front of linked list
            if(front.data == value){
                array[index] = array[index].next;
                size--;
            }else{
                //check the rest of the list
                for(Node node = front; node.next != null; node = node.next){
                    if(node.next.data == value){
                        node.next = node.next.next;
                        size--;
                    }
                }
            }// remove using next reference
        }

    }

    //returns the number of elements in the set
    public int size() {
        return size;
    }

    public String toString() {
        StringBuilder result = new StringBuilder("[");
        boolean isAtFront = true;
        if (!isEmpty()) {
            for (int i = 0; i < array.length; i++) {
                for (Node node = array[i]; node != null; node = node.next){
                    if (!isAtFront) {
                        result.append(", ");
                    }
                    result.append(node.data);
                    isAtFront = false;
                }
            }
        }
        return result + "]";
    }

    /**
     * represents a single entry in a chain stored at one index location.
     */
    static class Node{
        int  data;
        Node next;

        Node(int data){
            this(data, null);
        }

        Node(int data, Node next){
            this.data = data;
            this.next = next;
        }
    }

}
