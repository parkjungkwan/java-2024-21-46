package array;

import java.util.Scanner;

// Ex04Array03에서
// 과목별로 배열을 만드는게 아니라
// 시험별로 배열을 만들어서 컨트롤 하는 프로그램
public class Array03B {
    private static final int SIZE = 3;
    private static final int SCORE_MAX = 100;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] firstArray = new int[SIZE];
        int[] secondArray = new int[SIZE];
        int[] thirdArray = new int[SIZE];
        int id = 0;
        String name = new String();

        System.out.print("번호: ");
        id = scanner.nextInt();

        System.out.print("이름: ");
        name = ScannerUtil.nextLine(scanner);

        // 매번 새로 입력해야됨.
        System.out.println("1회차");

        firstArray[0] = ScannerUtil.nextInt(scanner, "국어: ", 0, SCORE_MAX);
        firstArray[1] = ScannerUtil.nextInt(scanner, "영어: ", 0, SCORE_MAX);
        firstArray[2] = ScannerUtil.nextInt(scanner, "수학: ", 0, SCORE_MAX);
        
        System.out.println("2회차");

        secondArray[0] = ScannerUtil.nextInt(scanner, "국어: ", 0, SCORE_MAX);
        secondArray[1] = ScannerUtil.nextInt(scanner, "영어: ", 0, SCORE_MAX);
        secondArray[2] = ScannerUtil.nextInt(scanner, "수학: ", 0, SCORE_MAX);        
        
        System.out.println("3회차");

        thirdArray[0] = ScannerUtil.nextInt(scanner, "국어: ", 0, SCORE_MAX);
        thirdArray[1] = ScannerUtil.nextInt(scanner, "영어: ", 0, SCORE_MAX);
        thirdArray[2] = ScannerUtil.nextInt(scanner, "수학: ", 0, SCORE_MAX);
        
        int korean = firstArray[0];
        int english = firstArray[1];
        int math = firstArray[2];
        
        int sum = korean + english + math;
        double average = sum / (double)SIZE;
        
        System.out.println("1번 시험 결과");
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", 
                korean, english, math);
        System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
        System.out.println("-------------------------");
        
        
        scanner.close();
    }
}
















