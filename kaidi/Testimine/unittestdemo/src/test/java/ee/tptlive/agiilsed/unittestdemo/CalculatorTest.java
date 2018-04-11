package ee.tptlive.agiilsed.unittestdemo;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    @Test
    public void evaluate_0_IfInputIsNull() {
        // given
        String input = null;

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(0, result);
    }

    @Test
    public void evaluate_0_IfInputIsEmpty() {
        // given
        String input = "";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(0, result);
    }

    @Test
    public void evaluate_ReturnsGivenNumber_IfInputIsNumber() {
        // given
        String input = "100";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(100, result);
    }

    @Test
    public void evaluate_ReturnsGivenNumber_IfInputIsNegativeNumber() {
        // given
        String input = "-100";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(-100, result);
    }

    @Test
    public void evaluate_ReturnsSum_IfInputIsSingleSumOperation() {
        // given
        String input = "56+44";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(100, result);
    }

    @Test
    public void evaluate_ReturnsSum_IfInputIsMultipleSumOperation() {
        // given
        String input = "56+44+88+12+50";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(250, result);
    }

    @Test
    public void evaluate_ReturnsSum_IfInputIsMultipleSumOperationAndNegativeNumbers() {
        // given
        String input = "-50+88+12+50";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(100, result);
    }
    @Ignore
    @Test
    public void evaluate_ReturnsSum_IfInputIsMultipleSumOperationAndNegativeNumbersAnd_x() {
        // given
        String input = "70-50";

        // when
        int result = new Calculator().evaluate(input);

        // then
        assertEquals(20, result);
    }
    @Test
    public void evaluate_ReturnsSum_IfInputIsx() {
        // given
        String input = "x";
        int x = 50;

        // when
        int result = new Calculator().evaluate(input, x);

        // then
        assertEquals(50, result);
    }
    @Test
    public void evaluate_ReturnsSum_IfInputIsXWorksWithCapitalX() {
        // given
        String input = "X";
        int x = 50;

        // when
        int result = new Calculator().evaluate(input, x);

        // then
        assertEquals(50, result);
    }
    @Test (expected = IllegalArgumentException.class)
    public void evaluate_ReturnsSum_IfInputIsMoreThan100() {
        // given
        String input = "x";
        int x = 101;

        // when
        new Calculator().evaluate(input, x);
    }
    @Test (expected = IllegalArgumentException.class)
    public void evaluate_ReturnsSum_IfInputIsLessThen0() {
        // given
        String input = "x";
        int x = -1;

        // when
        int result = new Calculator().evaluate(input, x);

        // then
        assertEquals(-1, result);
    }
    @Test
    public void evaluate_ReturnsSum_IfInputIs0() {
        // given
        String input = "x";
        int x = 0;

        // when
        int result = new Calculator().evaluate(input, x);

        // then
        assertEquals(0, result);
    }
    @Test
    public void evaluate_ReturnsSum_IfInputIs100() {
        // given
        String input = "x";
        int x = 100;

        // when
        int result = new Calculator().evaluate(input, x);

        // then
        assertEquals(100, result);
    }
}