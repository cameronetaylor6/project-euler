public class problem_1 {
    private static final int maximum = 1000;

    public static void main(String[] args) {
        int i = 0;
        int sum = 0;

        while (i < maximum) {
            if (i % 3 == 0 || i % 5 == 0) {
                sum += i;
            }

            i = i + 1;
        }

        System.out.println(sum);
    }
}