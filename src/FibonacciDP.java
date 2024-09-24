public class FibonacciDP {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int[] fib = new int[n + 1];
        fib[0] = 0;
        fib[1] = 1;

        for (int i = 2; i <= n; i++) {
            fib[i] = fib[i - 1] + fib[i - 2];
        }

        return fib[n];
    }
    public static void complexity() {
        System.out.println("Часова складність: O(n)");
        System.out.println("Просторова складність: O(n)");
    }
    public static void printUML() {
        System.out.println("+--------------------------------+");
        System.out.println("|           FibonacciDP          |");
        System.out.println("+--------------------------------+");
        System.out.println("| +fibonacci(n: int): int        |");
        System.out.println("| +complexity(): void            |");
        System.out.println("| +main(args: String[]): void    |");
        System.out.println("+--------------------------------+");
    }

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
        complexity();
        printUML();
    }
}
