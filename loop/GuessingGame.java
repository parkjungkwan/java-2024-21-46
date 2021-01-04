package loop;
// 숫자 맞추기 게임
// 컴퓨터가 임의로 만든 숫자(=난수)를
// 사용자가 알아맞추는 게임.
// 만약 사용자가 입력한 숫자가 컴퓨터 난수보다 크면
// "DOWN" 이라고 출력되고
// 작으면 "UP" 이라고 출력된다.
// 또한 사용자의 최고기록을 보관을 해서
// 만약 메뉴에서 최고기록 보기를 하면
// 해당 최고 기록을 볼수 있게 한다.
// 플레이가 끝날 때, 최고 기록이 바뀌는 경우도 반영한다.

// 난수를 담당하는 Random 클래스를 import 해주자
import java.util.Random;
// 입력을 담당하는 Scanner 클래스를 import 해주자
import java.util.Scanner;

public class GuessingGame {
    final static int MAX = 100;
    public static void main(String[] args) {
        //스캐너 클래스 변수를 만들어주자
        Scanner scanner = new Scanner(System.in);
        //랜덤 클래스 변수를 만들어주자
        Random random = new Random();
        
        //최고기록을 보관할 int 변수를 만들어주자
        int bestScore = 0;
        
        while(true) {
            System.out.println("1. 플레이 2. 최고기록 보기 3. 종료");
            System.out.print("> ");
            int userChoice = scanner.nextInt();
            if(userChoice == 1) {
                // 숫자 맞추기 게임 코드
                
                // 1. 컴퓨터 난수를 만들어서 변수에 저장
                //    Random 클래스 변수 를 사용할 때에는
                //    우리가 필요한 난수의 데이터타입에 맞추어
                //    next~~~ 메소드를 실행해주면 된다.
                //    메소드 ()안에 우리가 숫자를 집어넣으면
                //    0부터 그 숫자 - 1 사이의 난수가 생성된다.
                //    만약 아무런 숫자도 넣어주지 않으면 
                //    해당 데이터타입의 범위내에서 정해지게 된다!
                
                // int computerNumber = random.nextInt(MAX);
                // 위의 코드는 computerNumber에 0~99 까지의 값이 들어가게 된다.
                // 하지만 우리가 필요한건 1~100이다. 어떻게 해주어야 할까?
                // 메소드의 결과값에 무조건 + 1하게 해주면 된다.
                // 그렇다면 무슨 값이 나오더라도 1 증가하기 때문에
                // 1~100 사이의 숫자가 나오게 된다!
                
                int computerNumber = random.nextInt(MAX)+ 1;
                
                // 2. 컴퓨터 난수와 사용자 입력 숫자가 다른 동안 반복
                
                // computerNumber에는 1~100 사이의 숫자가 들어가있다.
                // 그렇다면 int userNumber를 0으로 초기화하고
                // while 조건식을 computerNumber != userNumber 라고 하면
                // 무조건 1번은 실행되지 않을까?
                
                // 사용자가 입력할 숫자를 저장할 변수
                int userNumber = 0;
                
                // 이번 라운드의 사용자 점수를 저장할 변수
                int score = 0;
                
                while(userNumber != computerNumber) {
                    System.out.print("숫자: ");
                    userNumber = scanner.nextInt();
                    
                    //userNumber와 computerNumber를 비교해서
                    // UP 혹은 Down을 출력해준다.
                    if(userNumber > computerNumber) {
                        System.out.println("DOWN");
                    }else if(userNumber < computerNumber) {
                        System.out.println("UP");
                    }
                    score++;
                }
                
                System.out.println("정답!!!");
                System.out.printf("총 %d회만에 맞추셨습니다!\n", score);
                
                // 3. 점수 비교하여 신기록일 경우 bestScore 갱신
                if(bestScore == 0 || score < bestScore) {
                    System.out.println("최고기록 갱신!");
                    bestScore = score;
                }
            }else if(userChoice == 2) {
                // 점수를 출력하는 코드
                
                // 만약 플레이어가 한번이라도 플레이 했다면
                // 최고기록은 0이 될수 없다!
                // if-else 구조를 사용해서
                // bestScore가 0이면, 
                // "아직 플레이한 기록이 없습니다" 라는 메시지를 출력하고
                // 그 외에는 "현재 최고기록은 ##회 입니다!" 라고 출력되게 만들어주자
                if(bestScore == 0) {
                    System.out.println("아직 플레이한 기록이 없습니다!");
                }else {
                    System.out.printf("현재 최고 기록은 %d회 입니다!\n", bestScore);
                }
                
            }else if(userChoice == 3) {
                //메시지 출력후 while 종료
                System.out.println("플레이해주셔서 감사합니다.");
                break;
            }else {
                System.out.println("잘못입력하셨습니다.");
            }
        }
        
        
        // 버퍼메모리를 참조하는 스캐너를 닫아주자
        scanner.close();
    }
}



















