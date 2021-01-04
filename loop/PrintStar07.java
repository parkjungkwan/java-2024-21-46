package loop;

import java.util.Scanner;

// 별찍기 7번
public class PrintStar07 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------");
        System.out.println("별찍기 7번");
        System.out.println("--------");
        System.out.print("출력할 줄 수: ");
        int userNumber = scanner.nextInt();
        // 윗부분을 담당하는 i for 문
        for(int i = 1; i <= userNumber; i++) {
            String stars = new String();
            //별을 담당하는 j for 문
            for(int j = 1; j <= i; j++) {
                stars += "*";
            }
            System.out.println(stars);
        }
        
        // 아랫부분을 담당하는 i for 문
        for(int i = 2; i <= userNumber; i++) {
            String stars = new String();
            for(int j = i; j <= userNumber; j++) {
                stars += "*";
            }
            
            System.out.println(stars);
        }
        
        scanner.close();
    }
}













