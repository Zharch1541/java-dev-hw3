import calc.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class SumCalculatorTest {

    private SumCalculator sumCalculator;

    @BeforeEach
    public void beforeEach() {
        sumCalculator = new SumCalculator();
    }

    @Test
    public void testThatCalculateSumForNumOne() {
        int actual = 1;
        Assertions.assertEquals(1, sumCalculator.sum(actual));
    }

    @Test
    public void testThatCalculateSumForNumThree() {
        int actual = 3;
        Assertions.assertEquals(6, sumCalculator.sum(actual));
    }

    @Test
    public void testThatCalculateSumForNumNullThrowIllegalArgumentExeption() {
        int[] illegalNumbers = {0, -2};
        for (int illegalNumber : illegalNumbers) {
            Assertions.assertThrows(IllegalArgumentException.class, () -> sumCalculator.sum(illegalNumber));
        }
    }
}