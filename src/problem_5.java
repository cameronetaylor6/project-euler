public class problem_5 {
    public static void main(String[] args) {
        int i = 2520;

        boolean cont = true;
        while (cont) {
            cont = !is_divisible(i);
            i = i + 20;
        }
    }

    public static boolean is_divisible(int n) {
        for (int j = 19; j > 1; j--) {
            if (n % j != 0) {
                return false;
            }
        }
        System.out.println(n);
        return true;
    }
}
