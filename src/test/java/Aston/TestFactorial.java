package Aston;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import static Aston.Main.factorial;
import static org.junit.jupiter.api.Assertions.*;

class TestFactorial {

    @Test
    public void testZero() {
        int result = factorial(0);
        Assertions.assertEquals(1, result);
    }


    @Test
    public void testNumberFour() {
        int result = factorial(4);
        Assertions.assertEquals(24, result);
    }


    @Test
    public void testNumberMinus() throws IllegalArgumentException {
        try {
            int result = factorial(-8);
        } catch (IllegalArgumentException thrown) {
            Assertions.assertNotEquals("\"Число не может быть отрицательным\"", thrown.getMessage());
        }
    }
}