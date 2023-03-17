import org.junit.Test;
import static edu.sulima.Task5.*;
import static org.junit.Assert.*;
public class Task5Test {
    @Test
    public void sortGuestsTest1(){
        String rawString = "Fred:Corwill;Wilfred:Corwill;Barney:Tornbull;Betty:Tornbull;Bjon:Tornbull;Raphael:Corwill;Alfred:Corwill";
        String actual = sortGuests(rawString);
        String expected = "(CORWILL, ALFRED)(CORWILL, FRED)(CORWILL, RAPHAEL)(CORWILL, WILFRED)(TORNBULL, BARNEY)(TORNBULL, BETTY)(TORNBULL, BJON)";
        assertEquals(expected, actual);
    }
}
