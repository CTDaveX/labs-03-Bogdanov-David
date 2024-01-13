package lab01$arraylists;

import lab02$linkedlists.IntArrayIterator;

/**
 * @author A. Ford
 * CODING EXAMPLE | "Implementing An Integer Array List"
 * This is an example of a class that stores an
 * ArrayList of integers.
 *-------------------------------------------------------------------
 * TODO: Use this example to help you build a Generic ArrayList<E>
 *       in the "utils" package.
 *       NOTE:
 *       -  You are being assessed on your ability to
 *           (1) implement the generic version of this code in the
 *               "utils" package.
 *           (2) think through the construction and figure out a
 *               course of action and complete the code on your own.
 *               However, this DOES NOT mean that you cannot ask
 *               for help.
 *       -  Some of the steps listed in the code below, DO NOT
 *          follow best practices and should be corrected in your
 *          version.
 *       -  Your code will be tested for similarities with other
 *          repositories. Deductions apply.
 *-------------------------------------------------------------------
 * array fields are encapsulated.
 * methods must be in alphabetical order.
 *
 */

public class IntArrayList {
    private int[] array;   //stores internal array of integers.
    private int size;     //stores the number of elements in list.

    public static final int DEFAULT_CAPACITY = 10;

    /**
     * overloaded constructor. constructs list with default capacity.
     */
    public IntArrayList(){
        this(DEFAULT_CAPACITY);
    }

    /**
     * constructs an empty list with the specified capacity.
     * @param capacity of list.
     */
    public IntArrayList(int capacity){
        array = new int[capacity];
        size  = 0;
    }

    /**
     * appends value to the end of the list.
     * @param value to be added.
     */
    public void add(int value){
        //TODO: This must use helper methods in the Generic Class.
        array[size] = value;
        size++;
    }

    /**
     * inserts a given value at the index specified, shifting
     * subsequent values to the right.
     * @param index for insertion
     * @param value to place at index location in list.
     */
    public void add(int index, int value){
        //TODO: This must use helper methods in the Generic Class.
        for (int i = size; i > index; i--) {
            array[i] = array[i - 1];
        }
        array[index] = value;
        size++;
    }

    /**
     * appends another list to current list.
     * @param other list
     */
    public void addAll(IntArrayList other){
        //TODO: ensure the minimum capacity for the new list
        for (int i = 0; i < other.size; i++) {
            add(other.array[i]);
        }
    }

    /**
     * This is an example of a validation check!
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
        //TODO: This requires the use of Garbage Collection in Generic Class.
        size = 0;
    }

    /**
     * returns true if value is in list, false otherwise.
     * @param value to search for in list.
     * @return boolean value
     */
    public boolean contains(int value){
        for (int i = 0; i < size; i++) {
            if(array[i] == value){
                return true;
            }
        }
        return false;      //NOT FOUND
    }

    /**
     * expands the size of the current list to a larger one if capacity has been
     * exceeded.
     * @param minCapacity of list.
     */
    public void ensureCapacity(int minCapacity){
        if(minCapacity > array.length){
            int newCapacity = Math.max(minCapacity, 2 * array.length + 1);
            int[] newArray = new int[newCapacity];

            for (int i = 0; i < size; i++) {
                newArray[i] = array[i];
            }
            array = newArray;
        }
    }

    /**
     * returns the value at the index specified.
     * @param index in list
     * @return value at index specified.
     */
    public int get(int index){
        //TODO: This requires validation in the Generic Class.
        return array[index];
    }


    /**
     * returns the index of the first occurrence of the value specified.
     * If value not found, returns -1.
     * @param value to find.
     * @return index at which value is found or -1.
     */
    public int indexOf(int value){
        for (int i = 0; i < size; i++) {
            if(array[i] == value){
                return i;
            }
        }
        return -1;      //NOT FOUND
    }

    /**
     * returns true if list is empty, false otherwise.
     * @return if list is empty.
     */
    public boolean isEmpty(){
        return size == 0;
    }

    /**
     * constructs an iterator that iterates over current list.
     * @return iterator object to iterate over list.
     */
    public IntArrayIterator iterator(){
        return new IntArrayIterator(this);
    }

    /**
     * removes the value at the index specified,
     * by shifting values left.
     * @param index of value in list.
     */
    public void remove(int index){
        //TODO: This must use helper methods in the Generic Class.
        for (int i = index; i < size - 1; i++) {
            array[i] = array[i + 1];
        }
        size--;
    }

    /**
     * replaces value at index with the given value
     * @param index to update
     * @param value to replace current value.
     */
    public void set(int index, int value){
        //TODO: This requires validation in the Generic Class.
        array[index] = value;
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
        //TODO: Try to Simplify/Make code more efficient in Generic Class
        if(isEmpty()){
            return "[]";
        }else{
            StringBuilder result = new StringBuilder("[" + array[0]);
            for (int i = 1; i < size; i++) {
                result.append(", ").append(array[i]);
            }
            return result.append("]").toString();
        }
    }

}
