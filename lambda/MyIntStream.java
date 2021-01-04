package lambda;

import java.util.HashMap;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyIntStream {
    // 1
    public List<Integer> rangeTest(int a, int b) {
        /*
         * Step 1. Classic Java List<Integer> ls = new ArrayList<>(); for (int i = 1; i
         * < 5; i++) { ls.add(i); }
         */
        // Step 2. Arrays
        // Arrays.asList(new Integer[] { 1, 2, 3, 4 })

        // Step 3. IntStream

        return IntStream.range(a, b).boxed().collect(Collectors.toList());
    }

    // 2. allMatch()
    private static boolean evenNumber(int i) {
        return i % 2 == 0;
    }

    public boolean allMatchEvenTest(int a) {
        return IntStream.of(a).allMatch(MyIntStream::evenNumber);
    }

    // 3. of()
    public Stream<Integer> ofBoxTest() {
        // returns a Stream consisting of the elements of this stream
        return IntStream.of(1, 2, 3, 4).boxed();
    }

    // 4.
    public Stream<Object> concatTest() {
        return Stream.concat(IntStream.of(1, 2).boxed(), Stream.of("Three"));
    }

    // 5.
    public List<Integer> collectTest() {
        return IntStream.range(1, 11).filter(i -> i % 2 == 0).boxed().collect(Collectors.toList());
    }

    // 6.
    public double averageTest(int a, int b) {
        // return IntStream.range(a, b).average().orElseThrow(RuntimeException::new);
        return IntStream.range(a, b).average().orElse(-1); // 위의 간략한 표기
    }

    // 7.
    public List<Integer> builderTest() {
        return IntStream.builder().add(1).add(2).add(3).build().boxed().collect(Collectors.toList());
    }

    // 8.
    public IntSummaryStatistics summaryStatisticsTest(int a, int b, int c, int d) {
        return IntStream.concat(IntStream.range(a, b), IntStream.range(c, d)).summaryStatistics();
    }

    // 9.
    public long countTest(int a, int b) {
        return IntStream.range(a, b).count();
    }

    // 10.
    public List<Integer> distinctTest() {
        return IntStream.of(4, 3, 4, 5, 2, 7, 3).distinct().boxed().collect(Collectors.toList());
    }

    // 11
    public long emptyTest() {
        return IntStream.empty().count();
    }

    // 12
    public int findFirstTest() {
        return IntStream.of(1, 2, 3).findFirst().orElse(-1);
    }

    // 13
    public List<Integer> flatMapTest() {
        return IntStream.of(2).flatMap(MyIntStream::iter).boxed().collect(Collectors.toList());
    }

    private static IntStream iter(int i) {
        return IntStream.iterate(i, j -> j + i).limit(5);
    }

    // 14
    public List<Integer> generateTest() {
        return IntStream.generate(() -> (int) (Math.random() * 100)).limit(5).boxed().collect(Collectors.toList());
    }

    // 15
    public List<Integer> iterateTest() {
        return IntStream.iterate(10, i -> i + 5).limit(5).boxed().collect(Collectors.toList());
    }

    // 16
    public List<Integer> mapTest(int a, int b) {
        return IntStream.range(a, b).map(i -> i * 2).boxed().collect(Collectors.toList());
    }

    // 17
    public int maxTest() {
        return IntStream.range(1, 5).max().orElse(-1);
    }

    // 18
    public boolean peekTest() {
        return IntStream.iterate(1, i -> 1 + 5).limit(5).peek(System.out::println).noneMatch(i -> i % 3 == 0);
    }

    public static void main(String[] args) {
        MyIntStream mi = new MyIntStream();
        // 1.
        System.out.println(mi.rangeTest(1, 5));
        // 2.
        // System.out.println(mi.allMatchEvenTest(2));
        // 3. mi.ofBoxTest().forEach(System.out::print);
        // 4. mi.concatTest().forEach(System.out::print);
        // 5. System.out.println(mi.collectTest());
        // 6. System.out.println(mi.averageTest(1, 6));
        // 7. System.out.println(mi.builderTest());
        // 8. System.out.println(mi.summaryStatisticsTest(1, 5, 100, 105));
        // 9. System.out.println(mi.countTest(0, 100));
        // 10. System.out.println(mi.distinctTest());
        // 11. System.out.println(mi.emptyTest());
        // 12. System.out.println(mi.findFirstTest());
        // 13. System.out.println(mi.flatMapTest());
        // 14. System.out.println(mi.generateTest());
        // 15. System.out.println(mi.iterateTest());
        // 16.
        // System.out.println(mi.mapTest(1, 5));
        // 17. System.out.println(mi.maxTest());
        // System.out.println(mi.peekTest());

    }
}
