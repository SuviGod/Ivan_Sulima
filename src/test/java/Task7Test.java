import org.junit.Test;
import static edu.sulima.Task7.*;
import static org.junit.Assert.assertEquals;

public class Task7Test {
    @Test
    public void getIpv4Test1(){
        String expected = "128.32.10.1";
        String actual = getIpv4(2149583361L);
        assertEquals(expected, actual);
    }

    @Test
    public void getIpv4Test2(){
        String expected = "0.0.0.0";
        String actual = getIpv4(0L);
        assertEquals(expected, actual);
    }

    @Test
    public void getIpv4Test3(){
        String expected = "0.0.0.32";
        String actual = getIpv4(32L);
        assertEquals(expected, actual);
    }
}
