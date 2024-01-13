//package junits;
//
//import org.junit.jupiter.api.Test;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//import static org.junit.jupiter.api.Assertions.assertFalse;
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.api.Assertions.assertTrue;
//
//import utils.MyStack;
//
//import java.util.EmptyStackException;
//
///**
// * @author A. Ford
// * This is a JUnit Test for the utils.MyStack Class
// * This class uses the Jupiter JUnit Test Library
// * current version is Jupiter 5.8.1
// */
//public class JUNIT06QQMyStackTest {
//
//    @Test
//    void testMyStack() {
//        MyStack<String> stack = new MyStack<>();
//
//        System.out.println("---------------- Test Default Constructor( ) ----------------");
//        System.out.println("size before: " + stack.size());
//        System.out.println("Stack Object Created ");
//
//        assertEquals(0, stack.size());
//        assertTrue(stack.isEmpty());
//        System.out.println(stack);
//        System.out.println("size after: " + stack.size());
//        System.out.println();
//
//    }
//
//
//    @Test
//    void testPushE() {
//        MyStack<String> stack = new MyStack<>();
//
//        System.out.println("---------------- Test push(item) ----------------");
//        assertEquals("Red"   , stack.push("Red"));
//        assertEquals("Orange", stack.push("Orange"));
//        assertEquals("Yellow", stack.push("Yellow"));
//        assertEquals("Green" , stack.push("Green"));
//        assertEquals("Blue"  , stack.push("Blue"));
//        assertEquals("Indigo", stack.push("Indigo"));
//        assertEquals("Violet", stack.push("Violet"));
//
//        System.out.println(stack);
//        System.out.println("size: " + stack.size());
//        assertEquals(7, stack.size());
//        System.out.println();
//    }
//
//
//    @Test
//    void testIsEmpty() {
//        MyStack<String> stack = new MyStack<>();
//
//        System.out.println();
//        System.out.println("-------------- Test isEmpty() --------------");
//        System.out.println(stack);
//        assertEquals(0, stack.size());
//        assertTrue(stack.isEmpty());
//
//        assertEquals("Red"   , stack.push("Red"));
//        assertEquals("Orange", stack.push("Orange"));
//        assertEquals("Yellow", stack.push("Yellow"));
//        assertEquals("Green" , stack.push("Green"));
//        assertEquals("Blue"  , stack.push("Blue"));
//        assertEquals("Indigo", stack.push("Indigo"));
//        assertEquals("Violet", stack.push("Violet"));
//
//        assertEquals(7, stack.size());
//        assertFalse(stack.isEmpty());
//        System.out.println(stack);
//    }
//
//
//    @Test
//    void testPeekE() {
//        MyStack<String> stack = new MyStack<>();
//
//        System.out.println();
//        System.out.println("---------------- Test peek() ----------------");
//        assertEquals("Red"   , stack.push("Red"));
//        assertEquals("Orange", stack.push("Orange"));
//        assertEquals("Yellow", stack.push("Yellow"));
//        assertEquals("Green" , stack.push("Green"));
//        assertEquals("Blue"  , stack.push("Blue"));
//        assertEquals("Indigo", stack.push("Indigo"));
//        assertEquals("Violet", stack.push("Violet"));
//
//        System.out.println(stack);
//        System.out.println("size before: " + stack.size());
//        assertEquals("Violet", stack.peek());
//        assertEquals("Violet", stack.pop());
//        assertEquals("Indigo", stack.peek());
//        assertEquals("Indigo", stack.pop());
//        assertEquals("Blue"  , stack.peek());
//        assertEquals("Blue"  , stack.pop());
//        System.out.println(stack);
//        System.out.println("size after: " + stack.size());
//
//        assertEquals("Green" , stack.pop());
//        assertEquals("Yellow", stack.pop());
//        assertEquals("Orange", stack.pop());
//        assertEquals("Red"   , stack.pop());
//
//        assertThrows(EmptyStackException.class, stack::pop);
//        System.out.println();
//    }
//
//
//    @Test
//    void testPopE() {
//        MyStack<String> stack = new MyStack<>();
//
//        System.out.println();
//        System.out.println("---------------- Test pop() ----------------");
//        assertEquals("Red"   , stack.push("Red"));
//        assertEquals("Orange", stack.push("Orange"));
//        assertEquals("Yellow", stack.push("Yellow"));
//        assertEquals("Green" , stack.push("Green"));
//        assertEquals("Blue"  , stack.push("Blue"));
//        assertEquals("Indigo", stack.push("Indigo"));
//        assertEquals("Violet", stack.push("Violet"));
//
//        System.out.println(stack);
//        System.out.println("size before: " + stack.size());
//        assertEquals("Violet", stack.pop());
//        assertEquals("Indigo", stack.pop());
//        assertEquals("Blue"  , stack.pop());
//        assertEquals("Green" , stack.pop());
//        assertEquals("Yellow", stack.pop());
//        assertEquals("Orange", stack.pop());
//        assertEquals("Red"   , stack.pop());
//        System.out.println(stack);
//        System.out.println("size after: " + stack.size());
//
//        //Throws Exception if Empty.
//        assertThrows(EmptyStackException.class, stack::pop);
//        System.out.println();
//    }
//
//    @Test
//    void testSize() {
//        MyStack<String> stack = new MyStack<>();
//
//        System.out.println("---------------- Test size() ----------------");
//        assertEquals("Red"   , stack.push("Red"));
//        assertEquals("Orange", stack.push("Orange"));
//        assertEquals("Yellow", stack.push("Yellow"));
//        assertEquals("Green" , stack.push("Green"));
//        assertEquals("Blue"  , stack.push("Blue"));
//        assertEquals("Indigo", stack.push("Indigo"));
//        assertEquals("Violet", stack.push("Violet"));
//
//        System.out.println(stack);
//        assertEquals(7, stack.size());
//        System.out.println("size end: " + stack.size());
//
//        System.out.println();
//    }
//
//    @Test
//    void testToString() {
//        MyStack<String> stack = new MyStack<>();
//
//        System.out.println("---------------- Test toString Display() ----------------");
//        assertEquals("Red"   , stack.push("Red"));
//        assertEquals("Orange", stack.push("Orange"));
//        assertEquals("Yellow", stack.push("Yellow"));
//        assertEquals("Green" , stack.push("Green"));
//        assertEquals("Blue"  , stack.push("Blue"));
//        assertEquals("Indigo", stack.push("Indigo"));
//        assertEquals("Violet", stack.push("Violet"));
//
//        System.out.println();
//        System.out.println();
//        System.out.println("==== T  E  S  T      L  I  F  O ===");
//        System.out.println();
//
//        //THIS IS DONE USING FIX (SEE LATER, IF NOT IMPLEMENTED IN THIS LAB)
//        String value = "[Red, Orange, Yellow, Green, Blue, Indigo, Violet]";
//        assertEquals(value , stack.toString());
//
//        System.out.println(stack);
//        assertEquals("Violet", stack.pop());
//        assertEquals("[Red, Orange, Yellow, Green, Blue, Indigo]" , stack.toString());
//
//        System.out.println(stack);
//        assertEquals("Indigo", stack.pop());
//        assertEquals("[Red, Orange, Yellow, Green, Blue]" , stack.toString());
//
//        System.out.println(stack);
//        assertEquals("Blue"  , stack.pop());
//        assertEquals("[Red, Orange, Yellow, Green]" , stack.toString());
//
//        System.out.println(stack);
//        assertEquals("Green" , stack.pop());
//        assertEquals("[Red, Orange, Yellow]" , stack.toString());
//
//        System.out.println(stack);
//        assertEquals("Yellow", stack.pop());
//        assertEquals("[Red, Orange]" , stack.toString());
//
//        System.out.println(stack);
//        assertEquals("Orange", stack.pop());
//        assertEquals("[Red]" , stack.toString());
//
//        System.out.println(stack);
//        assertEquals("Red"   , stack.pop());
//        assertEquals("[]" , stack.toString());
//
//        System.out.println();
//    }
//
//}
