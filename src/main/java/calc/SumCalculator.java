package calc;

public class SumCalculator {
    public int sum(int n) {
            int result = 0;

            if (n <= 0) {
                throw new IllegalArgumentException("Illegal value");
            }

            for (int i = 1; i <= n; i++) {
                result += i;
            }
            return result;
    }
}
