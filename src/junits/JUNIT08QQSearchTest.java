package junits;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import static algorithms.Iterative.binarySearch;
import static algorithms.Iterative.contains;
import static algorithms.Iterative.indexOf;
import static algorithms.Iterative.selectionSort;

import java.util.Random;

/**
 * @author A. Ford
 * This is a JUnit Test for the algorithms.Iterative Class
 * This class uses the Jupiter JUnit Test Library
 * current version is Jupiter 5.8.1
 */
public class JUNIT08QQSearchTest {

    static int[] makeList() {
        Random random = new Random();
        int 	bound  = 1000;				//upper bound of values
        int[] 	list   = new int[bound / 2];
        int 	num;

        for(int i = 0; i < list.length; i++) {
            num = random.nextInt(bound);
            if (!(contains(list, num))) {
                list[i] = num;
            }else {
                i--;
            }
        }
        return list;
    }


    /**
     * NOTE: uses selectionSort
     *       The following test requires the "selectionSort"
     *       algorithm to be complete for it to run correctly.
     */
    @Test
    void testBinarySearch() {

        int[] list = makeList();
        selectionSort(list);		//list must be sorted

        System.out.println();
        System.out.println(" \t ====  Binary Search  Algorithm ====\t ");
        System.out.println(" \n\t requires Selection Sort in IModule to work! \t ");
        int  lValue		= list.length / 4;
        int  hValue 	= 3 * list.length / 4;
        int  low  		= list[lValue];
        int  high  		= list[hValue];
        int  location 	= binarySearch(list, low);


        assertEquals(lValue, location);
        assertEquals(low , list[location]);
        System.out.println("======================================");
        System.out.println("low value location : " + lValue);
        System.out.println("bSearch location   : " + location);
        System.out.println("low value          : " + low);
        System.out.println("bSearch value      : " + list[location]);


        location 	= binarySearch(list, high);
        assertEquals(hValue, location);
        assertEquals(high , list[location]);
        System.out.println("======================================");
        System.out.println("high value location: " + hValue);
        System.out.println("bSearch location   : " + location);
        System.out.println("high value         : " + high);
        System.out.println("bSearch value      : " + list[location]);

        System.out.println("======================================");

    }


    @Test
    void testContains() {

        int[] list = makeList();

        System.out.println();
        System.out.println(" \t Contains Algorithm \t ");
        int  lValue		= list.length / 4;
        int  hValue 	= 3 * list.length / 4;
        int  low  		= list[lValue];
        int  high  		= list[hValue];
        boolean result 	= contains(list, low);


        assertTrue(result);
        System.out.println("======================================");
        System.out.println("low value result : " + lValue);
        System.out.println("low value          : " + low);


        result 	= contains(list, high);
        assertTrue(result);
        System.out.println("======================================");
        System.out.println("high value location: " + hValue);
        System.out.println("high value         : " + high);
        System.out.println("======================================");

    }


   @Test
    void testIndexOf() {

        int[] list = makeList();

        System.out.println();
        System.out.println(" \t ====  indexOf  Algorithm ====\t ");
        int  lValue		= list.length / 4;
        int  hValue 	= 3 * list.length / 4;
        int  low  		= list[lValue];
        int  high  		= list[hValue];
        int  location 	= indexOf(list, low);


        assertEquals(lValue, location);
        assertEquals(low , list[location]);
        System.out.println("======================================");
        System.out.println("low value location : " + lValue);
        System.out.println("bSearch location   : " + location);
        System.out.println("low value          : " + low);
        System.out.println("bSearch value      : " + list[location]);


        location 	= indexOf(list, high);
        assertEquals(hValue, location);
        assertEquals(high , list[location]);
        System.out.println("======================================");
        System.out.println("high value location: " + hValue);
        System.out.println("bSearch location   : " + location);
        System.out.println("high value         : " + high);
        System.out.println("bSearch value      : " + list[location]);

        System.out.println("======================================");

    }


    @Test
    void testSelectionSort() {

        int[] list = makeList();

        System.out.println();
        System.out.println(" \t \t S   E   L   E   C   T   I   O   N        S   O   R  T \t");
        System.out.println("================================================================");

        //CONSOLE: first 10 of unsorted list to console
        for (int i = 0; i < 10; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();

        selectionSort(list);

        for (int i = 1; i < list.length; i++) {
            assertTrue(list[i - 1] < list[i]);
        }

        //CONSOLE: print first 15 values to console
        for (int i = 0; i < 15; i++) {
            System.out.print(list[i] + " ");
        }
        System.out.println();
        System.out.println("======================================");
    }

}

