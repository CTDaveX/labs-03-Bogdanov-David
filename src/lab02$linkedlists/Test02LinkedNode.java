package lab02$linkedlists;

public class Test02LinkedNode {

    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println(" \t \t \t \t  W  E  L  C  O  M  E  ");
        System.out.println();
        System.out.println(" \t \t L  I  N  K  E  D    N  O  D  E  S");
        System.out.println();
        System.out.println(" \t \t T  E  S  T    P  R  O  G  R  A  M");
        System.out.println();
        System.out.println("----------------------------------------------------");
        System.out.println();
        System.out.println();
    }


    public static void testLinkedIntegerNodes(){
        System.out.println();
        System.out.println("===== \t  I  N  T  E  G  E  R  S \t ======");
        System.out.println();

        //used first constructor with next reference updates
        Node<Integer> first = new Node<>(2);  // new object (address)
        first.next          = new Node<>(6);  // new object (address)
        first.next.next     = new Node<>(7);

        System.out.println(printInteger(first));

        //use the second constructor to do the same as above
        Node<Integer> start = new Node<>(2, new Node<>(6, new Node<>(7)));

        System.out.println(printInteger(start));
    }

    public static void testLinkedNodes(){
        System.out.println();
        System.out.println("===== \t  S  T  R  I  N  G  S \t ======");
        System.out.println();

        // Tom, Ben, Sam, John, Tim
        Node<String> first          = new Node<>("Tom");
        first.next                  = new Node<>("Ben");
        first.next.next             = new Node<>("Sam");
        first.next.next.next        = new Node<>("John");
        first.next.next.next.next   = new Node<>("Tim");

        System.out.println(printString(first));

        // use string version
        Node<String> front = new Node<>("Tom", new Node<>("Jim", new Node<>("Sam")));
        System.out.println(printString(front));
    }


    //a method to traverse through the linked string nodes without breaking chain
    public static String printInteger(Node<Integer> first){
        if(first == null){
            return "[]";
        }else{
            StringBuilder builder = new StringBuilder("[" + first.data);
            for (Node<Integer> node = first.next; node != null; node = node.next){
                builder.append(", ").append(node.data);
            }
            return  builder.append("]").toString();
        }
    }


    //a method to traverse through the linked integer nodes without breaking chain
    public static String printString(Node<String> first){
        if(first == null){
            return "[]";
        }else{
            StringBuilder builder = new StringBuilder("[" + first.data);
            for (Node<String> node = first.next; node != null; node = node.next){
                builder.append(", ").append(node.data);
            }
            return  builder.append("]").toString();
        }
    }


    public static void main(String[] args) {
        intro();
        testLinkedNodes();
        testLinkedIntegerNodes();
    }


    // static nested class : decoupled from outer class
    static class Node<T> {
        T       data;
        Node<T> next;

        public Node(T data){
            this(data, null);   // calls the second constructor
        }

        // implicit parameter "this" -> is passed implicitly
        public Node(T data, Node<T> next){
            this.data = data;
            this.next = next;
        }
    }
}
