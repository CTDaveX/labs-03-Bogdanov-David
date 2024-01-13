//package junits;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import coordinates.Point;
//import utils.ArrayList;
//import utils.Iterator;
//import utils.List;
//import utils.TreeSet;
//
//import java.util.NoSuchElementException;
//
///**
// * @author A. Ford
// * This is a JUnit Test for the utils.TreeSet Class
// * This class uses the Jupiter JUnit Test Library
// * current version is Jupiter 5.8.1
// */
//public class JUNIT13QQTreeSetTest {
//
//    @Test
//    void testTreeSet(){
//
//        TreeSet<String> set = new TreeSet<>();
//
//        System.out.println("---------------- T  E  S  T   DEFAULT CONSTRUCTOR( ) ----------------");
//        System.out.println("size BEFORE: " + set.size());
//
//        assertEquals(0, set.size());
//        assertTrue(set.add("Un"));
//        assertTrue(set.add("Deux"));
//        assertTrue(set.add("Trois"));
//        assertTrue(set.add("Quatre"));
//        assertTrue(set.add("Cinq"));
//        assertTrue(set.add("Six"));
//        assertTrue(set.add("Sept"));
//        assertTrue(set.add("Huit"));
//        assertTrue(set.add("Neuf"));
//        assertTrue(set.add("Dix"));
//        assertEquals(10, set.size());
//
//        System.out.println(set);
//        System.out.println("size AFTER: " + set.size());
//        System.out.println();
//
//    }
//
//
//    @Test
//    void testAddE() {
//
//        TreeSet<String> set = new TreeSet<>();
//
//        System.out.println("---------------- T  E  S  T   ADD(E item) ----------------");
//        assertEquals(0, set.size());
//        assertTrue(set.add("Un"));
//        assertEquals(1, set.size());
//        assertTrue(set.add("Deux"));
//        assertEquals(2, set.size());
//        assertTrue(set.add("Trois"));
//        assertEquals(3, set.size());
//        assertTrue(set.add("Quatre"));
//        assertEquals(4, set.size());
//        assertTrue(set.add("Cinq"));
//        assertEquals(5, set.size());
//        assertTrue(set.add("Six"));
//        assertEquals(6, set.size());
//        assertTrue(set.add("Sept"));
//        assertEquals(7, set.size());
//        assertTrue(set.add("Huit"));
//        assertEquals(8, set.size());
//        assertTrue(set.add("Neuf"));
//        assertEquals(9, set.size());
//        assertTrue(set.add("Dix"));
//        assertEquals(10, set.size());
//
//        System.out.println(set);
//        System.out.println("size: " + set.size());
//        System.out.println();
//
//        System.out.println("---------------- T  E  S  T   DUPLICATION ----------------");
//        assertFalse(set.add("Un"));
//        assertFalse(set.add("Deux"));
//        assertFalse(set.add("Trois"));
//        assertFalse(set.add("Quatre"));
//        assertEquals(10, set.size());
//
//    }
//
//
//    @Test
//    void testClear() {
//
//        TreeSet<String> set = new TreeSet<>();
//
//        System.out.println("---------------- T  E  S  T   CLEAR( ) ----------------");
//        assertEquals(0, set.size());
//        assertTrue(set.add("Un"));
//        assertTrue(set.add("Deux"));
//        assertTrue(set.add("Trois"));
//        assertTrue(set.add("Quatre"));
//        assertTrue(set.add("Cinq"));
//        assertTrue(set.add("Six"));
//        assertTrue(set.add("Sept"));
//        assertTrue(set.add("Huit"));
//        assertTrue(set.add("Neuf"));
//        assertTrue(set.add("Dix"));
//        assertEquals(10, set.size());
//
//        printIndex(set.size());
//        System.out.println(set);
//        System.out.println();
//
//        System.out.println("has Sept? " + set.contains("Sept"));
//        System.out.println("has Cinq? " + set.contains("Cinq"));
//        System.out.println("has Onze? " + set.contains("Onze"));
//        System.out.println("has Douze? " + set.contains("Douze"));
//
//        assertTrue(set.contains("Sept"));
//        assertTrue(set.contains("Cinq"));
//        assertFalse(set.contains("Onze"));
//        assertFalse(set.contains("Douze"));
//        System.out.println();
//
//    }
//
//
//    @Test
//    void testContains() {
//
//        TreeSet<String> set = new TreeSet<>();
//
//        System.out.println("------------- T  E  S  T  CONTAINS(String item) -------------");
//        assertEquals(0, set.size());
//        assertTrue(set.add("Un"));
//        assertTrue(set.add("Deux"));
//        assertTrue(set.add("Trois"));
//        assertTrue(set.add("Quatre"));
//        assertTrue(set.add("Cinq"));
//        assertTrue(set.add("Six"));
//        assertTrue(set.add("Sept"));
//        assertTrue(set.add("Huit"));
//        assertTrue(set.add("Neuf"));
//        assertTrue(set.add("Dix"));
//        assertEquals(10, set.size());
//
//        printIndex(set.size());
//        System.out.println(set);
//        System.out.println();
//
//        System.out.println("has Sept? " + set.contains("Sept"));
//        System.out.println("has Cinq? " + set.contains("Cinq"));
//        System.out.println("has Onze? " + set.contains("Onze"));
//        System.out.println("has Douze? " + set.contains("Douze"));
//
//        assertTrue(set.contains("Sept"));
//        assertTrue(set.contains("Cinq"));
//        assertFalse(set.contains("Onze"));
//        assertFalse(set.contains("Douze"));
//        System.out.println();
//
//    }
//
//    @Test
//    void testContainsE() {
//
//        System.out.println("---------------- T  E  S  T   CONTAINS(Point item) ----------------");
//
//        List<Point> list = new ArrayList<>();
//        list.add(new Point(6, 5));     //0
//        list.add(new Point(5, 3));     //1
//        list.add(new Point(7, 9));     //2
//        list.add(new Point(9, 4));     //3
//        list.add(new Point(2, 5));     //4
//        list.add(new Point(5, 6));     //5
//        list.add(new Point(1, 8));     //6
//        list.add(new Point(2, 7));     //7
//        list.add(new Point(1, 6));     //8
//        list.add(new Point(9, 6));     //9
//
//        TreeSet<Point> set = new TreeSet<>();
//        set.add(list.get(0));               //0
//        set.add(list.get(1));               //1
//        set.add(list.get(2));               //2
//        set.add(list.get(3));               //3
//        set.add(list.get(4));               //4
//        set.add(list.get(5));               //5
//        set.add(list.get(6));               //6
//        set.add(list.get(7));               //7
//
//        printIndex(set.size());
//        System.out.println(set);
//        System.out.println();
//
//        // SEARCH FOR/FIND ITEMS
//        assertTrue(set.contains(list.get(1)));
//        assertTrue(set.contains(list.get(4)));
//        assertTrue(set.contains(list.get(5)));
//
//        // SEARCH NOT FOUND
//        assertFalse(set.contains(list.get(8)));
//        assertFalse(set.contains(list.get(9)));
//
//        //CHECK FOR DUPLICATES
//        Point point1 = new Point(3, 4);
//        Point point2 = new Point(3, 8);
//
//        if (!set.contains(point1) && !set.contains(point2)) {
//            set.add(point1);
//            set.add(point2);
//        }
//
//        //SEARCH FOR NEWLY ADDED
//        assertTrue(set.contains(point1));
//        assertTrue(set.contains(point2));
//        System.out.println(set);
//        System.out.println();
//
//        // SEARCH FOR NOT FOUND
//        assertFalse(set.contains(list.get(8)));
//        assertFalse(set.contains(list.get(9)));
//
//        // PRINT SEARCH
//        System.out.println("contains (6, 5)? " + set.contains(list.get(0)));
//        System.out.println("contains (9, 4)? " + set.contains(list.get(3)));
//        System.out.println("contains (1, 8)? " + set.contains(list.get(6)));
//        System.out.println("contains (2, 7)? " + set.contains(list.get(7)));
//        System.out.println("contains (1, 6)? " + set.contains(list.get(8)));
//        System.out.println("contains (9, 6)? " + set.contains(list.get(9)));
//        System.out.println();
//    }
//
//    @Test
//    void testTreeSetIterator() {
//
//        List<Point> list = new ArrayList<>();
//
//        System.out.println("------- T  E  S  T  TreeSet Point Iterator() ------");
//
//        list.add(new Point(7, 5));     //0
//        list.add(new Point(9, 4));     //1
//        list.add(new Point(2, 6));     //2
//        list.add(new Point(6, 8));     //3
//        list.add(new Point(2, 5));     //4
//        list.add(new Point(1, 8));     //5
//        list.add(new Point(2, 7));     //6
//        list.add(new Point(1, 6));     //7
//        list.add(new Point(9, 6));     //8
//
//        TreeSet<Point> set = new TreeSet<>();
//        set.add(list.get(0));               //0
//        set.add(list.get(1));               //1
//        set.add(list.get(2));               //2
//        set.add(list.get(3));               //3
//        set.add(list.get(4));               //4
//        set.add(list.get(5));               //5
//        set.add(list.get(6));               //6
//        set.add(list.get(7));               //7
//        set.add(list.get(8));               //8
//
//        Iterator<Point> itr = list.iterator();
//        assertEquals(new Point(7, 5) ,  itr.next());    //0
//        assertEquals(new Point(9, 4) ,  itr.next());    //1
//        assertEquals(new Point(2, 6) ,  itr.next());    //2
//        assertEquals(new Point(6, 8) ,  itr.next());    //3
//        assertEquals(new Point(2, 5) ,  itr.next());    //4
//        assertEquals(new Point(1, 8) ,  itr.next());    //5
//        assertEquals(new Point(2, 7) ,  itr.next());    //6
//        assertEquals(new Point(1, 6) ,  itr.next());    //7
//        assertEquals(new Point(9, 6) ,  itr.next());    //8
//    }
//
//    @Test
//    void testIsEmpty() {
//
//        TreeSet<String> set = new TreeSet<>();
//
//        assertTrue(set.isEmpty());
//        System.out.println();
//        System.out.println(set);
//
//        System.out.println("-------------- T  E  S  T   IS EMPTY() --------------");
//        set.add("Un");          //0
//        set.add("Deux");        //1
//        set.add("Trois");       //2
//        set.add("Quatre");      //3
//        set.add("Cinq");        //4
//        set.add("Six");         //5
//        set.add("Sept");        //6
//        set.add("Huit");        //7
//        set.add("Neuf");        //8
//        set.add("Dix");         //9
//
//        System.out.println();
//        System.out.println(set);
//        System.out.println();
//
//        assertEquals(10, set.size());
//        set.add("Un");          //11
//        set.add("Deux");        //12
//        set.add("Trois");       //13
//        set.add("Quatre");      //14
//        set.add("Cinq");        //15
//        assertEquals(10, set.size());
//
//        assertFalse(set.isEmpty());
//
//        System.out.println();
//        System.out.println(set);
//        System.out.println();
//        System.out.printf("size before clearing: %d \n", set.size());
//
//        System.out.println();
//        System.out.println("------------ C  L  E  A  R  ------------");
//        set.clear();
//        System.out.println();
//
//        assertTrue(set.isEmpty());
//        assertEquals(0, set.size());
//
//        System.out.println(set);
//        System.out.println();
//    }
//
//    @Test
//    void testRemove(){
//        TreeSet<String> set = new TreeSet<>();
//
//        assertEquals(0, set.size());
//
//        System.out.println("---------------- T  E  S  T   REMOVE(String item) ----------------");
//        assertTrue(set.add("Un"));
//        assertTrue(set.add("Deux"));
//        assertTrue(set.add("Trois"));
//        assertTrue(set.add("Quatre"));
//        assertTrue(set.add("Cinq"));
//        assertTrue(set.add("Six"));
//        assertTrue(set.add("Sept"));
//        assertTrue(set.add("Huit"));
//        assertTrue(set.add("Neuf"));
//        assertTrue(set.add("Dix"));
//
//        System.out.println();
//        System.out.println(set);
//        System.out.println("set SIZE: " + set.size());
//
//        assertEquals(10, set.size());
//
//        //------------------------------- REMOVE String Item -------------------------
//        assertTrue(set.remove("Un"));
//        assertEquals(9, set.size());
//        assertTrue(set.remove("Six"));
//        assertEquals(8, set.size());
//        assertTrue(set.remove("Neuf"));
//        assertEquals(7, set.size());
//        assertFalse(set.remove("Six"));
//        assertEquals(7, set.size());
//
//        System.out.println();
//        System.out.println(set);
//        System.out.println("set SIZE: " + set.size());
//
//    }
//
//    @Test
//    void testRemoveE(){
//
//        System.out.println("---------------- T  E  S  T   REMOVE(Point item) ----------------");
//
//        List<Point> list = new ArrayList<>();
//        list.add(new Point(6, 5));     //0
//        list.add(new Point(3, 7));     //1
//        list.add(new Point(7, 9));     //2
//        list.add(new Point(9, 4));     //3
//        list.add(new Point(2, 5));     //4
//        list.add(new Point(5, 6));     //5
//        list.add(new Point(1, 8));     //6
//        list.add(new Point(1, 6));     //7
//        list.add(new Point(9, 6));     //8
//
//        TreeSet<Point> set = new TreeSet<>();
//        set.add(list.get(0));               //0
//        set.add(list.get(1));               //1
//        set.add(list.get(2));               //2
//        set.add(list.get(3));               //3
//        set.add(list.get(4));               //4
//        set.add(list.get(5));               //5
//        set.add(list.get(6));               //6
//
//        //------------------------------- REMOVE Point Item -------------------------
//        assertEquals(7, set.size());
//        assertTrue(set.remove(list.get(1)));
//        assertEquals(6,set.size());
//        assertTrue(set.remove(list.get(2)));
//        assertEquals(5, set.size());
//        assertTrue(set.remove(list.get(3)));
//        assertEquals(4,set.size());
//        assertFalse(set.remove(list.get(3)));
//        assertFalse(set.remove(list.get(2)));
//        assertFalse(set.remove(list.get(1)));
//        assertEquals(4,set.size());
//
//        printIndex(set.size());
//        System.out.println(set);
//        System.out.println("set SIZE: " + set.size());
//        System.out.println();
//        System.out.println();
//
//    }
//
//    @Test
//    void testSetIteratorE() {
//
//        TreeSet<String> set = new TreeSet<>();
//
//        System.out.println("-------------- T  E  S  T   Linked Iterator Loop --------------");
//        set.add("Un");          //0
//        set.add("Deux");        //1
//        set.add("Trois");       //2
//        set.add("Quatre");      //3
//        set.add("Cinq");        //4
//        set.add("Six");         //5
//        set.add("Sept");        //6
//        set.add("Huit");        //7
//        set.add("Neuf");        //8
//        set.add("Dix");         //9
//        System.out.println(set);
//
//        Iterator<String> itr = set.iterator();
//        int i = 0;
//        String currentValue;
//        boolean hasNextValue;
//
//        while(itr.hasNext() && i < set.size()) {
//            hasNextValue = itr.hasNext();
//            currentValue = itr.next();
//
//            System.out.print("hasNext: " + hasNextValue);
//            System.out.println("\t next: " + currentValue);
//
//            assertTrue(hasNextValue);
//            assertTrue(set.contains(currentValue));
//            i++;
//        }
//
//        // At end of the list : No more elements
//        assertFalse(itr.hasNext());
//
//        // No more elements to retrieve will throw Exception
//        assertThrows(NoSuchElementException.class, itr::next);
//        System.out.println();
//        System.out.println();
//
//    }
//
//    @Test
//    void testSize() {
//        TreeSet<String> set = new TreeSet<>();
//
//        System.out.println("---------------- T  E  S  T     S I Z E () ----------------");
//        assertEquals(0, set.size());
//        assertTrue(set.add("Un"));
//        assertEquals(1, set.size());
//        assertTrue(set.add("Deux"));
//        assertEquals(2, set.size());
//        assertTrue(set.add("Trois"));
//        assertEquals(3, set.size());
//        assertTrue(set.add("Quatre"));
//        assertEquals(4, set.size());
//        assertTrue(set.add("Cinq"));
//        assertEquals(5, set.size());
//        assertTrue(set.add("Six"));
//        assertTrue(set.add("Sept"));
//        assertTrue(set.add("Huit"));
//        assertFalse(set.add("Huit"));
//        assertFalse(set.add("Huit"));
//        assertFalse(set.add("Huit"));
//        assertFalse(set.add("Huit"));
//        assertTrue(set.add("Neuf"));
//        assertTrue(set.add("Dix"));
//        assertEquals(10, set.size());
//
//        System.out.println(set);
//        System.out.println("size end: " + set.size());
//
//        System.out.println();
//    }
//
//    @Test
//    void testTreeSetIteratorE() {
//
//        System.out.println("------- T  E  S  T  TreeSet Point Iterator() ------");
//
//        List<Point> list = new ArrayList<>();
//        list.add(new Point(7, 5));     //0
//        list.add(new Point(9, 4));     //1
//        list.add(new Point(2, 6));     //2
//        list.add(new Point(6, 8));     //3
//        list.add(new Point(2, 5));     //4
//        list.add(new Point(1, 8));     //5
//        list.add(new Point(2, 7));     //6
//        list.add(new Point(1, 6));     //7
//        list.add(new Point(9, 6));     //8
//
//        TreeSet<Point> set = new TreeSet<>();
//        set.add(list.get(0));               //0
//        set.add(list.get(1));               //1
//        set.add(list.get(2));               //2
//        set.add(list.get(3));               //3
//        set.add(list.get(4));               //4
//        set.add(list.get(5));               //5
//        set.add(list.get(6));               //6
//        set.add(list.get(7));               //7
//        set.add(list.get(8));               //8
//
//        Iterator<Point> itr = set.iterator();
//        int i   = 0;
//        Point   currentValue;
//        boolean hasNextValue;
//
//        while(itr.hasNext() && i < set.size()) {
//            hasNextValue = itr.hasNext();
//            currentValue = itr.next();
//
//            System.out.print("hasNext: " + hasNextValue);
//            System.out.println("\t next: " + currentValue);
//
//            assertTrue(hasNextValue);
//            assertTrue(set.contains(currentValue));
//            i++;
//        }
//
//        // At end of the list : No more elements
//        assertFalse(itr.hasNext());
//
//        // No more elements to retrieve will throw Exception
//        assertThrows(NoSuchElementException.class, itr::next);
//        System.out.println();
//        System.out.println();
//
//    }
//
//    // NON-TEST : PRINTS INDEX WITH SPACING
//    static void printIndex(int size){
//        System.out.print("     0" );
//        for (int i = 1; i < size; i++)
//            System.out.print("       " + i);
//        System.out.println();
//    }
//
//}
