public class problem_6 {
    public static void main(String[] args) {
        int sum_of_squares = 0;
        int square_of_sum = 0;

        int max = 100;

        int sum = 0;
        for (int i = 1; i <= max; i++) {
            sum_of_squares = sum_of_squares + (i * i);
            sum = sum + i;
        }

        square_of_sum = sum * sum;

        System.out.println(square_of_sum - sum_of_squares);
    }
}
