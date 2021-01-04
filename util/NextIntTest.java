package util;

import java.util.Scanner;

public class NextIntTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자: ");
        int number = ScannerUtil.nextInt(scanner, "숫자: ", 0, 100);

        System.out.println("number: " + number);

        scanner.close();
    }
}
