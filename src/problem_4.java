public class problem_4 {
    public static void main(String[] args) {
        int val1 = 999;
        int val2 = 999;
        int palindrome = 0;

        while (val1 > 1) {
            while (val2 > 1) {
                int p = val1 * val2;
                if (p > palindrome && is_palindrome(Integer.toString(p))) {
                    palindrome = p;
                }
                val2 = val2 -1;
            }
            val2 = 999;
            val1 = val1 -1;
        }
        System.out.println(palindrome);
    }

    public static boolean is_palindrome(String s) {
        System.out.println(s);
        int size = s.length();
        int half_size = (int) Math.floor(size / 2);
        for (int i = 0; i < half_size; i++) {
            if (s.charAt(i) != s.charAt(size - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
