package loop;

// 가위 바위 보 게임
// 메뉴: 1. 플레이 2. 전적보기 3. 종료
// 1. 플레이시에는
//    사용자가 가위 바위 보 중에 하나를 고르게 한다.
//    단 가위는 1, 바위는 2, 보는 3 이고
//    만약 잘못된 값을 입력하면 다시 입력하게 한다.
//    컴퓨터도 마찬가지로 1~3 사이의 난수를 만들어서
//    사용자의 입력값과 비교해서
//    사용자 기준으로 승리, 무승부, 패배 3가지 중 하나를 기록한다.
// 2. 전적보기시에는
//    ###전 ###승 ###무 ###패 식으로 출력되게 한다.
//    단 아무런 플레이 기록도 없을 경우에는
//    "아직 플레이한 기록이 없습니다" 가 출력되게 한다.
import java.util.Scanner;
import java.util.Random;

public class RCP {
    final static int MAX = 3;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        int win = 0;
        int lose = 0;
        int draw = 0;
        while (true) {
            System.out.println("1. 가위바위보 2. 전적보기 3. 종료");
            int userChoice = sc.nextInt();

            if (userChoice == 1) {
                // 먼저 rand를 이용해서 컴퓨터의 선택을 만들어주자
                int computerNumber = rand.nextInt(MAX) + 1;

                // 사용자로부터 숫자를 입력받되, 만약 1~3이 아닐경우엔 다시 입력을 받자
                System.out.print("가위(1) 바위(2) 보(3) 를 선택해주세요: ");
                int userNumber = sc.nextInt();

                while (userNumber < 1 || userNumber > 3) {
                    System.out.println("잘못 선택하셨습니다.");
                    System.out.print("가위(1) 바위(2) 보(3) 를 선택해주세요: ");
                    userNumber = sc.nextInt();
                }

                // 승-무승부-패배는 다음과 같은 로직을 가진다
                // 1. 사용자의 숫자와 컴퓨터의 숫자가 같을 경우 = 무승부
                // 2. 그외
                // A. 사용자가 1을 선택했을 경우
                // 가. 컴퓨터가 2면 패배 그외는 승리
                // B. 사용자가 2를 선택했을 경우
                // 가. 컴퓨터가 3이면 패배 그외는 승리
                // C. 사용자가 3을 선택했을 경우
                // 가. 컴퓨터가 1이면 패배 그외는 승리

                // 컴퓨터의 선택과 사용자의 선택을 보여준다.
                String computerRCP = rcpSetter(computerNumber);
                String userRCP = rcpSetter(userNumber);

                

                System.out.println("컴퓨터의 선택: " + computerRCP);
                System.out.println("사용자의 선택: " + userRCP);

                // 1. 사용자의 숫자와 컴퓨터의 숫자가 같을 경우
                if (userNumber == computerNumber) {
                    draw++;
                    System.out.println("비겼습니다.");
                } else {
                    if (userNumber == 1) {
                        // 가위에 대한 승패 계산
                        if (computerNumber == 2) {
                            // 컴퓨터가 바위를 냈으므로 패배
                            lose++;
                            System.out.println("사용자 패배");
                        } else {
                            // 컴퓨터가 가위도 바위도 아니므로(=보자기이므로)
                            // 승리
                            win++;
                            System.out.println("사용자 승리");
                        }
                    } else if (userNumber == 2) {
                        // 바위에 대한 승패 계산
                        if (computerNumber == 3) {
                            // 컴퓨터가 보를 냈으므로 패배
                            lose++;
                            System.out.println("사용자 패배");
                        } else {
                            // 컴퓨터가 바위도 보도 아니므로(=가위이므로)
                            // 승리
                            win++;
                            System.out.println("사용자 승리");
                        }
                    } else if (userNumber == 3) {
                        // 보에 대한 승패 계산
                        if (computerNumber == 1) {
                            // 컴퓨터가 가위를 냈으므로 패배
                            lose++;
                            System.out.println("사용자 패배");
                        } else {
                            // 컴퓨터가 보도 가위도 아니므로(=바위이므로)
                            // 승리
                            win++;
                            System.out.println("사용자 승리");
                        }
                    }
                }

            } else if (userChoice == 2) {
                // 만약 플레이 기록이 없으면 "아직 한판도 안했다" 메시지를 띄어주자
                int total = win + lose + draw;
                if (total == 0) {
                    System.out.println("아직 플레이한 기록이 없습니다.");
                } else {
                    // 플레이 기록이 존재하므로 메시지 출력
                    System.out.printf("%03d전 %03d승 %03d무 %03d패\n", total, win, draw, lose);
                }
            } else if (userChoice == 3) {
                System.out.println("플레이해주셔서 감사합니다.");
                break;
            } else {
                System.out.println("잘못 입력하셨습니다.");
            }

        }

        sc.close();
    }

    static String rcpSetter(int value) {
        switch (value) {
        case 1:
            return "가위";
        case 2:
            return "바위";
        case 3:
            return "보";
        default:
            return "";
        }
    }

}










