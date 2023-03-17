import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static edu.sulima.Task2.first_non_repeating_letter;

public class Task2Test {
    @Test
    public void first_non_repeating_letterTest1(){
        String actualResult = first_non_repeating_letter("stress");
        String expectingResult = "t";
        assertEquals(actualResult, expectingResult);
    }

    @Test
    public void first_non_repeating_letterTest2(){
        String actualResult = first_non_repeating_letter("sTreSS");
        String expectingResult = "T";
        assertEquals(actualResult, expectingResult);
    }

    @Test
    public void first_non_repeating_letterTest3(){
        String actualResult = first_non_repeating_letter("sStTrReEsS");
        String expectingResult = "";
        assertEquals(actualResult, expectingResult);
    }
}
