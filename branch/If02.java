package branch;
// 사용자로부터 숫자를 입력 받아서
// 홀수일때만 "홀수입니다" 라고 출력되는 프로그램을 작성하시오.
// 단 짝수일때는 아무런 반응이 없습니다. (25분까지)
import java.util.Scanner;
public class If02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자: ");
        int number = scanner.nextInt();
        if(number % 2 == 1) {
            System.out.println("홀수입니다.");
        }
        
        
        scanner.close();
    }
}
