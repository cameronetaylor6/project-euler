public class problem_7 {
    private static int[] primes = new int[10001];
    private static int count = 1;
    public static void main(String[] args) {
        int i = 3;
        primes[0] = 2;

        while (count < 10001) {
            if (is_prime(i)) {
                count = count + 1;
            }
            i = i + 2;
        }

        System.out.println(primes[10000]);
    }

    public static boolean is_prime(int n) {
        for (int i = 0; i < count; i++) {
            if (n % primes[i] == 0) {
                return false;
            }
        }
        primes[count] = n;
        return true;
    }

    public static int root(long n) {
        double root = Math.sqrt(n);
        return (int) Math.floor(root);
    }
}
