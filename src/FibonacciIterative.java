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

    public static void main(String[] args) {
        int n = 6;
        System.out.println("Fibonacci(" + n + ") = " + fibonacci(n));
    }
}
