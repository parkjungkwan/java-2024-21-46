package branch;
// 사용자로부터 이름, 국어, 영어, 수학 점수를 입력 받아서
// 총점이 210점 이상이고 모든 점수가 60점 이상이면 
// "### 학생님은 합격입니다" 가 출력되고
// 그외에는 모두 "### 학생님은 불합격입니다" 가 출력되는
// 프로그램을 작성하시오 (55분까지)
import java.util.Scanner;
public class IfElse03 {
    static final int SUM_STANDARD = 210;
    static final int INDIVIDUAL_STANDARD = 60;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("이름: ");
        String name = scanner.nextLine();
        
        System.out.print("국어: ");
        int korean = scanner.nextInt();
        
        System.out.print("영어: ");
        int english = scanner.nextInt();
        
        System.out.print("수학: ");
        int math = scanner.nextInt();
        
        //if - else 문
        int sum = korean + english + math;
        if(sum >= SUM_STANDARD && korean >= INDIVIDUAL_STANDARD
                && english >= INDIVIDUAL_STANDARD 
                && math >= INDIVIDUAL_STANDARD) {
            System.out.println(name+"학생님은 합격입니다.");
        }else {
            System.out.println(name+"학생님은 불합격입니다.");
        }
        
        scanner.close();
    }
}



















