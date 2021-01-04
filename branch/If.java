package branch;

import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Arrays;
import java.util.Objects;

import static java.util.stream.Collectors.toList;
import org.junit.jupiter.api.Test;
import java.io.PrintStream;

public class If {
    public static void main(String... args) {
        PrintStream p = Objects.requireNonNull(System.out);
        Arrays.asList(-1).stream().forEach(i -> {
            if (i.intValue() > 0) {
                p.println("number: " + i.intValue());
            } else {
                p.println("number는 0 이하입니다.");
            }
        });
    }
}
