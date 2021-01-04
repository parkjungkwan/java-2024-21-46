package lambda;

import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyIntStream {
    // 1.
    public List<Integer> rangeTest(int a, int b) {
        return IntStream.range(a, b).boxed().collect(Collectors.toList());
    }

    // 2.
    private static boolean evenNumber(int i) {
        return i % 2 == 0;
    }

    public boolean allMatchEvenTest(int a) {
        return IntStream.of(a).allMatch(MyIntStream::evenNumber);
    }

    // 3.
    public List<Integer> ofBoxTest() {
        return IntStream.of(1, 2, 3, 4).boxed().collect(Collectors.toList());
    }

    // 4.
    public List<Integer> concatTest() {
        return Stream.concat(IntStream.of(1, 2).boxed(), Stream.of(3)).collect(Collectors.toList());
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

    // 19
    public List<Integer> rangeClosedTest() {
        return IntStream.rangeClosed(1, 5).boxed().collect(Collectors.toList());
    }

    // 20
    public int reduceTest(int x, int y) {
        return IntStream.rangeClosed(x, y).reduce(0, (a, b) -> a + b);
    }

    // 21
    public List<Integer> sequentialTest() {
        return IntStream.rangeClosed(1, 5).sequential().boxed().collect(Collectors.toList());
    }

    // 22
    public List<Integer> parallelTest() {
        return IntStream.rangeClosed(1, 5).parallel().boxed().collect(Collectors.toList());
    }

    // 23
    public List<Integer> skipTest() {
        return IntStream.rangeClosed(1, 5).skip(3).boxed().collect(Collectors.toList());
    }

    // 24
    public List<Integer> sortTest() {
        /*
         * return IntStream.generate(() -> (int) (Math.random() *
         * 100)).limit(5).peek(System.out::println).sorted().boxed()
         * .collect(Collectors.toList());
         */
        return IntStream.of(3, 1, 5, 4, 2).sorted().boxed().collect(Collectors.toList());
    }

    public static void main(String[] args) {
        MyIntStream mi = new MyIntStream();
        System.out.println(mi.sortTest());

    }
}
