package chat01;


import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {

    @Test
    void addTest() {
        int result = StringCalculator.add(1, 3);
        assertThat(result).isEqualTo(4);
    }

    @Test
    void subtractTest() {
        int result = StringCalculator.subtract(1, 3);
        assertThat(result).isEqualTo(-2);
    }

}
