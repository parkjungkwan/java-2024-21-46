package loop;
// 사용자로부터 점수를 입력받아서
// 90이상: A
// 80~89: B
// 70~79: C
// 60~69: D
// 그외: F
// 가 출력되는 프로그램을 작성하시오.
// 단, 사용자가 올바르지 않은 점수를 입력하면
// 올바른 점수가 들어올때 까지 다시 입력을 받으세요.
import java.util.Scanner;


public class While03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수: ");
        int score= scanner.nextInt();
        
        while(score < 0 || score > 100) {
            System.out.println("잘못된 점수입니다.");
            System.out.print("점수: ");
            score = scanner.nextInt();
        }
        
        if(score >= 90) {
            System.out.println("A");
        }else if(score >= 80) {
            System.out.println("B");
        }else if(score >= 70) {
            System.out.println("C");
        }else if(score >= 60) {
            System.out.println("D");
        }else {
            System.out.println("F");
        }
        
        
        
        
        scanner.close();
    }
}
















