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
//import utils.SinglyLinkedList;
//
///**
// * @author A. Ford
// * This is a JUnit Test for the utils.SinglySinglyLinkedList Class
// * This class uses the Jupiter JUnit Test Library
// * current version is Jupiter 5.8.1
// */
//public class JUNIT03QQSinglyLinkedTest {
//
//    //NOTE THIS METHOD REQUIRES THE "ADD-APPEND" AND GET METHODS TO BE IMPLEMENTED
//    @Test
//    void testSinglyLinkedList() {
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
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
//
//    //THIS REQUIRES THE USE OF THE GET METHOD
//    @Test
//    void testAddE() {
//
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
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
//
//    @Test
//    void testAddIntE() {
//
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
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
//    @Test
//    void testGet() {
//
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
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
//    void testIsEmpty() {
//
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
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
//    //THIS METHOD ALSO REQUIRES THE ADD APPEND, GET METHODS BE IMPLEMENTED
//    @Test
//    void testRemoveInt() {
//
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
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
//        SinglyLinkedList<Point> points = new SinglyLinkedList<>();
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
//
//    @Test
//    void testSet() {
//
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
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
//
//        // SET MIDDLE
//        assertEquals("Cinq", list.set(4, "Onze"));
//        assertEquals("Onze", list.set(4, "Dix"));
//
//
//        //SET AT BACK
//        assertEquals("Dix", list.set(list.size() - 1, "Quinze"));
//        assertEquals("Quinze", list.set(list.size() - 1, "Seize"));
//        assertEquals("Seize", list.set(list.size() - 1, "Treize"));
//
//
//        SinglyLinkedList<Point> points = new SinglyLinkedList<>();
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
//
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
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
//        assertEquals("Quinze", list.remove(list.size() - 1));
//        assertEquals(14, list.size());
//        assertEquals("Quatorze", list.remove(list.size() - 1));
//        assertEquals(13, list.size());
//        assertEquals("Treize", list.remove(list.size() - 1));
//        assertEquals(12, list.size());
//        assertEquals("Douze", list.remove(list.size() - 1));
//        assertEquals(11, list.size());
//        assertEquals("Onze", list.remove(list.size() - 1));
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
//        SinglyLinkedList<String> list = new SinglyLinkedList<>();
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
//}
//
