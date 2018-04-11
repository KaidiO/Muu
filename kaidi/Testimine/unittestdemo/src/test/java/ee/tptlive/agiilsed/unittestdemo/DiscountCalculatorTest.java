package ee.tptlive.agiilsed.unittestdemo;


import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class DiscountCalculatorTest {

    @Test
    public void DiscountCalculatorTest_Age6_DEFAULT() {
        // given
        int input = 6;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DEFAULT);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_Age6_DISABLED() {
        // given
        int input = 6;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DISABLED);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_Age6_STUDENT() {
        // given
        int input = 6;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.STUDENT);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_Age6_VIP() {
        // given
        int input = 6;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.VIP);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeSmallerThen18_DEFAULT() {
        // given
        int input = 17;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DEFAULT);

        // then
        assertEquals(0.75, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeSmallerThen18_DISABLED() {
        // given
        int input = 17;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DISABLED);

        // then
        assertEquals(0.9, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeSmallerThen18_VIP() {
        // given
        int input = 17;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.VIP);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeSmallerThen18_STUDENT() {
        // given
        int input = 17;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.STUDENT);

        // then
        assertEquals(0.75, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeBiggerThen7_DEFAULT() {
        // given
        int input = 7;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DEFAULT);

        // then
        assertEquals(0.75, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeBiggerThen7_DISABLED() {
        // given
        int input = 7;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DISABLED);

        // then
        assertEquals(0.9, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeBiggerThen7_VIP() {
        // given
        int input = 7;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.VIP);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeBiggerThen7_STUDENT() {
        // given
        int input = 7;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.STUDENT);

        // then
        assertEquals(0.75, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs18_DEFAULT() {
        // given
        int input = 18;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DEFAULT);

        // then
        assertEquals(0, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs18_STUDENT() {
        // given
        int input = 18;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.STUDENT);

        // then
        assertEquals(0.5, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs18_VIP() {
        // given
        int input = 18;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.VIP);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs18_DISABLED() {
        // given
        int input = 18;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DISABLED);

        // then
        assertEquals(0.9, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsMoreThen18_DEFAULT() {
        // given
        int input = 19;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DEFAULT);

        // then
        assertEquals(0, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsMoreThen18_STUDENT() {
        // given
        int input = 19;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.STUDENT);

        // then
        assertEquals(0.5, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsMoreThen18_DISABLED() {
        // given
        int input = 19;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DISABLED);

        // then
        assertEquals(0.9, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsMoreThen18_VIP() {
        // given
        int input = 19;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.VIP);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs26_DEFAULT() {
        // given
        int input = 26;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DEFAULT);

        // then
        assertEquals(0, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs26_STUDENT() {
        // given
        int input = 26;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.STUDENT);

        // then
        assertEquals(0.5, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs26_VIP() {
        // given
        int input = 26;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.VIP);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs26_DISABLED() {
        // given
        int input = 26;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DISABLED);

        // then
        assertEquals(0.9, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsMoreThen26_DEFAULT() {
        // given
        int input = 27;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DEFAULT);

        // then
        assertEquals(0, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsMoreThen26_STUDENT() {
        // given
        int input = 27;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.STUDENT);

        // then
        assertEquals(0, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsMoreThen26_VIP() {
        // given
        int input = 27;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.VIP);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsMoreThen26() {
        // given
        int input = 27;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DISABLED);

        // then
        assertEquals(0.9, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsLessThen70_DEFAULT() {
        // given
        int input = 69;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DEFAULT);

        // then
        assertEquals(0, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsLessThen70_STUDENT() {
        // given
        int input = 69;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.STUDENT);

        // then
        assertEquals(0, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsLessThen70_VIP() {
        // given
        int input = 69;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.VIP);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIsLessThen70() {
        // given
        int input = 69;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DISABLED);

        // then
        assertEquals(0.9, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs70_DEFAULT() {
        // given
        int input = 70;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DEFAULT);

        // then
        assertEquals(0.9, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs70_DISABLED() {
        // given
        int input = 70;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.DISABLED);

        // then
        assertEquals(0.9, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs70_VIP() {
        // given
        int input = 70;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.VIP);

        // then
        assertEquals(1, result, 0.01);
    }

    @Test
    public void DiscountCalculatorTest_AgeIs70_STUDENT() {
        // given
        int input = 70;

        // when
        double result = new DiscountCalculator().calculateDiscount(input, DiscountCalculator.PersonStatus.STUDENT);

        // then
        assertEquals(0.9, result, 0.01);
    }
}
