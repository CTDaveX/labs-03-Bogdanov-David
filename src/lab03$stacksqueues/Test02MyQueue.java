//package lab03$stacksqueues;
//
//import utils.MyQueue;
//import utils.MyStack;
//
//import java.util.NoSuchElementException;
//
//public class Test02MyQueue {
//
//    public static void intro(){
//        System.out.println();
//        System.out.println();
//        System.out.println("----------------------------------------------------");
//        System.out.println();
//        System.out.println(" \t \t \t \t  W E L C O M E  ");
//        System.out.println();
//        System.out.println(" \t S T A C K    Q U E U E");
//        System.out.println(" \t T E S T    P R O G R A M");
//        System.out.println();
//        System.out.println("----------------------------------------------------");
//        System.out.println();
//        System.out.println();
//    }
//
//    public static void myQueuePrintTest(){
//        //TODO : Create println tests for each of your MyQueue methods
//        System.out.println();
//        System.out.println("==========  M Y   Q U E U E   T E S T==========");
//
//        // Testing queue methods
//        MyQueue<String> queue = new MyQueue<>();
//
//        System.out.println(queue);
//        queue.add("Red");
//        System.out.println(queue);
//        queue.add("Orange");
//        System.out.println(queue);
//        queue.add("Yellow");
//        System.out.println(queue);
//        queue.add("Green");
//        System.out.println(queue);
//        queue.add("Blue");
//        System.out.println(queue);
//        queue.add("Indigo");
//        System.out.println(queue);
//        queue.add("Violet");
//        System.out.println(queue);
//        queue.remove();
//        System.out.println(queue);
//        queue.remove();
//        System.out.println(queue);
//        queue.remove();
//        System.out.println(queue);
//        queue.remove();
//        System.out.println(queue);
//        queue.remove();
//        System.out.println(queue);
//        queue.remove();
//        System.out.println(queue);
//        queue.remove();
//        System.out.println(queue);
//        queue.remove();
//    }
//
//    public static <E> MyQueue<E> stackToQueue(MyStack<E> stack){
//        System.out.println();
//        System.out.println("==========  STACK TO QUEUE  ==========");
//        System.out.println();
//        System.out.println("Stack: " + stack);
//
//        MyQueue<E> queue = new MyQueue<>();
//
//        while (!stack.isEmpty()) {
//            queue.add(stack.pop());
//        }
//
//        System.out.println("To Queue: " + queue);
//
//        return queue;
//    }
//
//    public static <E> MyStack<E> queueToStack(MyQueue<E> queue){
//        System.out.println();
//        System.out.println("==========  QUEUE TO STACK  ==========");
//        System.out.println();
//        System.out.println("Queue: " + queue);
//
//        MyStack<E> stack = new MyStack<>();
//
//        while (!queue.isEmpty()){
//            stack.push(queue.remove());
//        }
//
//        System.out.println("To Stack: " + stack);
//        return stack;
//    }
//
//    public static int removeMin(MyStack<Integer> stack) {
//        System.out.println();
//        System.out.println("==========  REMOVE MIN  ==========");
//        System.out.println();
//        System.out.println("Original Stack: " + stack);
//
//        if (stack.isEmpty()) {
//            throw new NoSuchElementException("Stack is empty");
//        }
//
//
//        MyQueue<Integer> queue = new MyQueue<>();
//        int min = stack.peek();
//
//        while (!stack.isEmpty()) {
//            int value = stack.pop();
//            if (value < min) {
//                min = value;
//            }
//            queue.add(value);
//        }
//
//        while (!queue.isEmpty()) {
//            int value = queue.remove();
//            if (value != min) {
//                stack.push(value);
//            }
//        }
//        return min;
//    }
//
//    public static void main(String[] args) {
//        intro();
//
//        System.out.println();
//        System.out.println();
//
//        // create a stack here
//        MyStack<String> stack = new MyStack<>();
//        stack.push("Red");
//        stack.push("Orange");
//        stack.push("Yellow");
//        stack.push("Green");
//        stack.push("Blue");
//        stack.push("Indigo");
//        stack.push("Violet");
//
//        // produce the queue here
//        MyQueue<String> queue = stackToQueue(stack);
//
//        // create a stack from queue
//        queueToStack(queue);
//
//        //  Testing removeMin method
//        MyStack<Integer> intStack = new MyStack<>();
//        intStack.push(2);
//        intStack.push(8);
//        intStack.push(3);
//        intStack.push(11);
//        intStack.push(2);
//        intStack.push(3);
//        intStack.push(2);
//        intStack.push(7);
//        intStack.push(12);
//        intStack.push(4);
//
//        System.out.println("Original Stack: " + intStack);
//        int min = removeMin(intStack);
//        System.out.println("Minimum Value: " + min);
//        System.out.println("Modified Stack: " + intStack);
//    }
//
//}
