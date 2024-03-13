package lab04$algorithms;

/*******************************************************************************
 * This Test shows a modules recursive, modules iterative and
 * memoized modules recursive implementation
 * of the Fibonacci Sequence for you to analyze the results.
 *******************************************************************************/
public class Test02Fibonacci {

    public static int fib(int n) {
        if (n <= 1) {
            return n;
        }
        return fib(n - 1) + fib(n - 2);
    }

    public static int ifib(int n) {
        if (n <= 1) {
            return n;
        }
        int a = 0, b = 1, c;
        for (int i = 2; i <= n; i++) {
            c = a + b;
            a = b;
            b = c;
        }
        return b;
    }

    public static int mfib(int n) {
        int[] memo = new int[n + 1];
        return memo(n, memo);
    }

    private static int memo(int n, int[] memo) {
        if (n <= 1) {
            return n;
        }
        if (memo[n] != 0) {
            return memo[n];
        }
        memo[n] = memo(n - 1, memo) + memo(n - 2, memo);
        return memo[n];
    }


    public static void checkIterativeFib(int n){
        System.out.println("\t \t \t I T E R A T I V E   -   ifib(n)");
        System.out.println();
        printHorizontal(Test02Fibonacci::ifib, n);
        System.out.println();
    }


    /**********************************************************************
    * Test for modules iterative Fibonacci for Large N
    **********************************************************************/
    public static void checkLargeNIteration(int n){
        System.out.println("\t \t \t L A R G E  N   -   ifib(n)");
        System.out.println();
        printVertical(Test02Fibonacci::ifib, n);
        System.out.println();
    }


    /**********************************************************************
    * Test for memoized Fibonacci for Large N
    **********************************************************************/
    public static void checkLargeNMemoization(int n){
        System.out.println("\t \t \t L A R G E  N   -   mfib(n)");
        System.out.println();
        printVertical(Test02Fibonacci::mfib, n);
        System.out.println();
    }


    /**********************************************************************
     * Test for the standard modules recursive Fibonacci for Large N
     **********************************************************************/
    public static void checkLargeNRecursion(int n){
        System.out.println("\t \t \t L A R G E  N   -   fib(n)");
        System.out.println();
        printVertical(Test02Fibonacci::fib, n);
        System.out.println();
    }


    public static void checkMemoizedFib(int n){
        System.out.println("\t \t \t M E M O I Z A T I O N   -   mfib(n)");
        System.out.println();
        printHorizontal(Test02Fibonacci::mfib, n);
        System.out.println();
    }


    public static void checkRecursiveFib(int n){
        System.out.println("\t \t \t R E C U R S I V E   -   fib(n)");
        System.out.println();
        printHorizontal(Test02Fibonacci::fib, n);
        System.out.println();
    }


        /****************************************************************
     * prints nth Fibonacci. This uses a functional programming
     * approach to print out the data.
     ****************************************************************/
    public static void printHorizontal(Fib f, int n){
        System.out.println("============== nth Fibonacci ============");

        // PRINTS : count of nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.printf("%d \t", i);
        }
        System.out.println();

        //PRINTS : value for nth factorial
        for (int i = 0; i <= n; i++ ) {
            System.out.printf("%d \t", f.fib(i));
        }
        System.out.println();
    }


        /****************************************************************
     * prints large value sequence in lines. This uses a functional
     * programming approach to print out the data.
     ****************************************************************/
    public static void printVertical(Fib f, int n){
        System.out.println("============ R E S U L T S  ============");
        System.out.println();
        System.out.println();
        System.out.println("====== Large Value Printing Ahead ====== ");
        System.out.println();

        //PRINTS : value for nth factorial
        System.out.println("\t \t n \t \t value");
        for (int i = 0; i <= n; i++ ) {
            String str1 = String.format("\t \t %d \t \t %d \n", i, f.fib(i));
            String str2 = String.format("\t \t %d \t %d \n", i, f.fib(i));

            //TERNARY OPERATOR
            String fString = (i < 10) ? str1 : str2;
            System.out.print(fString);
        }

        System.out.println();
    }



    public static void intro(){
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
        System.out.println(" \t \t \t \t  W E L C O M E  ");
        System.out.println();
        System.out.println(" F I B O N A C C I    T E S T    P R O G R A M");
        System.out.println();
        System.out.println();
        System.out.println("***************************************************");
        System.out.println();
        System.out.println();
    }


    public static void main(String[] args) {
        intro();

        //FIXME: print results for values up to 11 etc.
        checkRecursiveFib(11);
        checkMemoizedFib(11);
        checkIterativeFib(11);

        //FIXME: print results vertically for values closer to 50
        checkLargeNRecursion(45);
        checkLargeNMemoization(45);
        checkLargeNIteration(45);
    }

}
