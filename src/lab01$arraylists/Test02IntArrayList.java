package lab01$arraylists;

/**
 * OUTPUT EXAMPLE | "Integer Array List"
 * This is a print test example of the output you should see with your
 * Integer Array List.
 */

public class Test02IntArrayList {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  H  E  L  L  O  ");
        System.out.println();
        System.out.println(" \t \t \t \t \tT H I S   I S ");
        System.out.println(" \t \t \tI N T    A R R A Y L I S T ");
        System.out.println(" \t \t \t \tT E S T   P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println();
    }

    public static void testIntArrayList(){
        System.out.println();
        System.out.println(" \t  L I B R A R Y    A P I ");

        IntArrayList list = new IntArrayList();
        System.out.println();
        System.out.println(" \t =========== T E S T   I S    E M P T Y =========== ");

        // isEmpty() test
        System.out.println("Is the array empty? " + list.isEmpty());
        System.out.println();

        // size() test
        System.out.println(list);
        System.out.println("list size: " + list.size());

        System.out.println();
        System.out.println(" \t =========== T E S T   A D D    A  P  P  E  N  D =========== ");

        // add(value) check
        list.add(2);
        System.out.println(list);
        list.add(9);
        System.out.println(list);
        list.add(7);
        System.out.println(list);
        list.add(3);
        System.out.println(list);
        list.add(8);
        System.out.println(list);
        list.add(1);
        System.out.println(list);
        list.add(6);
        System.out.println(list);
        list.add(4);
        System.out.println(list);
        list.add(5);
        System.out.println(list);
        list.add(13);
        System.out.println(list);
        System.out.println();

        System.out.println(" \t =========== T E S T   S I Z  E =========== ");
        System.out.println();
        System.out.printf("Size of List:  %d", list.size());
        System.out.println();
        System.out.println(list);
        System.out.println();

        System.out.println(" \t =========== T E S T   R E M O V E (I N D E X) =========== ");
        System.out.println();
        System.out.println("Item Removed From Index 1 ");
        list.remove(1);
        System.out.println(list);
        System.out.println();
        System.out.printf("Size of List:  %d \n", list.size());
        System.out.println();
        System.out.println("Item Removed From Index 4");
        list.remove(4);
        System.out.println(list);
        System.out.println();
        System.out.printf("Size of List:  %d \n", list.size());
        System.out.println();

        System.out.println(" == A D D  A N O T H E R   I T E M == ");
        System.out.println();
        list.add(16);
        System.out.println(list);
        System.out.println();
        System.out.printf("Size of List:  %d \n", list.size());
        System.out.println();

        // remove(index) test
        System.out.println(" == R E M O V E  T E S T  ( I N D E X ) == ");
        System.out.println();
        list.remove(5);
        System.out.println(list);
        list.remove(1);
        System.out.println(list);
        System.out.println();

        // add(index, item) test
        System.out.println(" == A D D  A T  I N D E X == ");
        System.out.println();
        list.add(4, 11);
        System.out.println(list);
        System.out.println();

        // get(index) test
        System.out.println("== G E T   T E S T ==");
        System.out.println();
        System.out.println("Index 3's value is: " + list.get(3));
        System.out.println();

        // set(index, item) test
        System.out.println(" == S E T   T E S T == ");
        System.out.println();
        list.set(0, 15);
        System.out.println(list);
        System.out.println();

        // contains(item) test
        System.out.println("== C O N T A I N S  T E S T ==");
        System.out.println();
        System.out.println("Does list contain 8? " + list.contains(8));
        System.out.println("Does list contain 7? " + list.contains(7));
        System.out.println();


        // indexOf(item) test
        System.out.println("== I N D E X   T E S T ==");
        System.out.println();
        System.out.println("8 is at index: " + list.indexOf(8));
        System.out.println();

        // clear() test
        System.out.println("== I N D E X   C L E A R ==");
        System.out.println();
        System.out.println("list size before clear: " + list.size());
        list.clear();
        System.out.println("list size after clear: " + list.size());

    }

    public static void main(String[] args) {
        intro();
        testIntArrayList();
    }
}
