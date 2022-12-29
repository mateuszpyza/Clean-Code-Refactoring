package models;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class CalculatorTest {
    @Test
    void shouldReturnProperSumResults() {
        //given
        double firstValue = 1.5;
        double secondValue = 3.5;
        //when
        double result = Calculator.sum(firstValue, secondValue);
        //then
        Assertions.assertEquals(5, result);
    }

    @Test
    void shouldReturnProperSubtractionResults() {
        //given
        double firstValue = 8;
        double secondValue = 3;
        //when
        double result = Calculator.subtract(firstValue, secondValue);
        //then
        Assertions.assertEquals(5, result);
    }

    @Test
    void shouldReturnProperMultiplicationResults() {
        //given
        double firstValue = 2.5;
        double secondValue = 2;
        //when
        double result = Calculator.multiply(firstValue, secondValue);
        //then
        Assertions.assertEquals(5, result);
    }

    @Test
    void shouldReturnProperDivisionResults() {
        //given
        double firstValue = 125;
        double secondValue = 25;
        //when
        double result = Calculator.divide(firstValue, secondValue);
        //then
        Assertions.assertEquals(5, result);

    }

}