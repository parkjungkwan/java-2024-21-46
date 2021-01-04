package lambda;

import org.junit.Test;

import static org.junit.jupiter.api.Assertions.*;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import static java.util.Arrays.asList;

public class MyIntStreamTest {
    MyIntStream le = new MyIntStream();

    @Test
    public void rangeTest() { // 1
        assertTrue(asList(1, 2, 3, 4).equals(le.rangeTest(1, 5)));
    }

    @Test
    public void allMatchEvenTest() { // 2
        assertTrue(le.allMatchEvenTest(2));
    }

    @Test
    public void ofBoxTest() { // 3
        assertTrue(asList(1, 2, 3, 4).equals(le.ofBoxTest()));
    }

    @Test
    public void concatTest() { // 4
        assertTrue(asList(1, 2, 3).equals(le.concatTest()));
    }

    @Test
    public void collectTest() { // 5
        assertTrue(asList(2, 4, 6, 8, 10).equals(le.collectTest()));
    }

    @Test
    public void averageTest() { // 6
        assertEquals(3.0, le.averageTest(1, 6));
    }

    @Test
    public void builderTest() { // 7
        assertTrue(asList(1, 2, 3).equals(le.builderTest()));
    }

    @Test
    public void summaryStatisticsTest() { // 8
        /*
         * IntSummaryStatistics stats = summaryStatisticsTest(1, 5, 100,
         * 105).mapToInt(toInt).sorted().skip(i) .summaryStatistics();
         * 
         * assertEquals(9, stats.getCount()); assertEquals(520, stats.getSum());
         * assertEquals(1, stats.getMin()); assertEquals(57.777778, stats.getAverage());
         * assertEquals(104, states.getMax());
         */
    }

    @Test
    public void countTest() { // 9
        assertEquals(100, le.countTest(0, 100));
    }

    @Test
    public void distinctTest() { // 10
        assertTrue(asList(4, 3, 5, 2, 7).equals(le.distinctTest()));
    }

    @Test
    public void emptyTest() { // 11
        assertEquals(0, le.emptyTest());
    }

    @Test
    public void findFirstTest() { // 12
        assertEquals(1, le.findFirstTest());
    }

    @Test
    public void flatMapTest() { // 13
        assertTrue(asList(2, 4, 6, 8, 10).equals(le.flatMapTest()));
    }

    @Test
    public void generateTest() { // 14
        assertTrue(asList(15, 80, 29, 36, 22).equals(le.generateTest()));
    }

    @Test
    public void iterateTest() { // 15
        assertTrue(asList(10, 15, 20, 25, 30).equals(le.iterateTest()));
    }

    @Test
    public void mapTest() { // 16
        assertTrue(asList(2, 4, 6, 8).equals(le.mapTest(1, 5)));
    }

    @Test
    public void maxTest() { // 17
        assertEquals(4, le.maxTest());
    }

    @Test
    public void peekTest() { // 18
        assertFalse(le.peekTest());
    }

    @Test
    public void rangeClosedTest() { // 19
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.rangeClosedTest()));
    }

    @Test // 20
    public void reduceTest() {
        assertEquals(55, le.reduceTest(1, 10));
    }

    @Test // 21
    public void sequentialTest() {
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.sequentialTest()));
    }

    @Test // 22
    public void parallelTest() {
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.parallelTest()));
    }

    @Test // 23
    public void skipTest() {
        assertTrue(asList(4, 5).equals(le.skipTest()));
    }

    @Test // 24
    public void sortTest() {
        assertTrue(asList(1, 2, 3, 4, 5).equals(le.sortTest()));
    }

}
