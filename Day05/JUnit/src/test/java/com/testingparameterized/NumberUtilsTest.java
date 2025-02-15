import com.testingparameterized.NumberUtils;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;
import org.junit.jupiter.api.extension.ParameterResolver;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(ParameterResolver.class)
class NumberUtilsTest {
    private final NumberUtils numberUtils = new NumberUtils();

    @ParameterizedTest
    @ValueSource(ints = {2, 4, 6, 7, 9})
    void testIsEven(int number) {
        boolean result = numberUtils.isEven(number);
        if (number % 2 == 0) {
            assertTrue(result, number + " should be even");
        } else {
            assertFalse(result, number + " should be odd");
        }
    }
}
