package algorithms;

/**
 * FIXME: Complete the following famous algorithms with their method body implementations
 *        It is suggested that you type them out by memory-ish to see if you understand the
 *        algorithm.
 */

public class Iterative {

    //TODO: Complete this search algorithm to find an element location is in array
    //      use while loops here
    public static int binarySearch(int[] data, int target){
        //TODO: update with search algorithm

        return 0;
    }


    //TODO: Complete the following sorting algorithm
    public static void bubbleSort(int[] data) {
        //TODO: Implement the algorithm for this sort.
    }


    //TODO: Complete this search algorithm to check if an element is in array
    public static boolean contains(int[] data, int target) {
        //TODO: update with search algorithm
        return false;
    }


    //TODO: Complete this search algorithm to find an element location is in array
    //      use for loops here
    public static int indexOf(int[] data, int target) {
        //TODO: update with search algorithm
        return 0;
    }


    //TODO: Complete the following insertion sorting algorithm with the swap method
    public static void insertionSort(int[] data) {
        //TODO: Implement the algorithm for this sort.
    }


    // This is an example of "finding the worst case run time function"
    // for a maximum value algorithm
    public static int max(int[] data){
        int n   = data.length;          // (1)      data size
        int max = data[0];              // (1)

        //       (1)
        for(int i = 0; i < n; i++)     // n times
            // (1  + 1)
            if(max < data[i])               // (1)
                max = data[i];              // (1)
        // (1)      terminates loop
        return max;                     // (1)

        // run time function f(n) = 1 + 1 + 1 + n(2 + 1 + 1)
        //                   f(n) = 4n + 5
    }


    //TODO: Complete the following selection sorting algorithm using swap method
    public static void selectionSort(int[] data) {
        //TODO: Implement the algorithm for this sort.
    }


    //TODO: Complete and use the following swap method for
    //      sorting algorithm that require swapping of data
    public static void swap(int[] data, int a, int b) {
        //TODO: Complete Body
    }

}
