import org.junit.Test;
import static edu.sulima.Task6.*;
import static org.junit.Assert.assertEquals;
public class Task6Test {
    @Test
    public void getNextBiggerTest1(){
        Integer expected = 21;
        Integer actual = getNextBigger(12);
        assertEquals(expected, actual);
    }

    @Test
    public void getNextBiggerTest2(){
        Integer expected = 531;
        Integer actual = getNextBigger(513);
        assertEquals(expected, actual);
    }

    @Test
    public void getNextBiggerTest3(){
        Integer expected = -1;
        Integer actual = getNextBigger(9);
        assertEquals(expected, actual);
    }

    @Test
    public void getNextBiggerTest4(){
        Integer expected = -1;
        Integer actual = getNextBigger(531);
        assertEquals(expected, actual);
    }

    @Test
    public void getNextBiggerTest5(){
        Integer expected = 768;
        Integer actual = getNextBigger(687);
        assertEquals(expected, actual);
    }
}
