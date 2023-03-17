import static org.junit.Assert.*;
import static edu.sulima.Task3.digital_root;
import org.junit.Test;

public class Task3Test {
    @Test
    public void digital_rootTest1(){
        Integer expected = 7;
        Integer actual = digital_root(16);
        assertEquals(expected, actual);
    }

    @Test
    public void digital_rootTest2(){
        Integer expected = 6;
        Integer actual = digital_root(942);
        assertEquals(expected, actual);
    }

    @Test
    public void digital_rootTest3(){
        Integer expected = 6;
        Integer actual = digital_root(132189);
        assertEquals(expected, actual);
    }
}
