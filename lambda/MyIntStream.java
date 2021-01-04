package lambda;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class MyIntStream {
    public List<Integer> returnList(int a, int b) {
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

    public boolean matchEven(int a) {
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

    public void testBox() {
        IntStream i = IntStream.of(1, 2, 3, 4);
        Stream<Integer> s = i.boxed();
        s.forEach(System.out::print);
    }

    public static void main(String[] args) {
        MyIntStream mi = new MyIntStream();
        int a = mi.randomNum(1, 1);
        // System.out.println("Random: " + a);

        boolean t = mi.matchEven(2);
        // System.out.println(t);
        mi.testBox();
    }
}
