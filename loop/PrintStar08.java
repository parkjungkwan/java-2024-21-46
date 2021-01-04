package loop;

import java.util.Scanner;

// 별찍기 8번
public class PrintStar08 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--------");
        System.out.println("별찍기 8번");
        System.out.println("--------");
        System.out.print("출력할 줄 수: ");
        int userNumber = scanner.nextInt();
        for (int i = 1; i <= 2 * userNumber - 1; i++) {
            String stars = new String();
            if (i < userNumber) {
                // 윗부분을 담당하는 if문
                // userNumber가 5이면
                // i가 1, 2, 3, 4일때 여기로 들어온다.

                // 공백을 담당하는 j for 문
                for (int j = 1; j <= userNumber - i; j++) {
                    stars += " ";
                }

                // 별을 담당하는 j for 문
                for (int j = 1; j <= i; j++) {
                    stars += "*";
                }
            } else {
                // 아랫부분을 담당하는 if문
                // userNumber가 5일때
                // i가 5 6 7 8 9 일때 여기로 들어온다.

                // 이렇게 되면 우리가 기존에 썼던 j for 문의 방식이
                // 다 바껴야 된다
                // 왜냐하면 기존 j for문은 1, 2, 3, 4, 5를 기준으로 했기 때문!

                // 하지만 우린 더 좋은 방법이 있다.
                // 바로 새로운 변수를 만드는것!
                int lowerI = i - userNumber + 1;

                // 공백을 담당하는 j for 문
                for (int j = 1; j <= lowerI - 1; j++) {
                    stars += " ";
                }
                // 별을 담당하는 j for 문
                for (int j = lowerI; j <= userNumber; j++) {
                    stars += "*";
                }
            }

            System.out.println(stars);
        }

        scanner.close();
    }
}
