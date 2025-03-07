import org.example.MathUtils;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class MathUtilsTest {

    @Test
    void testFactorial(){
        assertEquals(1, MathUtils.factorial(0), "Факториал 0 должен быть 1");
        assertEquals(1, MathUtils.factorial(1), "Факториал 1 должен быть 1");
    }

    @Test
    void testFactorialIsNegative(){
        IllegalArgumentException ex = assertThrows(IllegalArgumentException.class,
                () ->
                        MathUtils.factorial(-1));
        assertTrue(ex.getMessage().contains("Факториал не определён"));
    }

    @Test
    void testSqrt(){
        assertEquals(0, MathUtils.sqrt(0));
        assertEquals(1, MathUtils.sqrt(1));
    }

    @Test
    void testPower(){
        assertEquals(8, MathUtils.power(2, 3));
        assertEquals(1, MathUtils.power(5, 0));
    }

    @Test
    void testDivision(){
        assertEquals(5, MathUtils.divide(10, 2));
        assertEquals(2, MathUtils.divide(20, 10));
        assertEquals(5, MathUtils.divide(15, 3));
    }

    @Test
    void testDivisionByZero(){
        ArithmeticException ex = assertThrows(
                ArithmeticException.class,
                () ->
                        MathUtils.divide(10, 0)
        );
        assertTrue(ex.getMessage().contains("Деление на ноль"));
    }

    @Test
    void testGcd(){
        assertEquals(4, MathUtils.gcd(12, 8));
        assertEquals(20, MathUtils.gcd(100, 80));
        assertEquals(5, MathUtils.gcd(0, 5));
    }

}