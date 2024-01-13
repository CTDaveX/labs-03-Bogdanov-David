package lab02$linkedlists;

import lab02$linkedlists.IntLinkedList;
import java.util.NoSuchElementException;

/**
 * This class is an example of an iterator class and its use
 * for singly linked IntLinkedList.
 *
 * Objects of this class can be used to iterate over an
 * IntLinkedList and remove values from the list.
 *
 * data fields are encapsulated.
 * methods must be in alphabetical order.
 *
 */

public class IntLinkedIterator {
    private IntLinkedList list;         // list to iterate over
    private int position;               // current list position
    private boolean isAbleToRemove;     // stores if value can be removed

    /**
     * constructs an iterator object for the given list.
     * @param currentList to iterate over.
     */
    public IntLinkedIterator(IntLinkedList currentList){
        list = currentList;
        position  = 0;
        isAbleToRemove = false;
    }

    /**
     * returns true if there are more elements in the list to
     * iterate over.
     * @return boolean value
     */
    public boolean hasNext(){
        return position < list.size();
    }

    /**
     * returns the value at the current position, then advance to
     * the next position in list.
     * @return current value before moving to next position.
     */
    public int next() {
        if (!hasNext()) {
            throw new NoSuchElementException("No next value!");
        }
        int currentValue = list.get(position);
        position++;
        isAbleToRemove = true;
        return currentValue;
    }

    /**
     * removes the last value returned by the iterator.
     */
    public void remove(){
        if(!isAbleToRemove){
            throw new IllegalStateException("Not Able To Remove.");
        }
        list.remove(position - 1);
        position--;
        isAbleToRemove = false;
    }

}
