package lambda;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;
import java.util.List;
import java.util.stream.Collectors;

public class MyIntStreamTest {
    MyIntStream le = new MyIntStream();

    @Test
    public void returnList() {
        assertEquals("1234", le.returnList(1, 5).stream().map(i -> String.valueOf(i)).collect(Collectors.joining()));
    }

    @Test
    public void judgeEven() {
        assertTrue(le.matchEven(2));
    }

    @Test
    public void randomNum(int a, int b) {
        assertEquals(1, le.randomNum(1, 1));
    }
}
