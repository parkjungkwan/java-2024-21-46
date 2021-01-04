package lambda;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.stream.Collectors;

public class MyIntStreamTest {
    MyIntStream le = new MyIntStream();

    @Test
    public void rangeTest() {
        assertEquals("1234", le.rangeTest(1, 5).stream().map(i -> String.valueOf(i)).collect(Collectors.joining()));
    }

    @Test
    public void allMatchEvenTest() {
        assertTrue(le.allMatchEvenTest(2));
    }

}
