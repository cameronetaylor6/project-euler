public class problem_2 {
    private static final int maximum = 4000000;

    public static void main(String[] args) {
        int fib1 = 1;
        int fib2 = 2;
        int sum_of_evens = 0;

        while (fib2 < maximum) {
            if (fib2 % 2 == 0) {
                sum_of_evens = sum_of_evens + fib2;
            }

            int temp = fib1 + fib2;
            fib1 = fib2;
            fib2 = temp;
        }

        System.out.println(sum_of_evens);
    }
}
