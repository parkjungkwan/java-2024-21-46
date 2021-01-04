package loop;
// for 문의 다양한 예제
import java.util.Scanner;
public class For02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //1. 1부터 사용자가 입력한 숫자까지를 한줄씩 출력하는
        //   for문을 작성하세요 (5분)
        System.out.print("숫자: ");
        int number = scanner.nextInt();
        
        for(int i = 1; i <= number; i++) {
            System.out.println(i);
        }
        
        //2. 1부터 사용자가 새로 입력한 숫자까지의 합을 구하는
        //   for문을 작성하세요
        
        //   이문제 같은 경우에는 합을 보관할 변수가 밖에 선언과 초기화 되어야
        //   for문이 반복되더라도 그 값이 남아있게 된다.
        int sum = 0;
        System.out.print("합을 구할 숫자: ");
        number = scanner.nextInt();
        for(int i = 1; i <= number; i++) {
            sum += i;
        }
        
        System.out.printf("1부터 %d까지의 합: %d\n", number, sum);
        
        // 3. 1부터 사용자가 입력한 숫자까지의
        //    홀수들만 출력하시오
        System.out.print("숫자: ");
        number = scanner.nextInt();
        for(int i = 1; i <= number; i++) {
            if(i % 2 == 1) {
                System.out.printf("%d는 홀수입니다. \n", i);
            }
        }
        
        //4. 1부터 사용자가 입력한 숫자까지의 곱을 구하는 
        //   for문을 작성하세요.
        //   단, 사용자가 14보다 큰 수를 입력하면, 
        //   "오버플로우가 발생하기 때문에 계산할 수 없습니다" 라는
        //   메시지만 출력되게 작성하시오.
        
        System.out.print("곱을 구할 숫자: ");
        number = scanner.nextInt();
        int sigma = 1;
        if(number <= 14) {
            for(int i = 1; i <= number; i++) {
                sigma *= i;
            }
            System.out.printf("1부터 %d까지의 곱: %d\n", number, sigma);
        }else {
            System.out.println("오버플로우가 발생하기 때문에 계산할수 없습니다");
        }

        
        scanner.close();
                
    }
}

















