import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NumbersTest {

    @Test
    void sumAll() {
        Numbers nums = new Numbers();
        int expected = 5;
        int actual = nums.sumAll(5);
        Assertions.assertEquals(expected, actual);
    }
}