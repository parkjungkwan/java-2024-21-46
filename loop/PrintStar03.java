package loop;
// 별찍기 3번
// 공백은 " " 으로 표현 가능하다.
import java.util.Scanner;
public class PrintStar03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------");
        System.out.println("별찍기 3번");
        System.out.println("--------");
        System.out.print("출력할 줄 수: ");
        int userNumber = scanner.nextInt();
        for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
            //공백을 담당하는 j for 문
            for(int j = 1; j <= userNumber - i; j++) {
                stars += " ";
            }
            //별을 담당하는 j for 문
            for(int j = 1; j <= i; j++) {
                stars += "*";
            }
            
            System.out.println(stars);
        }
        
        scanner.close();
    }
}









