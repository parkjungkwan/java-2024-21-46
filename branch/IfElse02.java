package branch;
// 사용자로부터 숫자를 입력받아서
// 홀수, 짝수를 출력하는 프로그램을 작성해주세요. (40분까지)
import java.util.Scanner;

public class IfElse02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("숫자: ");
        int number = scanner.nextInt();
        
        if(number % 2 == 1) {
            System.out.println("홀수입니다.");
        }else {
            System.out.println("짝수입니다.");
        }
        
        scanner.close();
    }
}
