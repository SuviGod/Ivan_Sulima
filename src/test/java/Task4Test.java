import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.Assert.*;
import static edu.sulima.Task4.*;

public class Task4Test {
    @Test
    public void countPairsTest1(){
        Integer expected = 4;
        Integer actual = countPairs(List.of(1, 3, 6, 2, 2, 0, 4, 5), 5);
        assertEquals(expected, actual);
    }

    @Test
    public void countPairsTest2(){
        Integer expected = 6;
        Integer actual = countPairs(List.of(1, 3, 6, 2, 2, 0, 4, 3, 5), 5);
        assertEquals(expected, actual);
    }

    @Test
    public void countPairsTest3(){
        Integer expected = 0;
        Integer actual = countPairs(List.of(10, 6, 15, 0), 5);
        assertEquals(expected, actual);
    }

    @Test
    public void countPairsTestStream1(){
        Long expected = 4L;
        Long actual = countPairsStream(List.of(1, 3, 6, 2, 2, 0, 4, 5), 5);
        assertEquals(expected, actual);
    }

    @Test
    public void countPairsTestStream2(){
        Long expected = 6L;
        Long actual = countPairsStream(List.of(1, 3, 6, 2, 2, 0, 4, 3, 5), 5);
        assertEquals(expected, actual);
    }

    @Test
    public void countPairsTestStream3(){
        Long expected = 0L;
        Long actual = countPairsStream(List.of(10, 6, 15, 0), 5);
        assertEquals(expected, actual);
    }

    @Test
    public void countPairsTestStream4(){
        Long expected = 2L;
        Long actual = countPairsStream(List.of(1, 3, 6, 2, 0, 4, 5), 4);
        assertEquals(expected, actual);
    }
}
