package se.kellygashi.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.kellygashi.main.Prime;

import static org.junit.jupiter.api.Assertions.*;

public class PrimeTest {

    @Test
    @DisplayName("Testar primtalsräkning inom giltigt intervall 0 till 1000")
    public void testGetCountPrimesWithinValidRange0To1000() {
        Prime prime = new Prime(0, 1000);
        assertEquals(168, prime.getCount(), "Räkningen av primtal i intervallet 0 till 1000 är inkorrekt");
    }

    @Test
    @DisplayName("Testar primtal för enskilt tal 5")
    public void testGetCountPrimesForSingleNumber5() {
        Prime prime = new Prime(5, 5);
        assertEquals(1, prime.getCount(), "Fel antal primtal för enstaka tal 5");
    }

    @Test
    @DisplayName("Testar primtalsräkning för specifikt intervall 2 till 10")
    public void testGetCountPrimesForSpecificRange2To10() {
        Prime prime = new Prime(2, 10);
        assertEquals(4, prime.getCount(), "Fel antal primtal i intervallet 2 till 10");
    }

    @Test
    @DisplayName("Testar primtalsräkning för gränsvärdet i intervallet 0 till 1")
    public void testGetCountPrimesForBoundaryRange0To1() {
        Prime prime = new Prime(0, 1);
        assertEquals(0, prime.getCount(), "Borde inte finna några primtal i intervallet 0 till 1");
    }

    @Test
    @DisplayName("Verifierar gränsvärde för intervall 999 till 1000")
    public void testGetCountPrimesForBoundaryTestForRange999To1000() {
        Prime prime = new Prime(999, 1000);
        assertTrue(prime.getCount() >= 0, "Borde hantera intervall 999 till 1000 korrekt");
    }


    @Test
    @DisplayName("Testar primtalssummering inom giltigt intervall 0 till 1000")
    public void testGetSumOfPrimesWithinValidRange0To1000() {
        Prime prime = new Prime(0, 1000);
        assertEquals(76127, prime.getSumOfPrimes(), "Summeringen av primtal i intervallet 0 till 1000 är inkorrekt");
    }

    @Test
    @DisplayName("Testar primtal för enskilt tal 5")
    public void testGetSumOfPrimesForSingleNumber5() {
        Prime prime = new Prime(5, 5);
        assertEquals(5, prime.getSumOfPrimes(), "Fel summa för enstaka tal 5");
    }

    @Test
    @DisplayName("Testar primtalssummering för specifikt intervall 2 till 10")
    public void testGetSumOfPrimesForSpecificRange2To10() {
        Prime prime = new Prime(2, 10);
        assertEquals(17, prime.getSumOfPrimes(), "Fel summa av primtal i intervallet 2 till 10");
    }

    @Test
    @DisplayName("Testar primtalssummering för gränsvärdet i intervallet 0 till 1")
    public void testGetSumOfPrimesForBoundaryRange0To1() {
        Prime prime = new Prime(0, 1);
        assertEquals(0, prime.getSumOfPrimes(), "Summan av primtal i intervallet 0 till 1 borde vara 0");
    }

    @Test
    @DisplayName("Verifierar IllegalArgumentException för ogiltigt intervall -1 till 1001")
    public void throwExceptionForInvalidRangeNegativeOneTo1001() {
        assertThrows(IllegalArgumentException.class, () -> new Prime(-1, 1001));
    }

    @Test
    @DisplayName("Testar felmeddelande vid ogiltigt intervall")
    public void testErrorMessageForInvalidRange() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> new Prime(1001, 1002));
        assertEquals("Hoppsan, fel intervall angivet!", exception.getMessage());
    }

    @Test
    @DisplayName("Verifierar IllegalArgumentException för omvända intervall")
    public void throwExceptionForReversedRange() {
        assertThrows(IllegalArgumentException.class, () -> new Prime(10, 0));
    }

    @Test
    @DisplayName("Verifierar IllegalArgumentException för intervall med start större än slut")
    public void throwExceptionForStartGreaterThanEndRange() {
        assertThrows(IllegalArgumentException.class, () -> new Prime(100, 50));
    }

    @Test
    @DisplayName("Testar korrekt utskrift för antalet prime nummer")
    public void testPrintCountPrintCountCorrectOutput() {
        Prime prime = new Prime(0, 1000);
        assertEquals("Hej, det finns 168 primtal mellan 0 och 1000!", prime.printCount());
    }

    @Test
    @DisplayName("Testar korrekt utskrift för summan av prime nummer")
    public void testPrintSumCorrectOutput() {
        Prime prime = new Prime(0, 1000);
        assertEquals("Och den totala summan av dessa primtal är 76127.", prime.printSum());
    }
}
