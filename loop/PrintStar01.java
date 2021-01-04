package loop;
// 별찍기 1번
import java.util.Scanner;
public class PrintStar01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------");
        System.out.println("별찍기 1번");
        System.out.println("--------");
        System.out.print("출력할 줄 수: ");
        int userNumber = scanner.nextInt();
        // i for 문은 세로 줄수를 결정한다.
        // 그리고 j for문은 해당 줄에 출력할 별의 갯수 혹은 공백의 갯수를 담당한다.
        for(int i = 1; i <= userNumber; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}
