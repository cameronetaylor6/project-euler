public class problem_3 {
    public static void main(String[] args) {
        long maximum = 600851475143L;
        int max_root = root(maximum);
        for (int i = max_root; i > 0; i--) {
            if (maximum % i == 0 && is_prime(i)) {
                System.out.println(i);
                return;
            }
        }
    }

    public static boolean is_prime(int n) {
        System.out.println(n);
        int root = root(n);
        for (int i = 2; i <= root; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static int root(long n) {
        double root = Math.sqrt(n);
        return (int) Math.floor(root);
    }
}
