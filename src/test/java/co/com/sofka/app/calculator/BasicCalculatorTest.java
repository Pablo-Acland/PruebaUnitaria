package co.com.sofka.app.calculator;

import co.com.sofka.app.BasicCalculator;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BasicCalculatorTest {
    private final BasicCalculator basicCalculator = new BasicCalculator();

    @Test
    @DisplayName("Testing suma: 1+1=2")
    public void suma() {
        // Arrange
        Long number1 = 1L;
        Long number2 = 1L;
        Long expectedValue = 2L;

        // Act
        Long result = basicCalculator.suma(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing resta: 7-2=4")
    public void resta() {
        // Arrange
        Long number1 = 7L;
        Long number2 = 2L;
        Long expectedValue = 4L;

        // Act
        Long result = basicCalculator.resta(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing multiplicacion: 8*3=24")
    public void multiplicacion() {
        // Arrange
        Long number1 = 8L;
        Long number2 = 3L;
        Long expectedValue = 24L;

        // Act
        Long result = basicCalculator.multiplicacion(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }

    @Test
    @DisplayName("Testing division: 3/3=1")
    public void division() {
        // Arrange
        Long number1 = 3L;
        Long number2 = 3L;
        Long expectedValue = 1L;

        // Act

        Long result = basicCalculator.division(number1, number2);

        // Assert
        assertEquals(expectedValue, result);
    }
}
