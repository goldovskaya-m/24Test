package pro.sky.Test24.service;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.CsvSource;
import org.junit.jupiter.params.provider.MethodSource;
import pro.sky.Test24.exception.ZeroException;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThatExceptionOfType;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class CalculatorServiceTest {
    private final CalculatorService calculatorService = new CalculatorService();

    @ParameterizedTest
    @DisplayName("Корректно складывает два параметра")
    @CsvSource({"5,5", "100, 0", "5, -2" , "0, 6000"})
    void getSummary_WhenCorrectParams_ThenReturnCorrectResult(int a, int b) {
        int expected = a + b;
        int actual = calculatorService.getSummary(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void getSummaryWenNullParams_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getSummary(5, null));
    }
    @Test
    void getSummaryWenNullParams_ThenThrowException2() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getSummary(null, 12));
    }
    @Test
    void getSummaryWenNullParams_ThenThrowException3() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getSummary(null, null));
    }

    @ParameterizedTest
    @DisplayName("Корректно вычитает 2 параметра")
    @MethodSource("test")
    void getSubtraction( int a, int b) {
        int expected = a - b;
        int actual = calculatorService.getSubtraction(a, b);
        assertEquals(expected, actual);
    }
    private static Stream <Arguments> test(){
        return Stream.of(Arguments.of(100,5),
                Arguments.of(0,8));
    }

    @Test
    void getSubtractionWenNullParams_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getSubtraction(5, null));
    }
    @Test
    void getSubtractionWenNullParams_ThenThrowException2() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getSubtraction(null, 888));
    }

    @Test
    void getMultiply_WhenCorrectParams_ThenReturnCorrectResult() {
        int a = 5;
        int b = 5;
        int expected = a * b;
        int actual = calculatorService.getMultiply(a, b);
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @DisplayName("Корректно умножает два параметра")
    @MethodSource("test")
    void getMultiply( int a, int b) {
        int expected = a * b;
        int actual = calculatorService.getMultiply(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void getMultiplyWenNullParams_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getMultiply(5, null));
    }
    @Test
    void getMultiplyWenNullParams_ThenThrowException2() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getMultiply(null, 5));
    }

    @Test
    void getDivision_WhenCorrectParams_ThenReturnCorrectResult() {
        int a = 5;
        int b = 5;
        int expected = a / b;
        int actual = calculatorService.getDivision(a, b);
        assertEquals(expected, actual);
    }
    @ParameterizedTest
    @DisplayName("Корректно делит два параметра")
    @MethodSource("test")
    void getDivision( int a, int b) {
        int expected = a / b;
        int actual = calculatorService.getDivision(a, b);
        assertEquals(expected, actual);
    }

    @Test
    void getDivisionWenNullParams_ThenThrowException() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getDivision(5, null));
    }
    @Test
    void getDivisionWenNullParams_ThenThrowException2() {
        assertThrows(IllegalArgumentException.class, () -> calculatorService.getDivision(null, 5));
    }

     @Test
    void getDivision_WhenSecondParamIsZero_ThenThrowException() {
       assertThatExceptionOfType(ZeroException.class).isThrownBy
                (() -> calculatorService.getDivision(5, 0));
}


    @Test
    @DisplayName("Корректно умножает 2 параметра")
    void getMultiply() {
    }

    @Test
    @DisplayName("Корректно делит два параметра")
    void getDivision() {

    }

}
