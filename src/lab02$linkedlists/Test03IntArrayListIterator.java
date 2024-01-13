package lab02$linkedlists;

import lab01$arraylists.IntArrayList;

public class Test03IntArrayListIterator {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("\t \t \t \tH  E  L  L  O  ");
        System.out.println();
        System.out.println("\t \t \t \tT H I S   I S ");
        System.out.println("\t \tI N T  A R R A Y   I T E R A T O R");
        System.out.println("\t \t \tT E S T   P R O G R A M");
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();
    }

    public static void testIntArrayListIterator(){
        System.out.println();

        IntArrayList list = new IntArrayList();

        System.out.println();
        System.out.println(" \t =========== T E S T   A D D I N G   T O   L I ST =========== ");

        // add(value) check
        list.add(9);
        System.out.println(list);
        list.add(2);
        System.out.println(list);
        list.add(0);
        System.out.println(list);
        list.add(3);
        System.out.println(list);
        list.add(-8);
        System.out.println(list);
        list.add(0);
        System.out.println(list);
        list.add(6);
        System.out.println(list);
        list.add(11);
        System.out.println(list);
        list.add(0);
        System.out.println(list);
        list.add(-4);
        System.out.println();


        //Iterator test (can have multiple iterator objects)
        System.out.println("== I T E R A T O R    T E S T ==");
        IntArrayIterator itr = list.iterator();
        System.out.println(list);

        while (itr.hasNext())
            System.out.printf("Next Item? : %d \n", itr.next());

        System.out.println();

        System.out.println("== P R O D U C T    T E S T ==");
        IntArrayIterator itr1 = list.iterator();
        int product = 1;
        System.out.println(list);

        // use an iterator to find  the product removing zeros
        while (itr1.hasNext()){
            int n = itr1.next();
            if(n == 0){
                itr1.remove();
            }else {
                product *= n;
            }
        }

        System.out.println(list);
        System.out.println();
        System.out.printf("product of list: %d", product);
        System.out.println();
    }


    public static void main(String[] args) {
        intro();
        testIntArrayListIterator();
    }
}
