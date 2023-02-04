public class Recursion {
    static int sumOfSquaresOfNumbers(int n) {
        if (n <= 0) {
            return 1;
        } else {
            return n ^ 2 + sumOfSquaresOfNumbers(n - 1);
        }
    }

    static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        } else
            return n * factorial(n - 1);
    }

    static int sumofN(int n) {
        if (n == 0) {
            return 0;
        } else
            return n + sumofN(n - 1);
    }

    public static void main(String[] args) {
        System.out.println(sumOfSquaresOfNumbers(30));
        System.out.println(factorial(5));
        System.out.println(sumofN(3000));
    }
}