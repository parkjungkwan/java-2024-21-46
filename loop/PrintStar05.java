package loop;

import java.util.Scanner;

// 별찍기 5번
public class PrintStar05 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------");
        System.out.println("별찍기 5번");
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
            for(int j = 1; j <= 2*i - 1; j++) {
                stars += "*";
            }
            
            System.out.println(stars);
        }
        
        scanner.close();
    }
}














