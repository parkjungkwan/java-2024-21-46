package hello;

public class MyCalculator {

    @FunctionalInterface
    interface Calc {
        int execute(int num1, int num2);
    }

    public int operate(int a, int b, Calc calc) {
        return calc.execute(a, b);
    }

    public int plus(int a, int b) {
        return operate(a, b, (x, y) -> x + y);
    }

    public int minus(int a, int b) {
        return operate(a, b, (x, y) -> x - y);
    }

    public int multi(int a, int b) {
        return operate(a, b, (x, y) -> x * y);
    }

    public int divide(int a, int b) {
        return operate(a, b, (x, y) -> x / y);
    }

}