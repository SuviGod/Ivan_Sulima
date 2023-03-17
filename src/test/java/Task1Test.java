import edu.sulima.Task1;
import org.junit.Test;

import java.util.Arrays;
import java.util.List;

//import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.Assert.*;
public class Task1Test {
    @Test
    public void getIntegersFromListTest1(){
        List list = Task1.getIntegersFromList(Arrays.asList(1,2,'a','b'));
        assertEquals(list, Arrays.asList(1, 2));
    }

    @Test
    public void getIntegersFromListTest2(){
        List list = Task1.getIntegersFromList(Arrays.asList(1,2,'a','b',0,15));
        assertEquals(list, Arrays.asList(1, 2, 0, 15));
    }

    @Test
    public void getIntegersFromListTest3(){
        List list = Task1.getIntegersFromList(Arrays.asList(1,2,'a','b',"aasf",'1',"123",231));
        assertEquals(list, Arrays.asList(1, 2, 231));
    }
}
