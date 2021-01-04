package loop;

import java.util.Random;
import java.util.Scanner;


// 숫자 맞추기 게임을 
// 메소드로 분리해서 유지보수가 쉽게 만들어보자

public class GuessingGame02 {
    private final static int MAX = 100;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu(scanner);
        scanner.close();
    }
    
    // 사용자가 입력한 숫자와 컴퓨터의 숫자를 비교해서
    // UP 혹은 DOWN 을 출력하는 메소드
    private static void printResult(int userNumber, int computerNumber) {
        if(userNumber > computerNumber) {
            System.out.println("↓↓↓ DOWN ↓↓↓");
        }else if(userNumber < computerNumber) {
            System.out.println("↑↑↑ UP ↑↑↑");
        }
    }
    
    // 사용자의 최고점수를 출력하는 메소드
    private static void printScore(int score) {
        if(score == 0) {
            System.out.println("아직 플레이한 기록이 없습니다.");
        }else {
            System.out.printf("현재 최고 기록: %02d회\n", score);
        }
    }
    
    // 현재점수와 최고점수를 비교해서 더 작은 숫자를 
    // return 해주는 setBestScore 메소드
    private static int setBestScore(int score, int bestScore) {
        if(bestScore == 0) {
            System.out.println("맨 처음 플레이하셔서 최고기록을 달성하셨습니다!");
            return score;
        }
        
        if(score < bestScore) {
            System.out.println("신기록 달성!");
            return score;
        }else {
            return bestScore;
        }
    }
    
    // 게임 플레이 기능
    // 단 매번 끝날때마다 최고 점수를 return해서
    // 메뉴 메소드에서 최고점수를 매번 갱신하게 한다.
    private static int play(Scanner scanner, int bestScore) {
        Random random = new Random();
        int userNumber = ScannerUtil.nextInt(scanner, "숫자: ", 1, MAX);
        int computerNumber = random.nextInt(MAX);
        int score = 1;
        
        while(userNumber != computerNumber) {
            printResult(userNumber, computerNumber);
            userNumber = ScannerUtil.nextInt(scanner,"숫자: ", 1, MAX);
            score++;
        }
        
        System.out.println("정답!!!");
        System.out.printf("총 %d회만에 맞추셨습니다!\n", score);
        
        
        
        return setBestScore(score, bestScore);
    }
    
    private static void showMenu(Scanner scanner) {
        int bestScore = 0;
        while(true) {
            System.out.println("1. 플레이 2. 최고기록 보기 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, "> ", 1, 3);
            if(userChoice == 1) {
                bestScore = play(scanner, bestScore);
            }else if(userChoice == 2) {
                printScore(bestScore);
            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }
}


















