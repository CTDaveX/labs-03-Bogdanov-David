package lab02$linkedlists;

/**
 * CODING EXAMPLE
 * This is an example of a class that stores a
 * SinglyLinkedList of integers.
 *
 * TODO: Use this example to build the generic classes
 *       SinglyLinkedList<T> and LinkedList<E>.
 *       Some of the steps for the generic data structure has been
 *       intentionally left out for you to figure out yourself.
 *       Deductions apply.
 * data fields are encapsulated.
 * methods must be in alphabetical order.
 *
 */

public class IntLinkedList {

    private IntNode front;
    private int size;

    public IntLinkedList(){
        front = null;
        size  = 0;
    }

    /**
     * appends value to the end of the list.
     * @param value to be added.
     */
    public void add(int value){
        IntNode newNode = new IntNode(value);

        if(isEmpty()){
            front = newNode;
        }else{
            IntNode endNode = node(size - 1);
            endNode.next = newNode;
        }
        size++;
    }

    /**
     * inserts a given value at the index specified.
     * @param index for insertion
     * @param value to place at index location in list.
     */
    public void add(int index, int value){
        if(index == 0){
            front = new IntNode(value, front);
        }else{
            IntNode nodeBefore = node(index - 1);
            IntNode targetNode = nodeBefore.next;
            nodeBefore.next    = new IntNode(value, targetNode);
        }
        size++;
    }

    /**
     * appends another list to current list.
     * @param other list
     */
    public void addAll(IntLinkedList other){
        for (int i = 0; i < other.size; i++) {
            add(other.get(i));
        }
    }

    /**
     * checks if the current index is valid.
     * @param index of value
     */
    private void checkIndex(int index){
        if(index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Invalid Index: " + index);
        }
    }


    /**
     * clears elements in list.
     */
    public void clear(){
        size = 0;
    }


    /**
     * returns the value at the index specified.
     * @param index in list
     * @return value at index specified.
     */
    public int get(int index){
        return node(index).data;
    }

    /**
     * returns the index of the first occurrence of the value specified.
     * If value not found, returns -1.
     * @param value to find.
     * @return index at which value is found or -1.
     */
    public int indexOf(int value){
        int index = 0;

        for (IntNode node = front; node != null; node = node.next, index++){
            if(node.data == value){
                return index;
            }
        }
        return -1;      //NOT FOUND
    }

    /**
     * returns true if list is empty, false otherwise.
     * @return if list is empty.
     */
    public boolean isEmpty(){
        return front == null && size == 0;
    }

    /**
     * constructs an iterator that iterates over current list.
     * @return iterator object to iterate over list.
     */
    public IntLinkedIterator iterator(){
        return new IntLinkedIterator(this);
    }

    /**
     * returns the location of node at index specified.
     * @param index to retrieve node object.
     * @return memory location(address) of node.
     */
    private IntNode node(int index){
        IntNode current = front;
        for (int i = 0; i < index; i++) {
            current = current.next;
        }
        return current;
    }

    /**
     * removes the value at the given "target" index.
     * @param index of value in list.
     */
    public void remove(int index){
        if(index == 0){
            front = front.next;
        }else{
            IntNode nodeBefore = node(index - 1);
            IntNode targetNode = nodeBefore.next;
            nodeBefore.next    = targetNode.next;
        }
        size--;
    }

    /**
     * returns the current number of elements in the list.
     * @return number of elements in list.
     */
    public int size(){
        return size;
    }

    /**
     * returns a string representation of the list.
     * @return string representation.
     */
    public String toString(){
        if(isEmpty()){
            return "[]";
        }else{
            StringBuilder result = new StringBuilder("[" + front.data);
            for (IntNode node = front.next; node != null; node = node.next){
                result.append(", ").append(node.data);
            }
            return result.append("]").toString();
        }
    }

}
