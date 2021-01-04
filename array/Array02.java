package array;

import java.util.Scanner;

// 사용자로부터 점수 3개를 입력 받아서
// 그 3개의 총점, 평균을 보여주는 프로그램
public class Array02 {
    private static final int SIZE = 3;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] scoreArray = new int[SIZE];
        for(int i = 0; i < scoreArray.length; i++) {
            scoreArray[i] = ScannerUtil.nextInt(scanner, (i+1)+"번 시험 점수: ", 1, 100);    
        }
        
        int sum = 0;
        for(int i = 0; i < scoreArray.length; i++) {
            sum+= scoreArray[i];
        }
        double average = sum / (double)SIZE;
        System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
        
        scanner.close();
    }
}

















