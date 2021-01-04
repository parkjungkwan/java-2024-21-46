package lambda;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.Arrays.asList;

public class MyIntStreamTest {
    MyIntStream le = new MyIntStream();

    // 1
    @Test
    public void rangeTest() {
        assertTrue(asList(1, 2, 3, 4).equals(le.rangeTest(1, 5)));
    }

    // 2
    @Test
    public void allMatchEvenTest() {
        assertTrue(le.allMatchEvenTest(2));
    }

    // 16
    @Test
    public void mapTest() {
        assertTrue(asList(2, 4, 6, 8).equals(le.mapTest(1, 5)));
    }

}
