package branch;

// 사용자로부터 점수를 입력받아서
// 90점이상: A
// 80점이상: B
// 70점이상: C
// 60점이상: D
// 그외: F
//가 출력되는 프로그램을 작성해보세요 (25분까지)
import java.util.Scanner;

public class IfElseIF02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("점수: ");
        int score = scanner.nextInt();
        
        System.out.println("점수 검증이 안된 if else 구조");
        // 이 아래의 if else 구조는
        // 점수가 올바른지 검증이 안되어있는 상태이다.
        // 그렇기 때문에 올바르지 않은 점수를 입력하면
        // 잘못된 결과가 나오게 된다.
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 80) {
            System.out.println("B");
        } else if (score >= 70) {
            System.out.println("C");
        } else if (score >= 60) {
            System.out.println("D");
        } else {
            System.out.println("F");
        }
        
        // 이렇게 올바르지 않은 값이 들어올때
        // 대응가능한 방법은 두가지가 있다.
        
        System.out.println("------------------");
        System.out.println("2. 범위를 빡빡하게 잡자");
        System.out.println("------------------");
        if (score >= 90 && score <= 100) {
            System.out.println("A");
        }else if(score >= 80 && score <= 89) {
            System.out.println("B");
        }else if(score >= 70 && score <= 79) {
            System.out.println("C");
        }else if(score >= 60 && score <= 69) {
            System.out.println("D");
        }else if(score >= 0 && score <= 59) {
            System.out.println("F");
        }else {
            System.out.println("잘못 입력하셨습니다.");
        }
        
        System.out.println("---------------------------");
        System.out.println("3. 점수가 올바를때만 if-else 실행");
        System.out.println("---------------------------");
        // 먼저 입력된 score가 올바른 범위인지 확인하고
        // 올바른 범위면
        // 1번처럼 조건을 간단하게 잡아도 된다.
        // 올바르지 않으면 
        // "잘못 입력하셨습니다"가 출력되게 만들어보자
        if(score >= 0 && score <= 100) {
            //올바른 점수형태이므로 if - else 구조 실행
            if (score >= 90) {
                System.out.println("A");
            } else if (score >= 80) {
                System.out.println("B");
            } else if (score >= 70) {
                System.out.println("C");
            } else if (score >= 60) {
                System.out.println("D");
            } else {
                System.out.println("F");
            }
        }else {
            //올바르지 않은 점수이므로 경고 메시지 출력
            System.out.println("잘못입력하셨습니다.");
        }
        
        // 데이터가 올바른지 안올바른지 확인하는 과정을
        // 검증 (validation) 이라고 한다.
        // 검증의 경우 조건식을 빡빡하게 잡는것보다
        // 틀린 값인지를 체크하는 방법이 더 쉽고 확실하다!
        
        scanner.close();
    }
}









