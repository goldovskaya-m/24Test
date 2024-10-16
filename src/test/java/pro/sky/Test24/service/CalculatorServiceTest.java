package pro.sky.Test24.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @Test
    void getSummary_WhenCorrectParams_ThenReturnCorrectResult() {
        int a = 5;
        int b = 5;
        // int a = nextInt();
        //int b = nextInt();

        int expected = a + b;
        //when
        int actual = calculatorService.getSummary(a, b);
        //then
        assertEquals(expected, actual);
        //5 + 5 =10;
        //calculatorService.getSummary()
    }


    private void assertThatExceptionofType(Class<IllegalAccessException> illegalAccessExceptionClass) {
    }

    @Test
    void getSummaryWenNullParams_ThenThrowException() {
        //  try {
        //      calculatorService.getSummary(5, null);
        // } catch (IllegalArgumentException e) {
        //    return;
        //}
        // fail();
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getSummary(5, null));
    }

    @Test
    @DisplayName("Корректно вычитает 2 параметра")
    void getSubtraction() {
        int a = 5;
        int b = 5;
        int expected = a - b;
        int actual = calculatorService.getSubtraction(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void getSubtractionWenNullParams_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getSubtraction(5, null));
    }

    @Test
    void getMultiply_WhenCorrectParams_ThenReturnCorrectResult() {
        int a = 5;
        int b = 5;
        int expected = a * b;
        int actual = calculatorService.getMultiply(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void getMultiplyWenNullParams_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getMultiply(5, null));
    }

    @Test
    void getDivision_WhenCorrectParams_ThenReturnCorrectResult() {
        int a = 5;
        int b = 5;
        int expected = a / b;
        int actual = calculatorService.getDivision(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void getDivisionWenNullParams_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getDivision(5, null));
    }

    // @Test
    //void getDivision_WhenSecondParamIsZero_ThenThrowException() {
    //   assertThatExceptionofType(IllegalArgumentException.class).isThrownBy
    //            (() -> calculatorService.getDivision(5, 0));
//}


    @Test
    @DisplayName("Корректно умножает 2 параметра")
    void getMultiply() {
    }

    @Test
    @DisplayName("Корректно делит два параметра")
    void getDivision() {

    }

}
