package lab05$hashtrees.hashing;
/**
 * CODE EXAMPLE | LINEAR PROBING
 * TODO: See Special Topic - Open Addressing in zyBooks
 * This is an implementation of a Set using a hash table.
 * The hash table uses linear probing to resolve collisions
 * by storing a list at each index.
 * */
public class IntLinearHashSet {

    private static final int REMOVED = -999;
    private int[] data;
    private int size;

    /**
     * constructs a new empty set
     */
    public IntLinearHashSet(){
        data = new int[10];
        size = 0;
    }

    /**
     * How do we add an element to the hash table?
     *   - use the hash function to find the proper bucket index.
     *   - if we see a zero (0), put it there.
     *   - if not, move forward until we find an empty (0) index to store it.
     *   - if we see that the value is already in the table , don't re-add it.
     * */
    public void add(int item){

        double factor = (double) size / data.length;

        if(factor >= 0.75){
            rehash();
        }

        // get bucket index
        int index = hash(item);

        //linear probing for empty slot
        while (data[index] != 0 && data[index] != item && data[index] != REMOVED){
            index = (index + 1) % data.length;
        }

        //avoid duplicates
        if(data[index] != item){
            data[index] = index;
            size++;
        }
    }


    /**
     * How do we search for an element to the hash table?
     *   - use the hash function to find the proper bucket index.
     *   - loop forward until we either find the element or an empty index zero (0).
     *   - if we find the element, return true.
     *   - find zero (0), the element is NOT FOUND, return false.
     * */
    public boolean contains(int item){
        // get bucket index
        int index = hash(item);

        //linear probing for empty slot
        while (data[index] != 0 ){
            if(data[index] == item){
                index = (index + 1) % data.length;
            }
        }

        return data[index] == item;       // did we find the item or not?
    }

    /**
     * hash function maps values to indexes
     */
    private int hash(int item){
        return Math.abs(item) % data.length;
    }

    /**
     * grows hash table to twice its original size
     * - when the hash table get too full, we need to increase to a larger array
     * - we cannot simply "copy" to old array to a new one
     * - uses a load factor (many collections rehash when load factor about 0.75)
     */
    private void rehash(){
        int[] oldArray = data;
        data = new int[2 * oldArray.length];
        size = 0;

        for (int i = 0; i < oldArray.length; i++) {
            if(oldArray[i] != 0 && oldArray[i] != REMOVED){
                add(oldArray[i]);
            }
        }
    }

    /**
     * How do we remove an element from the hash table?
     *   - replace element by a "special" removed placeholder value -999.
     * */
    public void remove(int item){
        // get bucket index
        int index = hash(item);

        //linear probing for empty slot
        while (data[index] != 0 && data[index] != item){
            index = (index + 1) % data.length;
        }

        //avoid duplicates
        if(data[index] == item){
            data[index] = -999;     // "isRemoved" flag value
            size--;
        }

    }

}
