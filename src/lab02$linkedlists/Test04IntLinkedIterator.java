package lab02$linkedlists;

public class Test04IntLinkedIterator {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println();
        System.out.println("\t \t \t \t  H  E  L  L  O  ");
        System.out.println();
        System.out.println("\t \t \t \tT H I S   I S ");
        System.out.println("\tI N T   L I N K E D   I T E R A T O R");
        System.out.println("\t \t \tT E S T   P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("--------------------------------------------------");
        System.out.println();
        System.out.println();
    }

    public static void testIntLinkedIterator(){
        System.out.println();
        IntLinkedList list = new IntLinkedList();
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
        IntLinkedIterator itr = list.iterator();
        System.out.println(list);

        while (itr.hasNext())
            System.out.printf("Next Item? : %d \n", itr.next());

        System.out.println();

        System.out.println("== P R O D U C T    T E S T ==");
        IntLinkedIterator itr1 = list.iterator();
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
        testIntLinkedIterator();
    }
}
