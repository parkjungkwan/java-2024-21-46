package lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyIntStream {

    // 1.
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

    public static boolean evenNumber(int i) {
        return i % 2 == 0;
    }

    public static boolean oddNumber(int i) {
        return i % 2 != 0;
    }

    // 2. allMatch()
    public boolean allMatchEvenTest(int a) {
        return IntStream.of(a).allMatch(MyIntStream::evenNumber);
    }

    public int randomNum(int a, int b) {

        return (int) ((Math.random() * b) + a);
    }

    public Map<String, Object> returnMap() {
        Map<String, Object> map = new HashMap<>();
        map.put("1", "a");
        map.put("2", "b");
        map.put("3", "c");
        map.put("4", "e");

        return map;
    }

    // 3. of()
    public Stream<Integer> ofBoxTest() {
        // returns a Stream consisting of the elements of this stream
        return IntStream.of(1, 2, 3, 4).boxed();
    }

    public static void main(String[] args) {
        MyIntStream mi = new MyIntStream();
        System.out.println("Random: " + mi.randomNum(1, 1));
        System.out.println(mi.allMatchEvenTest(2));
        mi.ofBoxTest().forEach(System.out::print);
    }
}
