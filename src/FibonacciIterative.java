public class FibonacciIterative {
    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }

        int prev1 = 0, prev2 = 1;
        int current = 0;

        for (int i = 2; i <= n; i++) {
            current = prev1 + prev2;
            prev1 = prev2;
            prev2 = current;
        }
        return current;
    }
    public static void complexity() {
        System.out.println("Часова складність: O(n)");
        System.out.println("Просторова складність: O(1)");
    }
    public static void printUML() {
        System.out.println("+--------------------------------+");
        System.out.println("|        FibonacciIterative      |");
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
