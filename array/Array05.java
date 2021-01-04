package array;

import java.util.Scanner;


// 사용자로부터 
// 1~5반의 학생수를 받고
// 그 학생들의 시험점수(0~100)을 받는 프로그램을 작성하시오
// 입력이 다 끝난 후에는
// ----1반----
// 1번: 몇점
// 2번: 몇점
// .....
// -----------
// 1번: 몇점
// .....
// 이런식으로 출력되게 프로그램을 작성하시오.
public class Array05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[][] scoreArray = new int[5][];
        // 각 반의 학생수 크기의 인트 배열을 준비하는 단계
        for(int i = 0; i < scoreArray.length; i++) {
            System.out.printf("%d반 학생의 수: ", (i+1));
            int classSize = scanner.nextInt();
            scoreArray[i] = new int[classSize];
            
        }
        // 각 반의 학생의 점수를 입력하는 for 문
        for(int i = 0; i < scoreArray.length; i++) {
            for(int j = 0; j < scoreArray[i].length; j++) {
                String message = (j+1)+"번 학생의 점수: ";
                scoreArray[i][j] = ScannerUtil.nextInt(scanner, message, 0, 100);
            }
        }
        
        // 각 반의 점수를 출력하는 for 문
        for(int i = 0; i < scoreArray.length; i++) {
            System.out.println("----------"+(i+1)+"반-------------");
            for(int j = 0; j < scoreArray[i].length; j++) {
                System.out.printf("%d번 학생의 점수: %d점\n", (j+1), scoreArray[i][j]);
            }
            System.out.println("----------------------------------");
        }
        
        
        scanner.close();
    }
}





















