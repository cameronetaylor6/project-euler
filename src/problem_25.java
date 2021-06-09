import java.math.BigInteger;

public class problem_25 {
    public static void main(String[] args) {
        int i = 2;
        BigInteger fib1 = BigInteger.ONE;
        BigInteger fib2 = BigInteger.ONE;

        while (fib2.toString().length() < 1000) {
            BigInteger temp = fib1.add(fib2);
            fib1 = fib2;
            fib2 = temp;
            i = i + 1;
        }

        System.out.println(i);
    }
}