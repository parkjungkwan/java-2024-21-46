package loop;

import java.util.Scanner;

//ScannerUtil 을 사용하여
//코드가 좀더 간단해진 형태의 
//성적관리 프로그램
public class GradeBook02 {
    static final int SUBJECT_SIZE = 3;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int id = 0;
        String name = new String();
        int korean = -1;
        int english = 0;
        int math = 0;
        while (true) {
            System.out.println("1. 입력 2. 출력 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner,"국어: ",  1, 3);
            if (userChoice == 1) {
                System.out.print("번호: ");
                id = scanner.nextInt();

                System.out.print("이름: ");
                name = ScannerUtil.nextLine(scanner);

                korean = ScannerUtil.nextInt(scanner, "국어: ", 0, 100);

                english = ScannerUtil.nextInt(scanner, "영어: ", 0, 100);

                math = ScannerUtil.nextInt(scanner, "수학: ", 0, 100);

            } else if (userChoice == 2) {
                if (korean == -1) {
                    System.out.println("아직 입력된 정보가 없습니다.");
                } else {
                    System.out.printf("번호: %d번 이름: %s\n", id, name);
                    System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", korean, english, math);
                    int sum = korean + english + math;
                    double average = sum / (double) SUBJECT_SIZE;
                    System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
                }
            } else {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }

        scanner.close();
    }
}
