//package junits;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import coordinates.Point;
//import coordinates.Rectangle;
//import utils.ArrayList;
//import utils.List;
//
///**
// * @author A. Ford
// * This is a JUnit Test to test the Functional Interfaces for
// * the utils.List sorting algoritm.
// * This class uses the Jupiter JUnit Test Library
// * current version is Jupiter 5.8.1
// */
//public class JUNIT11QQCompareTest {
//
//    @Test
//    void testComparingPoints(){
//
//        List<Point> list = new ArrayList<>();
//        assertTrue(list.add(new Point(6, 5)));                //0
//        assertTrue(list.add(new Point(8, 6)));                //1
//        assertTrue(list.add(new Point(3, 7)));                //2
//        assertTrue(list.add(new Point(7, 9)));                //3
//        assertTrue(list.add(new Point(2, 5)));                //4
//        assertTrue(list.add(new Point(5, 4)));                //5
//        assertTrue(list.add(new Point(5, 6)));                //6
//        assertTrue(list.add(new Point(1, 8)));                //7
//        assertTrue(list.add(new Point(7, 5)));                //8
//        assertTrue(list.add(new Point(4, 8)));                //9
//
//        //Functional Interface Usage = Method Reference
//        System.out.println("---------------   COMPARE POINT DIMENSIONS   --------------- ");
//        System.out.println();
//        System.out.println(list);
//        list.quickSort(Point::compareTo);
//        System.out.println(list);
//
//        assertEquals(new Point(1, 8), list.get(0));     //0
//        assertEquals(new Point(2, 5), list.get(1));     //1
//        assertEquals(new Point(3, 7), list.get(2));     //2
//        assertEquals(new Point(4, 8), list.get(3));     //3
//        assertEquals(new Point(5, 4), list.get(4));     //4
//        assertEquals(new Point(5, 6), list.get(5));     //5
//        assertEquals(new Point(6, 5), list.get(6));     //6
//        assertEquals(new Point(7, 5), list.get(7));     //7
//        assertEquals(new Point(7, 9), list.get(8));     //8
//        assertEquals(new Point(8, 6), list.get(9));     //9
//
//        System.out.println();
//        System.out.println();
//
//    }
//
//
//    @Test
//    void testComparingRectangles(){
//        List<Rectangle> list = new ArrayList<>();
//
//        assertTrue(list.add(new Rectangle(6, 5)));                //0
//        assertTrue(list.add(new Rectangle(8, 6)));                //1
//        assertTrue(list.add(new Rectangle(3, 7)));                //2
//        assertTrue(list.add(new Rectangle(7, 9)));                //3
//        assertTrue(list.add(new Rectangle(2, 5)));                //4
//        assertTrue(list.add(new Rectangle(5, 4)));                //5
//        assertTrue(list.add(new Rectangle(5, 6)));                //6
//        assertTrue(list.add(new Rectangle(1, 8)));                //7
//        assertTrue(list.add(new Rectangle(7, 5)));                //8
//        assertTrue(list.add(new Rectangle(4, 8)));                //9
//
//        //Functional Interface Usage = Method Reference
//        System.out.println("---------------   COMPARE RECTANGLES DIMENSIONS   --------------- ");
//        System.out.println();
//        System.out.println(list);
//        list.quickSort(Rectangle::compareTo);
//        System.out.println(list);
//
//        assertEquals(new Rectangle(1, 8), list.get(0));     //0
//        assertEquals(new Rectangle(2, 5), list.get(1));     //1
//        assertEquals(new Rectangle(3, 7), list.get(2));     //2
//        assertEquals(new Rectangle(4, 8), list.get(3));     //3
//        assertEquals(new Rectangle(5, 4), list.get(4));     //4
//        assertEquals(new Rectangle(5, 6), list.get(5));     //5
//        assertEquals(new Rectangle(6, 5), list.get(6));     //6
//        assertEquals(new Rectangle(7, 5), list.get(7));     //7
//        assertEquals(new Rectangle(7, 9), list.get(8));     //8
//        assertEquals(new Rectangle(8, 6), list.get(9));     //9
//
//        System.out.println();
//        System.out.println();
//
//    }
//
//
//    @Test
//    void testComparingRectangleAreas(){
//
//        List<Rectangle> list = new ArrayList<>();
//        assertTrue(list.add(new Rectangle(5, 5)));                //0
//        assertTrue(list.add(new Rectangle(8, 5)));                //1
//        assertTrue(list.add(new Rectangle(3, 3)));                //2
//        assertTrue(list.add(new Rectangle(2, 7)));                //3
//        assertTrue(list.add(new Rectangle(2, 2)));                //4
//        assertTrue(list.add(new Rectangle(5, 4)));                //5
//        assertTrue(list.add(new Rectangle(5, 6)));                //6
//        assertTrue(list.add(new Rectangle(1, 8)));                //7
//        assertTrue(list.add(new Rectangle(4, 1)));                //8
//        assertTrue(list.add(new Rectangle(4, 3)));                //9
//
//        //Functional Interface Usage = Method Reference
//        System.out.println("---------------   COMPARE RECTANGLE AREAS   --------------- ");
//        System.out.println();
//        System.out.println(list);
//        list.quickSort(Rectangle::compareAreas);
//        System.out.println(list);
//
//        assertEquals(new Rectangle(2, 2), list.get(0));     //0
//        assertEquals(new Rectangle(4, 1), list.get(1));     //1
//        assertEquals(new Rectangle(1, 8), list.get(2));     //2
//        assertEquals(new Rectangle(3, 3), list.get(3));     //3
//        assertEquals(new Rectangle(4, 3), list.get(4));     //4
//        assertEquals(new Rectangle(2, 7), list.get(5));     //5
//        assertEquals(new Rectangle(5, 4), list.get(6));     //6
//        assertEquals(new Rectangle(5, 5), list.get(7));     //7
//        assertEquals(new Rectangle(5, 6), list.get(8));     //8
//        assertEquals(new Rectangle(8, 5), list.get(9));     //9
//
//        System.out.println();
//        System.out.println();
//
//    }
//
//
//    @Test
//    void testComparingRectanglePerimeters(){
//
//        List<Rectangle> list = new ArrayList<>();
//        assertTrue(list.add(new Rectangle(5, 5)));                //0
//        assertTrue(list.add(new Rectangle(8, 5)));                //1
//        assertTrue(list.add(new Rectangle(3, 3)));                //2
//        assertTrue(list.add(new Rectangle(2, 7)));                //3
//        assertTrue(list.add(new Rectangle(2, 2)));                //4
//        assertTrue(list.add(new Rectangle(5, 4)));                //5
//        assertTrue(list.add(new Rectangle(5, 6)));                //6
//        assertTrue(list.add(new Rectangle(1, 8)));                //7
//        assertTrue(list.add(new Rectangle(4, 1)));                //8
//        assertTrue(list.add(new Rectangle(4, 3)));                //9
//
//        //Functional Interface Usage = Method Reference
//        System.out.println("---------------   COMPARE RECTANGLE PERIMETERS   --------------- ");
//        System.out.println();
//        System.out.println(list);
//        list.quickSort(Rectangle::comparePerimeters);
//        System.out.println(list);
//
//        assertEquals(new Rectangle(2, 2), list.get(0));     //0
//        assertEquals(new Rectangle(4, 1), list.get(1));     //1
//        assertEquals(new Rectangle(3, 3), list.get(2));     //2
//        assertEquals(new Rectangle(4, 3), list.get(3));     //3
//        assertEquals(new Rectangle(5, 4), list.get(4));     //4
//        assertEquals(new Rectangle(1, 8), list.get(5));     //5
//        assertEquals(new Rectangle(2, 7), list.get(6));     //6
//        assertEquals(new Rectangle(5, 5), list.get(7));     //7
//        assertEquals(new Rectangle(5, 6), list.get(8));     //8
//        assertEquals(new Rectangle(8, 5), list.get(9));     //9
//
//        System.out.println();
//        System.out.println();
//
//    }
//
//}
