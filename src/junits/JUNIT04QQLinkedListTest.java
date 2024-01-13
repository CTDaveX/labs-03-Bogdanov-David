//package junits;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertNotEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import coordinates.Point;
//import utils.LinkedList;
//import utils.List;
//
//import java.util.NoSuchElementException;
//
///**
// * @author A. Ford
// * This is a JUnit Test for the utils.LinkedList Class
// * This class uses the Jupiter JUnit Test Library
// * current version is Jupiter 5.8.1
// */
//public class JUNIT04QQLinkedListTest {
//
//    //NOTE THIS METHOD REQUIRES THE "ADD-APPEND" AND GET METHODS TO BE IMPLEMENTED
//    @Test
//    void testLinkedList() {
//        LinkedList<String> list = new LinkedList<>();
//
//        System.out.println("---------------- T  E  S  T   DEFAULT CONSTRUCTOR( ) ----------------");
//        System.out.println("size BEFORE: " + list.size());
//
//        assertEquals(0, list.size());
//        assertTrue(list.add("Un"));                 //0
//        assertTrue(list.add("Deux"));               //1
//        assertTrue(list.add("Trois"));              //2
//        assertTrue(list.add("Quatre"));             //3
//        assertTrue(list.add("Cinq"));               //4
//        assertTrue(list.add("Six"));                //5
//        assertTrue(list.add("Sept"));               //6
//        assertTrue(list.add("Huit"));               //7
//        assertTrue(list.add("Neuf"));               //8
//        assertTrue(list.add("Dix"));                //9
//        assertEquals(10, list.size());
//
//        System.out.println("---------------- T  E  S  T   EXPANDING CAPACITY ----------------");
//        assertTrue(list.add("Onze"));               //10
//        assertTrue(list.add("Douze"));              //11
//        assertTrue(list.add("Treize"));             //12
//        assertTrue(list.add("Quatorze"));           //13
//        assertTrue(list.add("Quinze"));             //14
//        assertTrue(list.add("Seize"));              //15
//        assertTrue(list.add("Dix Sept"));           //16
//        assertTrue(list.add("Dix Huit"));           //17
//        assertTrue(list.add("Dix Neuf"));           //18
//        assertTrue(list.add("Vingt"));              //19
//        assertEquals(20, list.size());
//
//        assertEquals("Un"       , list.get(0));
//        assertEquals("Deux"     , list.get(1));
//        assertEquals("Trois"    , list.get(2));
//        assertEquals("Quatre"   , list.get(3));
//        assertEquals("Cinq"     , list.get(4));
//        assertEquals("Six"      , list.get(5));
//        assertEquals("Sept"     , list.get(6));
//        assertEquals("Huit"     , list.get(7));
//        assertEquals("Neuf"     , list.get(8));
//        assertEquals("Dix"      , list.get(9));
//        assertEquals("Onze"     , list.get(10));
//        assertEquals("Douze"    , list.get(11));
//        assertEquals("Treize"   , list.get(12));
//        assertEquals("Quatorze" , list.get(13));
//        assertEquals("Quinze"   , list.get(14));
//        assertEquals("Seize"    , list.get(15));
//        assertEquals("Dix Sept" , list.get(16));
//        assertEquals("Dix Huit" , list.get(17));
//        assertEquals("Dix Neuf" , list.get(18));
//        assertEquals("Vingt"    , list.get(19));
//
//        System.out.println(list);
//        System.out.println("size AFTER: " + list.size());
//        System.out.println();
//
//    }
//
//    //THIS METHOD REQUIRES THE IMPLEMENTATION OF THE GET METHOD
//    @Test
//    void testLinkedListListE() {
//        List<Point> list01 = new LinkedList<>();
//
//        list01.add(new Point(6, 5));                //0
//        list01.add(new Point(8, 6));                //1
//        list01.add(new Point(3, 7));                //2
//        list01.add(new Point(7, 9));                //3
//        list01.add(new Point(2, 7));                //4
//        list01.add(new Point(9, 4));                //5
//        list01.add(new Point(5, 8));                //6
//        list01.add(new Point(1, 6));                //7
//        list01.add(new Point(4, 8));                //8
//        list01.add(new Point(9, 6));                //9
//
//        List<Point> list02 = new LinkedList<>(list01);
//        assertEquals(10, list01.size());
//        assertEquals(10, list02.size());
//
//        System.out.println(list01);
//        System.out.println(list02);
//        assertEquals(list01.get(0), list02.get(0));
//        assertEquals(list01.get(1), list02.get(1));
//        assertEquals(list01.get(2), list02.get(2));
//        assertEquals(list01.get(3), list02.get(3));
//        assertEquals(list01.get(4), list02.get(4));
//        assertEquals(list01.get(5), list02.get(5));
//        assertEquals(list01.get(6), list02.get(6));
//        assertEquals(list01.get(7), list02.get(7));
//        assertEquals(list01.get(8), list02.get(8));
//        assertEquals(list01.get(9), list02.get(9));
//
//        System.out.println();
//        System.out.println("---------------- T  E  S  T   OTHER STRING LIST ----------------");
//        System.out.println();
//
//        LinkedList<String> list03 = new LinkedList<>();
//
//        assertEquals(0, list03.size());
//        assertTrue(list03.add("Un"));                 //0
//        assertTrue(list03.add("Deux"));               //1
//        assertTrue(list03.add("Trois"));              //2
//        assertTrue(list03.add("Quatre"));             //3
//        assertTrue(list03.add("Cinq"));               //4
//        assertTrue(list03.add("Six"));                //5
//        assertTrue(list03.add("Sept"));               //6
//        assertTrue(list03.add("Huit"));               //7
//        assertTrue(list03.add("Neuf"));               //8
//        assertTrue(list03.add("Dix"));                //9
//
//        LinkedList<String> list04 = new LinkedList<>(list03);
//        assertEquals(10, list03.size());
//        assertEquals(10, list04.size());
//
//        assertEquals(list03.get(0) , list04.get(0));
//        assertEquals(list03.get(1) , list04.get(1));
//        assertEquals(list03.get(2) , list04.get(2));
//        assertEquals(list03.get(3) , list04.get(3));
//        assertEquals(list03.get(4) , list04.get(4));
//        assertEquals(list03.get(5) , list04.get(5));
//        assertEquals(list03.get(6) , list04.get(6));
//        assertEquals(list03.get(7) , list04.get(7));
//        assertEquals(list03.get(8) , list04.get(8));
//        assertEquals(list03.get(9) , list04.get(9));
//
//        System.out.println(list03);
//        System.out.println(list04);
//        System.out.println();
//        System.out.println();
//
//    }
//
//    //THIS REQUIRES THE USE OF THE GET METHOD
//    @Test
//    void testAddE() {
//        LinkedList<String> list = new LinkedList<>();
//
//        assertEquals(0, list.size());
//
//        System.out.println("---------------- T  E  S  T   ADD(E item) APPEND ----------------");
//        assertTrue(list.add("Un"));                 //0
//        assertEquals(1, list.size());
//        assertTrue(list.add("Deux"));               //1
//        assertEquals(2, list.size());
//        assertTrue(list.add("Trois"));              //2
//        assertEquals(3, list.size());
//        assertTrue(list.add("Quatre"));             //3
//        assertEquals(4, list.size());
//        assertTrue(list.add("Cinq"));               //4
//        assertEquals(5, list.size());
//        assertTrue(list.add("Six"));                //5
//        assertEquals(6, list.size());
//        assertTrue(list.add("Sept"));               //6
//        assertTrue(list.add("Huit"));               //7
//        assertTrue(list.add("Neuf"));               //8
//        assertTrue(list.add("Dix"));                //9
//        assertEquals(10, list.size());
//
//        System.out.println(list);
//        System.out.println("size: " + list.size());
//        System.out.println();
//        System.out.println();
//
//        System.out.println("==  T  E  S  T     E  X  P  A  N  D     C  A  P  A  C  I  T  Y ==");
//        System.out.println("\t Should expand beyond this point or will CRASH");
//
//        assertTrue(list.add("Onze"));               //10
//        assertTrue(list.add("Douze"));              //11
//        assertTrue(list.add("Treize"));             //12
//        assertTrue(list.add("Quatorze"));           //13
//        assertTrue(list.add("Quinze"));             //14
//        assertTrue(list.add("Seize"));              //15
//        assertEquals(16, list.size());
//
//        assertEquals("Un"       , list.get(0));
//        assertEquals("Deux"     , list.get(1));
//        assertEquals("Trois"    , list.get(2));
//        assertEquals("Quatre"   , list.get(3));
//        assertEquals("Cinq"     , list.get(4));
//        assertEquals("Six"      , list.get(5));
//        assertEquals("Sept"     , list.get(6));
//        assertEquals("Huit"     , list.get(7));
//        assertEquals("Neuf"     , list.get(8));
//        assertEquals("Dix"      , list.get(9));
//        assertEquals("Onze"     , list.get(10));
//        assertEquals("Douze"    , list.get(11));
//        assertEquals("Treize"   , list.get(12));
//        assertEquals("Quatorze" , list.get(13));
//        assertEquals("Quinze"   , list.get(14));
//        assertEquals("Seize"    , list.get(15));
//
//        System.out.println(list);
//        System.out.println("size AFTER: " + list.size());
//        System.out.println();
//
//    }
//
//    @Test
//    void testAddIntE() {
//        LinkedList<String> list = new LinkedList<>();
//
//        assertEquals(0, list.size());
//
//        System.out.println("----------- T  E  S  T   ADD(int index, E item) INSERT -----------");
//        list.add(0,"Un");                               //0
//        assertEquals(1, list.size());
//
//        System.out.println();
//        System.out.println(list);
//        System.out.println();
//
//        System.out.println("--------------- ADD IN FRONT ---------------");
//        list.add(0, "Deux");                            //1
//        list.add(0, "Trois");                           //2
//        list.add(0, "Quatre");                          //3
//        assertEquals(4, list.size());
//
//        // TEST - RESULTS
//        assertEquals("Quatre" , list.get(0));
//        assertEquals("Trois" , list.get(1));
//        assertEquals("Deux" , list.get(2));
//
//        System.out.println();
//        System.out.println(list);
//        System.out.println();
//
//        System.out.println("--------------- ADD AT BACK ---------------");
//        list.add(list.size(), "Cinq");                    //4
//        list.add(list.size(), "Six");                     //5
//        list.add(list.size(), "Sept");                    //6
//        list.add(list.size(), "Huit");                    //7
//        assertEquals(8, list.size());
//
//        System.out.println();
//        System.out.println(list);
//        System.out.println();
//
//        System.out.println("--------------- ADD IN MIDDLE ---------------");
//        int mid = list.size() / 2;
//        list.add(mid, "Onze");
//        assertEquals("Onze"  , list.get(mid));
//        list.add(mid, "Douze");
//        assertEquals("Douze"  , list.get(mid));
//        list.add(mid, "Treize");
//        assertEquals("Treize"  , list.get(mid));
//
//        System.out.println();
//        System.out.println(list);
//        System.out.println();
//
//        System.out.println("--------------- ADD AT END ---------------");
//        list.add(list.size(), "Quinze");
//        assertEquals("Quinze", list.get(list.size() - 1));
//        list.add(list.size(), "Seize");
//        assertEquals("Seize", list.get(list.size() - 1));
//
//        System.out.println();
//        System.out.println(list);
//        System.out.println("size: " + list.size());
//
//        int sizeA = -list.size() + 1;
//        int sizeB = list.size() + 1;
//
//        //TEST INDEX OUT OF BOUNDS
//        assertThrows(IndexOutOfBoundsException.class, () -> list.add(sizeA, "Trois"));
//        assertThrows(IndexOutOfBoundsException.class, () -> list.add(sizeB, "Trois"));
//        assertThrows(IndexOutOfBoundsException.class, () -> list.add(-1, "Trois"));
//        System.out.println();
//
//    }
//
//    //THIS METHOD REQUIRES THE IMPLEMENTATION OF THE GET METHOD
//    @Test
//    void testAddAllListE(){
//        List<Point> list01 = new LinkedList<>();
//
//        list01.add(new Point(6, 5));                //0
//        list01.add(new Point(8, 6));                //1
//        list01.add(new Point(3, 7));                //2
//        list01.add(new Point(7, 9));                //3
//        list01.add(new Point(2, 7));                //4
//
//        List<Point> list02 = new LinkedList<>();
//
//        list02.add(new Point(9, 4));                //0
//        list02.add(new Point(5, 8));                //1
//        list02.add(new Point(1, 6));                //2
//        list02.add(new Point(4, 8));                //3
//        list02.add(new Point(9, 6));                //4
//
//        assertTrue(list02.addAll(list01));
//        assertEquals(5, list01.size());
//        assertEquals(10, list02.size());
//
//        System.out.println(list02);
//        assertEquals(new Point(9, 4), list02.get(0));
//        assertEquals(new Point(5, 8), list02.get(1));
//        assertEquals(new Point(1, 6), list02.get(2));
//        assertEquals(new Point(4, 8), list02.get(3));
//        assertEquals(new Point(9, 6), list02.get(4));
//
//        assertEquals(list01.get(0), list02.get(5));
//        assertEquals(list01.get(1), list02.get(6));
//        assertEquals(list01.get(2), list02.get(7));
//        assertEquals(list01.get(3), list02.get(8));
//        assertEquals(list01.get(4), list02.get(9));
//
//        System.out.println();
//        System.out.println("---------------- T  E  S  T   Add ALL Strings ----------------");
//        System.out.println();
//
//        LinkedList<String> list03 = new LinkedList<>();
//
//        assertEquals(0, list03.size());
//        assertTrue(list03.add("Un"));                 //0
//        assertTrue(list03.add("Deux"));               //1
//        assertTrue(list03.add("Trois"));              //2
//        assertTrue(list03.add("Quatre"));             //3
//        assertTrue(list03.add("Cinq"));               //4
//        assertTrue(list03.add("Six"));                //5
//        assertTrue(list03.add("Sept"));               //6
//        assertTrue(list03.add("Huit"));               //7
//        assertTrue(list03.add("Neuf"));               //8
//        assertTrue(list03.add("Dix"));                //9
//        assertEquals(10, list03.size());
//
//        LinkedList<String> list04 = new LinkedList<>();
//
//        assertTrue(list04.add("Onze"));               //0
//        assertTrue(list04.add("Douze"));              //1
//        assertTrue(list04.add("Treize"));             //2
//        assertTrue(list04.add("Quatorze"));           //3
//        assertTrue(list04.add("Quinze"));             //4
//        assertEquals(5, list04.size());
//
//        // TEST APPEND TO BACK THROUGH ADD ALL
//        assertTrue(list04.addAll(list03));
//        assertEquals(15, list04.size());
//
//        assertEquals("Onze"        , list04.get(0));
//        assertEquals("Douze"       , list04.get(1));
//        assertEquals("Treize"      , list04.get(2));
//        assertEquals("Quatorze"    , list04.get(3));
//        assertEquals("Quinze"      , list04.get(4));
//
//        assertEquals(list03.get(0) , list04.get(5));
//        assertEquals(list03.get(1) , list04.get(6));
//        assertEquals(list03.get(2) , list04.get(7));
//        assertEquals(list03.get(3) , list04.get(8));
//        assertEquals(list03.get(4) , list04.get(9));
//        assertEquals(list03.get(5) , list04.get(10));
//        assertEquals(list03.get(6) , list04.get(11));
//        assertEquals(list03.get(7) , list04.get(12));
//        assertEquals(list03.get(8) , list04.get(13));
//        assertEquals(list03.get(9) , list04.get(14));
//
//        System.out.println(list03);
//        System.out.println();
//        System.out.println();
//
//    }
//
//    //NOTE THIS METHOD REQUIRES THE "GET" METHOD TO BE IMPLEMENTED
//    @Test
//    void testClear() {
//        LinkedList<String> list = new LinkedList<>();
//
//        assertEquals(0, list.size());
//
//        System.out.println("---------------- T  E  S  T   CLEAR( ) ----------------");
//        assertTrue(list.add("Un"));
//        assertTrue(list.add("Deux"));
//        assertTrue(list.add("Trois"));
//        assertTrue(list.add("Quatre"));
//        assertTrue(list.add("Cinq"));
//        assertTrue(list.add("Six"));
//        assertTrue(list.add("Sept"));
//
//        System.out.println(list);
//        System.out.println("size BEFORE: " + list.size());
//
//        assertEquals(7, list.size());
//        list.clear();
//        assertEquals(0, list.size());
//
//        System.out.println("size AFTER: " + list.size());
//        System.out.println();
//
//        //TEST IF EMPTY
//        assertThrows(IndexOutOfBoundsException.class, () -> list.get(0));
//        assertThrows(IndexOutOfBoundsException.class, () -> list.get(list.size()));
//        System.out.println();
//
//    }
//
//    @Test
//    void testContains() {
//        LinkedList<String> list = new LinkedList<>();
//
//        System.out.println("------------- T  E  S  T  CONTAINS(String item) -------------");
//
//        assertEquals(0, list.size());
//        assertTrue(list.add("Un"));                 //0
//        assertTrue(list.add("Deux"));               //1
//        assertTrue(list.add("Trois"));              //2
//        assertTrue(list.add("Quatre"));             //3
//        assertTrue(list.add("Cinq"));               //4
//        assertTrue(list.add("Six"));                //5
//        assertTrue(list.add("Sept"));               //6
//        assertTrue(list.add("Huit"));               //7
//        assertTrue(list.add("Neuf"));               //8
//        assertTrue(list.add("Dix"));                //9
//        assertEquals(10, list.size());
//
//        printIndex(list.size());
//        System.out.println(list);
//        System.out.println();
//
//        System.out.println("has Un? "   + list.contains("Un"));
//        System.out.println("has Cinq? " + list.contains("Cinq"));
//        System.out.println("has Onze? " + list.contains("Onze"));
//        System.out.println("has Douze?" + list.contains("Douze"));
//
//        assertTrue(list.contains("Un"));
//        assertTrue(list.contains("Cinq"));
//        assertTrue(list.contains("Dix"));
//        assertFalse(list.contains("Onze"));
//        assertFalse(list.contains("Douze"));
//        System.out.println();
//
//        System.out.println("---------------- T  E  S  T   CONTAINS(Point item) ----------------");
//
//        LinkedList<Point> points = new LinkedList<>();
//        points.add(new Point(6, 5));                //0
//        points.add(new Point(3, 7));                //1
//        points.add(new Point(7, 9));                //2
//        points.add(new Point(9, 4));                //3
//        points.add(new Point(2, 5));                //4
//        points.add(new Point(5, 6));                //5
//        points.add(new Point(1, 8));                //6
//
//        printIndex(list.size());
//        System.out.println(points);
//        System.out.println();
//
//        //SEARCH AND FIND
//        assertTrue(points.contains(new Point(6, 5)));
//        assertTrue(points.contains(new Point(9, 4)));
//        assertTrue(points.contains(new Point(1, 8)));
//        assertFalse(points.contains(new Point(1, 2)));
//
//        // PRINT SEARCH
//        System.out.println("contains (6, 5)? " + points.contains(new Point(6, 5)));
//        System.out.println("contains (9, 4)? " + points.contains(new Point(9, 4)));
//        System.out.println("contains (1, 8)? " + points.contains(new Point(1, 8)));
//        System.out.println("contains (1, 2)? " + points.contains(new Point(1, 2)));
//        System.out.println("contains (9, 3)? " + points.contains(new Point(9, 3)));
//        System.out.println();
//
//    }
//
//    @Test
//    void testExpandCapacity() {
//        LinkedList<String> list = new LinkedList<>();
//
//        System.out.println("---------------- T  E  S  T   Capacity( ) ----------------");
//        System.out.println("size BEFORE: " + list.size());
//
//        assertEquals(0, list.size());
//        assertTrue(list.add("Un"));                 //0
//        assertTrue(list.add("Deux"));               //1
//        assertTrue(list.add("Trois"));              //2
//        assertTrue(list.add("Quatre"));             //3
//        assertTrue(list.add("Cinq"));               //4
//        assertEquals(5, list.size());
//
//        assertTrue(list.add("Six"));                //5
//        assertTrue(list.add("Sept"));               //6
//        assertTrue(list.add("Huit"));               //7
//        assertTrue(list.add("Neuf"));               //8
//        assertTrue(list.add("Dix"));                //9
//        assertEquals(10, list.size());
//
//        System.out.println("----------------  T  E  S  T   EXPANDING CAPACITY ----------------");
//        System.out.println("\t REACHED List LIMIT ....AT Capacity");
//        System.out.println("\t Should expand beyond this point or will CRASH");
//
//
//        assertTrue(list.add("Onze"));               //10
//        assertTrue(list.add("Douze"));              //11
//        assertTrue(list.add("Treize"));             //12
//        assertTrue(list.add("Quatorze"));           //13
//        assertTrue(list.add("Quinze"));             //14
//        assertEquals(15, list.size());
//
//        assertTrue(list.add("Seize"));              //15
//        assertTrue(list.add("Dix Sept"));           //16
//        assertTrue(list.add("Dix Huit"));           //17
//        assertTrue(list.add("Dix Neuf"));           //18
//        assertTrue(list.add("Vingt"));              //19
//        assertEquals(20, list.size());
//
//        System.out.println(list);
//        System.out.println("size AFTER: " + list.size());
//        System.out.println();
//
//        // EXPANSION TEST
//        int size        = list.size();
//        int testSize    = 90;
//
//        for (int count = 1; count <= testSize; count++) {
//            assertTrue(list.add("Vingt"));
//        }
//
//        size = size + testSize;
//        assertEquals(size, list.size());
//        System.out.println("----------------------------------------------------");
//        System.out.printf("TEST 1: size: %d, list-size: %d \n", size, list.size());
//
//        for (int count = 1; count <= testSize; count++) {
//            assertTrue(list.remove("Vingt"));
//        }
//
//        size = size - testSize;
//        assertEquals(size, list.size());
//        System.out.printf("TEST 2: size: %d, list-size: %d \n", size, list.size());
//
//        //TEST: MIN CAPACITY
//        for (int count = 1; count <= 10000; count++) {
//            assertTrue(list.add("Neuf"));
//        }
//
//        size = size + 10000;
//        assertEquals(size, list.size());
//        System.out.printf("TEST 3: size: %d, list-size: %d \n", size, list.size());
//        System.out.println("----------------------------------------------------");
//        System.out.println();
//    }
//
//    @Test
//    void testEqualsListE() {
//        List<Point> firstList = new LinkedList<>();
//
//        firstList.add(new Point(6, 9));                //0
//        firstList.add(new Point(8, 3));                //1
//        firstList.add(new Point(3, 7));                //2
//        firstList.add(new Point(7, 5));                //3
//        firstList.add(new Point(2, 7));                //4
//        firstList.add(new Point(9, 4));                //5
//        firstList.add(new Point(5, 8));                //6
//        firstList.add(new Point(1, 6));                //7
//        firstList.add(new Point(4, 8));                //8
//        firstList.add(new Point(9, 6));                //9
//        assertEquals(10, firstList.size());
//
//        List<Point> secondList = new LinkedList<>();
//        secondList.add(new Point(6, 9));                //0
//        secondList.add(new Point(8, 3));                //1
//        secondList.add(new Point(3, 7));                //2
//        secondList.add(new Point(7, 5));                //3
//        secondList.add(new Point(2, 7));                //4
//        secondList.add(new Point(9, 4));                //5
//        secondList.add(new Point(5, 8));                //6
//        secondList.add(new Point(1, 6));                //7
//        secondList.add(new Point(4, 8));                //8
//        secondList.add(new Point(9, 6));                //9
//        assertEquals(10, secondList.size());
//
//        List<Point> thirdList = new LinkedList<>();
//        thirdList.add(new Point(6, 5));                //0
//        thirdList.add(new Point(8, 3));                //1
//        thirdList.add(new Point(2, 7));                //2
//        thirdList.add(new Point(9, 4));                //3
//        thirdList.add(new Point(5, 8));                //4
//        thirdList.add(new Point(1, 6));                //5
//        thirdList.add(new Point(9, 6));                //6
//        assertEquals(7, thirdList.size());
//
//        List<Point> fourthList = new LinkedList<>();
//        fourthList.add(new Point(6, 5));                //0
//        fourthList.add(new Point(8, 3));                //1
//        fourthList.add(new Point(3, 3));                //2
//        fourthList.add(new Point(2, 7));                //3
//        fourthList.add(new Point(5, 8));                //4
//        fourthList.add(new Point(1, 6));                //5
//        fourthList.add(new Point(9, 6));                //6
//        assertEquals(7, fourthList.size());
//
//        assertEquals(firstList        , secondList);
//        assertNotEquals(firstList   , thirdList);
//        assertNotEquals(firstList   , fourthList);
//        assertNotEquals(secondList  , thirdList);
//        assertNotEquals(secondList  , fourthList);
//        assertNotEquals(thirdList   , fourthList);
//
//        printIndex(firstList.size());
//        System.out.println(firstList);
//        System.out.println(secondList);
//        System.out.println();
//        printIndex(thirdList.size());
//        System.out.println(thirdList);
//        System.out.println(fourthList);
//        System.out.println();
//
//        assertEquals(firstList.get(0), secondList.get(0));
//        assertEquals(firstList.get(1), secondList.get(1));
//        assertEquals(firstList.get(2), secondList.get(2));
//        assertEquals(firstList.get(3), secondList.get(3));
//        assertEquals(firstList.get(4), secondList.get(4));
//        assertEquals(firstList.get(5), secondList.get(5));
//        assertEquals(firstList.get(6), secondList.get(6));
//        assertEquals(firstList.get(7), secondList.get(7));
//        assertEquals(firstList.get(8), secondList.get(8));
//        assertEquals(firstList.get(9), secondList.get(9));
//
//        System.out.println();
//        System.out.println("---------------- T  E  S  T   EQUALS OTHER STRING LIST ----------------");
//        System.out.println();
//
//        LinkedList<String> list01 = new LinkedList<>();
//
//        assertEquals(0, list01.size());
//        assertTrue(list01.add("Un"));                 //0
//        assertTrue(list01.add("Deux"));               //1
//        assertTrue(list01.add("Trois"));              //2
//        assertTrue(list01.add("Quatre"));             //3
//        assertTrue(list01.add("Cinq"));               //4
//        assertTrue(list01.add("Six"));                //5
//        assertTrue(list01.add("Sept"));               //6
//        assertTrue(list01.add("Huit"));               //7
//        assertTrue(list01.add("Neuf"));               //8
//        assertTrue(list01.add("Dix"));                //9
//
//        LinkedList<String> list02 = new LinkedList<>();
//        assertTrue(list02.add("Un"));                 //0
//        assertTrue(list02.add("Deux"));               //1
//        assertTrue(list02.add("Trois"));              //2
//        assertTrue(list02.add("Quatre"));             //3
//        assertTrue(list02.add("Cinq"));               //4
//        assertTrue(list02.add("Six"));                //5
//        assertTrue(list02.add("Sept"));               //6
//        assertTrue(list02.add("Huit"));               //7
//        assertTrue(list02.add("Neuf"));               //8
//        assertTrue(list02.add("Dix"));                //9
//
//        LinkedList<String> list03 = new LinkedList<>();
//        assertTrue(list03.add("Onze"));               //10
//        assertTrue(list03.add("Douze"));              //11
//        assertTrue(list03.add("Treize"));             //12
//        assertTrue(list03.add("Quatorze"));           //13
//        assertTrue(list03.add("Quinze"));             //14
//        assertTrue(list03.add("Seize"));              //15
//        assertTrue(list03.add("Dix Sept"));           //16
//        assertTrue(list03.add("Dix Huit"));           //17
//        assertTrue(list03.add("Dix Neuf"));           //18
//        assertTrue(list03.add("Vingt"));              //19
//
//        assertEquals(10, list01.size());
//        assertEquals(10, list02.size());
//        assertEquals(10, list03.size());
//
//        assertEquals(list01, list02);
//        assertNotEquals(list01, list03);
//        assertNotEquals(list02, list03);
//
//        assertEquals(list01.get(0) , list02.get(0));
//        assertEquals(list01.get(1) , list02.get(1));
//        assertEquals(list01.get(2) , list02.get(2));
//        assertEquals(list01.get(3) , list02.get(3));
//        assertEquals(list01.get(4) , list02.get(4));
//        assertEquals(list01.get(5) , list02.get(5));
//        assertEquals(list01.get(6) , list02.get(6));
//        assertEquals(list01.get(7) , list02.get(7));
//        assertEquals(list01.get(8) , list02.get(8));
//        assertEquals(list01.get(9) , list02.get(9));
//
//        System.out.println(list01);
//        System.out.println(list02);
//        System.out.println();
//        printIndex(list03.size());
//        System.out.println(list03);
//        System.out.println();
//        System.out.println();
//    }
//
//    //THIS REQUIRES THE ADD FIRST, GET FIRST AND REMOVE FIRST METHODS
//    @Test
//    void testFirst(){
//        LinkedList<String> list = new LinkedList<>();
//
//        assertEquals(0, list.size());
//
//        assertTrue(list.add("Un"));                 //0
//        assertTrue(list.add("Deux"));               //1
//        assertTrue(list.add("Trois"));              //2
//        assertTrue(list.add("Quatre"));             //3
//        assertTrue(list.add("Cinq"));               //4
//        assertEquals(5, list.size());
//
//        System.out.println("---------------  T E S T  FIRST  ---------------");
//        list.addFirst("Six");
//        assertEquals("Six"     , list.getFirst());
//        list.addFirst("Sept");
//        assertEquals("Sept"     , list.getFirst());
//        list.addFirst("Huit");
//        assertEquals("Huit"     , list.getFirst());
//        list.addFirst("Neuf");
//        assertEquals("Neuf"     , list.getFirst());
//        assertEquals(9, list.size());
//
//        assertEquals("Neuf"     , list.get(0));
//        assertEquals("Huit"     , list.get(1));
//        assertEquals("Sept"     , list.get(2));
//        assertEquals("Six"      , list.get(3));
//        assertEquals("Un"       , list.get(4));
//        assertEquals("Deux"     , list.get(5));
//        assertEquals("Trois"    , list.get(6));
//        assertEquals("Quatre"   , list.get(7));
//        assertEquals("Cinq"     , list.get(8));
//
//        System.out.println();
//        System.out.println(list);
//
//        assertEquals("Neuf"   , list.removeFirst());
//        assertEquals("Huit"   , list.removeFirst());
//        assertEquals("Sept"   , list.removeFirst());
//        assertEquals("Six"    , list.removeFirst());
//        assertEquals("Un"     , list.removeFirst());
//        assertEquals(4, list.size());
//
//        System.out.println();
//        System.out.println(list);
//        System.out.println();
//
//        //TEST EXCEPTIONS
//        list.clear();
//
//        //Test USING FUNCTIONAL INTERFACE == METHOD REFERENCE
//        assertThrows(NoSuchElementException.class, list::removeFirst);
//        assertThrows(NoSuchElementException.class, list::getFirst);
//        System.out.println();
//
//    }
//
//    //THIS REQUIRES THE ADD FIRST, GET FIRST AND REMOVE FIRST METHODS
//    @Test
//    void testFirstE(){
//        LinkedList<Point> list = new LinkedList<>();
//
//        list.add(new Point(8, 3));                //0
//        list.add(new Point(6, 9));                //1
//        list.add(new Point(2, 7));                //2
//        list.add(new Point(1, 6));                //3
//        list.add(new Point(9, 6));                //4
//        assertEquals(5, list.size());
//
//        list.addFirst(new Point(3, 7));
//        assertEquals(new Point(3, 7), list.getFirst());
//        list.addFirst(new Point(7, 5));
//        assertEquals(new Point(7, 5), list.getFirst());
//        list.addFirst(new Point(9, 4));
//        assertEquals(new Point(9, 4), list.getFirst());
//        list.addFirst(new Point(5, 8));
//        assertEquals(new Point(5, 8), list.getFirst());
//        assertEquals(9, list.size());
//
//        System.out.println();
//        System.out.println(list);
//
//        assertEquals(new Point(5, 8), list.removeFirst());
//        assertEquals(new Point(9, 4), list.removeFirst());
//        assertEquals(new Point(7, 5), list.removeFirst());
//        assertEquals(new Point(3, 7), list.removeFirst());
//
//        System.out.println();
//        System.out.println(list);
//        System.out.println();
//
//        //TEST EXCEPTIONS
//        list.clear();
//
//        //Test USING FUNCTIONAL INTERFACE == METHOD REFERENCE
//        assertThrows(NoSuchElementException.class, list::removeFirst);
//        assertThrows(NoSuchElementException.class, list::getFirst);
//        System.out.println();
//
//    }
//
//    @Test
//    void testGet() {
//        LinkedList<String> list = new LinkedList<>();
//
//        System.out.println("---------------- T  E  S  T    GET( ) ----------------");
//        assertEquals(0, list.size());
//        assertTrue(list.add("Un"));                 //0
//        assertTrue(list.add("Deux"));               //1
//        assertTrue(list.add("Trois"));              //2
//        assertTrue(list.add("Quatre"));             //3
//        assertTrue(list.add("Cinq"));               //4
//        assertTrue(list.add("Six"));                //5
//        assertTrue(list.add("Sept"));               //6
//        assertTrue(list.add("Huit"));               //7
//        assertTrue(list.add("Neuf"));               //8
//        assertTrue(list.add("Dix"));                //9
//        assertEquals(10, list.size());
//
//        assertEquals("Un"       , list.get(0));
//        assertEquals("Deux"     , list.get(1));
//        assertEquals("Trois"    , list.get(2));
//        assertEquals("Quatre"   , list.get(3));
//        assertEquals("Cinq"     , list.get(4));
//        assertEquals("Six"      , list.get(5));
//        assertEquals("Sept"     , list.get(6));
//        assertEquals("Huit"     , list.get(7));
//        assertEquals("Neuf"     , list.get(8));
//        assertEquals("Dix"      , list.get(9));
//
//        System.out.println(list);
//        System.out.println("who is at 0? " + list.get(0));
//        System.out.println("who is at 4? " + list.get(4));
//        System.out.println("who is at 9? " + list.get(9));
//
//        //Test if accessing index out of bounds.
//        assertThrows(IndexOutOfBoundsException.class, () -> list.get(list.size()));
//        assertThrows(IndexOutOfBoundsException.class, () -> list.get(-list.size() + 1));
//        assertThrows(IndexOutOfBoundsException.class, () -> list.get(list.size() + 2));
//        System.out.println();
//
//    }
//
//    @Test
//    void testIndexOf() {
//        LinkedList<String>  list = new LinkedList<>();
//
//        System.out.println("---------------- T  E  S  T   INDEX OF(String item) ----------------");
//        assertEquals(0, list.size());
//        assertTrue(list.add("Un"));                 //0
//        assertTrue(list.add("Deux"));               //1
//        assertTrue(list.add("Trois"));              //2
//        assertTrue(list.add("Quatre"));             //3
//        assertTrue(list.add("Cinq"));               //4
//        assertTrue(list.add("Six"));                //5
//        assertTrue(list.add("Sept"));               //6
//        assertTrue(list.add("Huit"));               //7
//        assertTrue(list.add("Neuf"));               //8
//        assertTrue(list.add("Dix"));                //9
//        assertEquals(10, list.size());
//
//        assertEquals("Un"       , list.get(0));
//        assertEquals("Deux"     , list.get(1));
//        assertEquals("Trois"    , list.get(2));
//        assertEquals("Quatre"   , list.get(3));
//        assertEquals("Cinq"     , list.get(4));
//        assertEquals("Six"      , list.get(5));
//        assertEquals("Sept"     , list.get(6));
//        assertEquals("Huit"     , list.get(7));
//        assertEquals("Neuf"     , list.get(8));
//        assertEquals("Dix"      , list.get(9));
//
//        assertEquals(-1, list.indexOf("Onze"));
//        assertEquals(-1, list.indexOf("Douze"));
//
//        printIndex(list.size());
//        System.out.println(list);
//        System.out.println();
//
//        System.out.println("location of Un: " + list.indexOf("Un"));
//        System.out.println("location of Cinq: " + list.indexOf("Quatre"));
//        System.out.println("location of Dix: " + list.indexOf("Sept"));
//        System.out.println();
//
//        System.out.println(list);
//        System.out.println();
//
//        System.out.println("---------------- T  E  S  T   INDEX OF(Point item) ----------------");
//
//        LinkedList<Point> points = new LinkedList<>();
//
//        points.add(new Point(6, 5));                    //0
//        points.add(new Point(3, 7));                    //1
//        points.add(new Point(7, 9));                    //2
//        points.add(new Point(9, 4));                    //3
//        points.add(new Point(2, 5));                    //4
//        points.add(new Point(5, 6));                    //5
//        points.add(new Point(1, 8));                    //6
//        points.add(new Point(2, 7));                    //7
//        points.add(new Point(1, 6));                    //8
//        points.add(new Point(9, 6));                    //9
//
//        printIndex(points.size());
//        System.out.println(points);
//        System.out.println();
//        System.out.println();
//
//        assertEquals(0, points.indexOf(new Point(6, 5)));
//        assertEquals(3, points.indexOf(new Point(9, 4)));
//        assertEquals(6, points.indexOf(new Point(1, 8)));
//        assertEquals(-1, points.indexOf(new Point(1, 2)));
//        assertEquals(-1, points.indexOf(new Point(5, 3)));
//
//        System.out.println("location of (6, 5) " + points.indexOf(new Point(6, 5)));
//        System.out.println("location of (9, 4) " + points.indexOf(new Point(9, 4)));
//        System.out.println("location of (1, 8) " + points.indexOf(new Point(1, 8)));
//        System.out.println("location of (1, 2) " + points.indexOf(new Point(1, 2)));
//        System.out.println("location of (9, 3) " + points.indexOf(new Point(5, 3)));
//        System.out.println();
//
//    }
//
//    @Test
//    void testIsEmpty() {
//        LinkedList<String> list = new LinkedList<>();
//
//        assertTrue(list.isEmpty());
//
//        System.out.println();
//        System.out.println("-------------- T  E  S  T   IS EMPTY() --------------");
//        list.add(0,"Un");
//        assertEquals(1, list.size());
//        list.add(1,"Deux");
//        assertEquals(2, list.size());
//        list.add(2,"Cinq");
//        assertEquals(3, list.size());
//        list.add(3,"Quatre");
//        assertEquals(4, list.size());
//        list.add(4,"Sept");
//        assertEquals(5, list.size());
//        list.add(5,"Six");
//        assertEquals(6, list.size());
//
//        assertFalse(list.isEmpty());
//
//        System.out.println();
//        System.out.println(list);
//        System.out.println();
//        System.out.printf("size before clearing: %d \n", list.size());
//
//        System.out.println();
//        System.out.println("------------ C  L  E  A  R  ------------");
//
//        int size = list.size();
//        for (int i = 0; i < size; i++) {
//            System.out.println(list);
//            System.out.println(list.remove(0));
//            System.out.println();
//        }
//
//        assertTrue(list.isEmpty());
//        assertEquals(0, list.size());
//
//        System.out.println(list);
//        System.out.println();
//
//    }
//
//
//    //THIS REQUIRES THE ADD FIRST, GET FIRST AND REMOVE FIRST METHODS
//    @Test
//    void testLast(){
//        LinkedList<String> list = new LinkedList<>();
//
//        assertEquals(0, list.size());
//
//        assertTrue(list.add("Un"));                 //0
//        assertTrue(list.add("Deux"));               //1
//        assertTrue(list.add("Trois"));              //2
//        assertTrue(list.add("Quatre"));             //3
//        assertTrue(list.add("Cinq"));               //4
//        assertEquals(5, list.size());
//
//        System.out.println("---------------  T E S T  LAST  ---------------");
//        list.addLast("Six");
//        assertEquals("Six"  , list.getLast());
//        list.addLast("Sept");
//        assertEquals("Sept" , list.getLast());
//        list.addLast("Huit");
//        assertEquals("Huit" , list.getLast());
//        list.addLast("Neuf");
//        assertEquals("Neuf" , list.getLast());
//        assertEquals(9, list.size());
//
//        assertEquals("Un"       , list.get(0));
//        assertEquals("Deux"     , list.get(1));
//        assertEquals("Trois"    , list.get(2));
//        assertEquals("Quatre"   , list.get(3));
//        assertEquals("Cinq"     , list.get(4));
//        assertEquals("Six"      , list.get(5));
//        assertEquals("Sept"     , list.get(6));
//        assertEquals("Huit"     , list.get(7));
//        assertEquals("Neuf"     , list.get(8));
//
//        System.out.println();
//        System.out.println(list);
//
//        assertEquals("Neuf" , list.removeLast());
//        assertEquals("Huit" , list.removeLast());
//        assertEquals("Sept" , list.removeLast());
//        assertEquals("Six"  , list.removeLast());
//        assertEquals("Cinq" , list.removeLast());
//        assertEquals(4, list.size());
//
//        System.out.println();
//        System.out.println(list);
//        System.out.println();
//
//        //TEST EXCEPTIONS
//        list.clear();
//
//        //Test USING FUNCTIONAL INTERFACE == METHOD REFERENCE
//        assertThrows(NoSuchElementException.class, list::removeLast);
//        assertThrows(NoSuchElementException.class, list::getLast);
//        System.out.println();
//
//    }
//
//    //THIS REQUIRES THE ADD FIRST, GET FIRST AND REMOVE FIRST METHODS
//    @Test
//    void testLastE(){
//        LinkedList<Point> list = new LinkedList<>();
//
//        list.add(new Point(8, 3));                //0
//        list.add(new Point(6, 9));                //1
//        list.add(new Point(2, 7));                //2
//        list.add(new Point(1, 6));                //3
//        list.add(new Point(9, 6));                //4
//        assertEquals(5, list.size());
//
//        list.addLast(new Point(3, 7));
//        assertEquals(new Point(3, 7), list.getLast());
//        list.addLast(new Point(7, 5));
//        assertEquals(new Point(7, 5), list.getLast());
//        list.addLast(new Point(9, 4));
//        assertEquals(new Point(9, 4), list.getLast());
//        list.addLast(new Point(5, 8));
//        assertEquals(new Point(5, 8), list.getLast());
//        assertEquals(9, list.size());
//
//        System.out.println();
//        System.out.println(list);
//
//        assertEquals(new Point(5, 8), list.removeLast());
//        assertEquals(new Point(9, 4), list.removeLast());
//        assertEquals(new Point(7, 5), list.removeLast());
//        assertEquals(new Point(3, 7), list.removeLast());
//
//        System.out.println();
//        System.out.println(list);
//        System.out.println();
//
//        //TEST EXCEPTIONS
//        list.clear();
//
//        //Test USING FUNCTIONAL INTERFACE == METHOD REFERENCE
//        assertThrows(NoSuchElementException.class, list::removeLast);
//        assertThrows(NoSuchElementException.class, list::getLast);
//        System.out.println();
//
//    }
//
//    //THIS METHOD ALSO REQUIRES THE ADD APPEND, GET METHODS BE IMPLEMENTED
//    @Test
//    void testRemoveE() {
//        LinkedList<String> list = new LinkedList<>();
//
//        System.out.println("---------------- T  E  S  T   REMOVE(String item) ----------------");
//        System.out.println("size BEFORE: " + list.size());
//        System.out.println();
//
//        assertEquals(0, list.size());
//        assertTrue(list.add("Un"));                 //0
//        assertTrue(list.add("Deux"));               //1
//        assertTrue(list.add("Trois"));              //2
//        assertTrue(list.add("Quatre"));             //3
//        assertTrue(list.add("Cinq"));               //4
//        assertTrue(list.add("Six"));                //5
//        assertTrue(list.add("Sept"));               //6
//        assertTrue(list.add("Huit"));               //7
//        assertTrue(list.add("Neuf"));               //8
//        assertTrue(list.add("Dix"));                //9
//        assertEquals(10, list.size());
//
//        assertTrue(list.add("Onze"));               //10
//        assertTrue(list.add("Douze"));              //11
//        assertTrue(list.add("Treize"));             //12
//        assertTrue(list.add("Quatorze"));           //13
//        assertTrue(list.add("Quinze"));             //14
//        assertTrue(list.add("Seize"));              //15
//        assertTrue(list.add("Dix Sept"));           //16
//        assertTrue(list.add("Dix Huit"));           //17
//        assertTrue(list.add("Dix Neuf"));           //18
//        assertTrue(list.add("Vingt"));              //19
//        assertEquals(20, list.size());
//
//        System.out.println("---------------- REMOVE FROM MIDDLE ----------------");
//        assertEquals("Neuf", list.get(8));
//        assertEquals(20, list.size());
//        assertTrue(list.remove("Neuf"));
//        assertEquals(19, list.size());
//        assertTrue(list.remove("Dix"));
//        assertEquals(18, list.size());
//        assertTrue(list.remove("Onze"));
//        assertEquals(17, list.size());
//        assertEquals("Douze", list.get(8));
//
//        System.out.println("---------------- REMOVE FROM FRONT ----------------");
//        assertEquals("Un", list.get(0));
//        assertEquals(17, list.size());
//        assertTrue(list.remove("Un"));
//        assertEquals(16, list.size());
//        assertTrue(list.remove("Deux"));
//        assertEquals(15, list.size());
//        assertTrue(list.remove("Trois"));
//        assertEquals(14, list.size());
//        assertTrue(list.remove("Quatre"));
//        assertEquals(13, list.size());
//        assertEquals("Cinq", list.get(0));
//
//        System.out.println("----------------- REMOVE FROM BACK -----------------");
//        assertEquals("Vingt", list.get(list.size() - 1));
//        assertEquals(13, list.size());
//        assertTrue(list.remove("Vingt"));
//        assertEquals(12, list.size());
//        assertTrue(list.remove("Dix Neuf"));
//        assertEquals(11, list.size());
//        assertTrue(list.remove("Dix Huit"));
//        assertEquals(10, list.size());
//        assertEquals("Dix Sept", list.get(list.size() - 1));
//
//        System.out.println("---------------- REMOVE ITEM NOT IN LIST -----------------");
//        System.out.println();
//
//        assertEquals(10, list.size());
//        assertFalse(list.remove("Neuf"));
//        assertEquals(10, list.size());
//        assertFalse(list.remove("Dix"));
//        assertEquals(10, list.size());
//        assertFalse(list.remove("Dix Neuf"));
//        assertEquals(10, list.size());
//
//        System.out.println("---------------- T  E  S  T   REMOVE(Point item) ----------------");
//
//        LinkedList<Point> points = new LinkedList<>();
//
//        assertEquals(0, points.size());
//
//        points.add(new Point(6, 5));            //0
//        points.add(new Point(8, 6));            //1
//        points.add(new Point(3, 7));            //2
//        points.add(new Point(7, 9));            //3
//        points.add(new Point(2, 7));            //4
//        points.add(new Point(9, 4));            //5
//        points.add(new Point(5, 8));            //6
//        points.add(new Point(1, 6));            //7
//        points.add(new Point(4, 8));            //8
//        points.add(new Point(9, 6));            //9
//
//        System.out.println("---------------- REMOVE FROM FRONT ----------------");
//
//        assertEquals(new Point(6, 5), points.get(0));
//        assertTrue(points.remove(new Point(6, 5)));
//        assertEquals(new Point(8, 6), points.get(0));
//        assertTrue(points.remove(new Point(8, 6)));
//        assertEquals(new Point(3, 7), points.get(0));
//        assertTrue(points.remove(new Point(3, 7)));
//        assertEquals(new Point(7, 9), points.get(0));
//
//        System.out.println("----------------- REMOVE FROM BACK -----------------");
//        assertEquals(new Point(9, 6), points.get(points.size() - 1));
//        assertTrue(points.remove(new Point(9, 6)));
//        assertEquals(new Point(4, 8), points.get(points.size() - 1));
//        assertTrue(points.remove(new Point(4, 8)));
//        assertEquals(new Point(1, 6), points.get(points.size() - 1));
//        assertTrue(points.remove(new Point(1, 6)));
//        assertEquals(new Point(5, 8), points.get(points.size() - 1));
//
//        System.out.println("----------------- REMOVE ITEM NOT IN LIST -----------------");
//        assertFalse(points.remove(new Point(1, 6)));
//        assertEquals(4, points.size());
//        assertFalse(points.remove(new Point(9, 6)));
//        assertEquals(4, points.size());
//
//        System.out.println(points);
//        System.out.println("POINT LIST SIZE: " + points.size());
//        System.out.println();
//
//    }
//
//    //THIS METHOD ALSO REQUIRES THE ADD APPEND, GET METHODS BE IMPLEMENTED
//    @Test
//    void testRemoveInt() {
//        LinkedList<String> list = new LinkedList<>();
//
//        System.out.println("----------------  T  E  S  T   REMOVE(int index) ----------------");
//        System.out.println();
//
//        assertEquals(0, list.size());
//        assertTrue(list.add("Un"));                 //0
//        assertTrue(list.add("Deux"));               //1
//        assertTrue(list.add("Trois"));              //2
//        assertTrue(list.add("Quatre"));             //3
//        assertTrue(list.add("Cinq"));               //4
//        assertTrue(list.add("Six"));                //5
//        assertTrue(list.add("Sept"));               //6
//        assertTrue(list.add("Huit"));               //7
//        assertTrue(list.add("Neuf"));               //8
//        assertTrue(list.add("Dix"));                //9
//        assertEquals(10, list.size());
//
//        assertTrue(list.add("Onze"));               //10
//        assertTrue(list.add("Douze"));              //11
//        assertTrue(list.add("Treize"));             //12
//        assertTrue(list.add("Quatorze"));           //13
//        assertTrue(list.add("Quinze"));             //14
//        assertTrue(list.add("Seize"));              //15
//        assertTrue(list.add("Dix Sept"));           //16
//        assertTrue(list.add("Dix Huit"));           //17
//        assertTrue(list.add("Dix Neuf"));           //18
//        assertTrue(list.add("Vingt"));              //19
//        assertEquals(20, list.size());
//
//        System.out.println("---------------- REMOVE FROM MIDDLE ----------------");
//        System.out.println();
//        System.out.println(list);
//        assertEquals("Neuf", list.remove(8));
//        assertEquals(19, list.size());
//        System.out.println(list);
//        assertEquals("Dix", list.remove(8));
//        assertEquals(18, list.size());
//        System.out.println(list);
//        assertEquals("Onze", list.remove(8));
//        assertEquals(17, list.size());
//        System.out.println(list);
//
//        System.out.println("---------------- REMOVE FROM FRONT ----------------");
//        assertEquals("Un", list.remove(0));
//        assertEquals(16, list.size());
//        System.out.println(list);
//        assertEquals("Deux", list.remove(0));
//        assertEquals(15, list.size());
//        System.out.println(list);
//        assertEquals("Trois", list.remove(0));
//        assertEquals(14, list.size());
//        System.out.println(list);
//        assertEquals("Quatre", list.remove(0));
//        assertEquals(13, list.size());
//        System.out.println(list);
//
//        System.out.println("---------------- REMOVE FROM BACK ----------------");
//        assertEquals("Vingt", list.get(list.size() - 1));
//        assertEquals("Vingt", list.remove(list.size() - 1));
//        assertEquals(12, list.size());
//        System.out.println(list);
//        assertEquals("Dix Neuf", list.remove(list.size() - 1));
//        assertEquals(11, list.size());
//        System.out.println(list);
//        assertEquals("Dix Huit", list.remove(list.size() - 1));
//        assertEquals(10, list.size());
//        System.out.println(list);
//        System.out.println();
//
//        System.out.println("<---------- T E S T  REMOVE(int index) POINTS ----------->");
//        System.out.println();
//
//        LinkedList<Point> points = new LinkedList<>();
//
//        assertEquals(0, points.size());
//
//        points.add(new Point(6, 5));            //0
//        points.add(new Point(8, 6));            //1
//        points.add(new Point(3, 7));            //2
//        points.add(new Point(7, 9));            //3
//        points.add(new Point(2, 7));            //4
//        points.add(new Point(9, 4));            //5
//        points.add(new Point(5, 8));            //6
//        points.add(new Point(1, 6));            //7
//        points.add(new Point(4, 8));            //8
//        points.add(new Point(9, 6));            //9
//        assertEquals(10, points.size());
//
//        System.out.println("---------------- REMOVE FROM FRONT ----------------");
//        assertEquals(new Point(6, 5), points.remove(0));
//        assertEquals(9, points.size());
//        System.out.println(points);
//        assertEquals(new Point(8, 6), points.remove(0));
//        assertEquals(8, points.size());
//        System.out.println(points);
//        assertEquals(new Point(3, 7), points.remove(0));
//        assertEquals(7, points.size());
//        System.out.println(points);
//        assertEquals(new Point(7, 9), points.remove(0));
//        assertEquals(6, points.size());
//        System.out.println(points);
//
//        System.out.println("----------------- REMOVE FROM BACK -----------------");
//        assertEquals(new Point(9, 6), points.remove(points.size() - 1));
//        assertEquals(5, points.size());
//        System.out.println(points);
//        assertEquals(new Point(4, 8), points.remove(points.size() - 1));
//        assertEquals(4, points.size());
//        System.out.println(points);
//        assertEquals(new Point(1, 6), points.remove(points.size() - 1));
//        assertEquals(3, points.size());
//        System.out.println(points);
//        assertEquals(new Point(5, 8), points.remove(points.size() - 1));
//        assertEquals(2, points.size());
//        System.out.println(points);
//
//
//        //Test FOR INDEX OUT OF BOUNDS
//        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(list.size()));
//        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(-list.size() + 1));
//        assertThrows(IndexOutOfBoundsException.class, () -> list.remove(list.size() + 2));
//        assertThrows(IndexOutOfBoundsException.class, () -> points.remove(points.size()));
//        assertThrows(IndexOutOfBoundsException.class, () -> points.remove(-1));
//
//        System.out.println();
//        System.out.println("TEST for throwing IndexOutOfBoundsException -> PASSED");
//
//    }
//
//    @Test
//    void testSet() {
//        LinkedList<String> list = new LinkedList<>();
//
//        System.out.println("-------- T  E   S  T   SET(int index, String item) --------");
//        System.out.println();
//
//        assertEquals(0, list.size());
//        assertTrue(list.add("Un"));                 //0
//        assertTrue(list.add("Deux"));               //1
//        assertTrue(list.add("Trois"));              //2
//        assertTrue(list.add("Quatre"));             //3
//        assertTrue(list.add("Cinq"));               //4
//        assertTrue(list.add("Six"));                //5
//        assertTrue(list.add("Sept"));               //6
//        assertTrue(list.add("Huit"));               //7
//        assertTrue(list.add("Neuf"));               //8
//        assertTrue(list.add("Dix"));                //9
//        assertEquals(10, list.size());
//
//        // SET AT FRONT
//        assertEquals("Un"   , list.set(0, "Dix"));
//        assertEquals("Dix"  , list.set(0, "Onze"));
//        assertEquals("Onze" , list.set(0, "Douze"));
//        assertEquals("Douze", list.set(0, "Treize"));
//
//        // SET MIDDLE
//        assertEquals("Cinq", list.set(4, "Onze"));
//        assertEquals("Onze", list.set(4, "Dix"));
//
//        //SET AT BACK
//        assertEquals("Dix", list.set(list.size() - 1, "Quinze"));
//        assertEquals("Quinze", list.set(list.size() - 1, "Seize"));
//        assertEquals("Seize", list.set(list.size() - 1, "Treize"));
//
//        LinkedList<Point> points = new LinkedList<>();
//
//        assertEquals(0, points.size());
//
//        points.add(new Point(6, 5));            //0
//        points.add(new Point(8, 6));            //1
//        points.add(new Point(3, 7));            //2
//        points.add(new Point(7, 9));            //3
//        points.add(new Point(2, 7));            //4
//        points.add(new Point(9, 4));            //5
//        points.add(new Point(5, 8));            //6
//        points.add(new Point(1, 6));            //7
//        points.add(new Point(4, 8));            //8
//        points.add(new Point(9, 6));            //9
//        assertEquals(10, points.size());
//
//        // SET AT FRONT
//        assertEquals(new Point(6, 5), points.set(0, new Point(1, 1)));
//        assertEquals(new Point(1, 1), points.set(0, new Point(3, 3)));
//        assertEquals(new Point(3, 3), points.set(0, new Point(1, 1)));
//
//        //SET AT BACK
//        assertEquals(new Point(9, 6), points.set(points.size() - 1, new Point(1, 1)));
//        assertEquals(new Point(1, 1), points.set(points.size() - 1, new Point(5, 5)));
//        assertEquals(new Point(5, 5), points.set(points.size() - 1, new Point(2, 2)));
//        assertEquals(10, points.size());
//
//        //TEST FOR INDEX OUT OF BOUNDS.
//        int sizeA = -(list.size() + 1);
//        int sizeB = list.size();
//        int sizeC = list.size() + 2;
//        int sizeD = points.size();
//        Point p1  = new Point(1, 2);
//
//        assertThrows(IndexOutOfBoundsException.class, () -> list.set(sizeA, "Trois"));
//        assertThrows(IndexOutOfBoundsException.class, () -> list.set(sizeB, "Trois"));
//        assertThrows(IndexOutOfBoundsException.class, () -> list.set(sizeC + 2, "Trois"));
//        assertThrows(IndexOutOfBoundsException.class, () -> points.set(sizeD, p1));
//        assertThrows(IndexOutOfBoundsException.class, () -> points.set(-1, p1));
//        System.out.println();
//        System.out.println();
//
//    }
//
//    //THIS REQUIRES THE USE OF ADD AND REMOVE
//    @Test
//    void testSize() {
//        LinkedList<String> list = new LinkedList<>();
//
//        System.out.println("---------------- T  E  S  T     S I Z E () ----------------");
//        System.out.println();
//
//        assertEquals(0, list.size());
//        assertTrue(list.add("Un"));
//        assertEquals(1, list.size());
//        assertTrue(list.add("Deux"));
//        assertEquals(2, list.size());
//        assertTrue(list.add("Trois"));
//        assertEquals(3, list.size());
//        assertTrue(list.add("Quatre"));
//        assertEquals(4, list.size());
//        assertTrue(list.add("Cinq"));
//        assertEquals(5, list.size());
//
//        assertTrue(list.add("Six"));                //5
//        assertTrue(list.add("Sept"));               //6
//        assertTrue(list.add("Huit"));               //7
//        assertTrue(list.add("Neuf"));               //8
//        assertTrue(list.add("Dix"));                //9
//        assertEquals(10, list.size());
//        assertTrue(list.add("Onze"));               //10
//        assertTrue(list.add("Douze"));              //11
//        assertTrue(list.add("Treize"));             //12
//        assertTrue(list.add("Quatorze"));           //13
//        assertTrue(list.add("Quinze"));             //14
//
//        assertEquals(15, list.size());
//        assertTrue(list.remove("Onze"));
//        assertEquals(14, list.size());
//        assertTrue(list.remove("Douze"));
//        assertEquals(13, list.size());
//        assertTrue(list.remove("Treize"));
//        assertEquals(12, list.size());
//        assertTrue(list.remove("Quatorze"));
//        assertEquals(11, list.size());
//        assertTrue(list.remove("Quinze"));
//        assertEquals(10, list.size());
//
//        System.out.println(list);
//        System.out.println("size end: " + list.size());
//
//        System.out.println();
//    }
//
//    @Test
//    void testToString() {
//        LinkedList<String> list = new LinkedList<>();
//
//        System.out.println("---------------- T  E  S  T     S I Z E () ----------------");
//        assertEquals("[]", list.toString());
//        System.out.println(list);
//
//        assertTrue(list.add("Un"));
//        assertEquals("[Un]", list.toString());
//        System.out.println(list);
//
//        assertTrue(list.add("Deux"));
//        assertEquals("[Un, Deux]", list.toString());
//        System.out.println(list);
//
//        assertTrue(list.add("Trois"));
//        assertEquals("[Un, Deux, Trois]", list.toString());
//        System.out.println(list);
//
//        assertTrue(list.add("Quatre"));
//        assertEquals("[Un, Deux, Trois, Quatre]", list.toString());
//        System.out.println(list);
//
//        assertTrue(list.add("Cinq"));
//        assertEquals("[Un, Deux, Trois, Quatre, Cinq]", list.toString());
//        System.out.println(list);
//
//        System.out.println();
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
//
