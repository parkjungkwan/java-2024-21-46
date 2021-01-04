package loop;

import java.util.Scanner;



// 메인 메소드가 모든걸 담당하지 않고
// 개별 메소드가 한가지 담당만 하는 버젼

public class GradeBook03 {
    final static int SUBJECT_SIZE = 3;
    
    // 무한루프를 돌면서 메뉴를 출력하는 메소드
    // 또한 사용자가 어떤 기능을 실행할지 선택까지만 가능하다.
    static void showMenu(Scanner scanner) {
        int id = 0;
        String name = new String();
        int korean = -1;
        int english = 0;
        int math = 0;
        while(true) {
            System.out.println("1. 성적 입력 2. 성적 출력 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, "> ", 1, 3);
            if(userChoice == 1) {
                // 성적 입력을 담당하는 코드 실행
                System.out.print("번호: ");
                id = scanner.nextInt();
                
                System.out.print("이름: ");
                name = ScannerUtil.nextLine(scanner);
                
                korean = ScannerUtil.nextInt(scanner, "국어: ", 0, 100);
                
                english = ScannerUtil.nextInt(scanner, "영어: ", 0, 100);
                
                math = ScannerUtil.nextInt(scanner, "수학: ", 0, 100);
            }else if(userChoice == 2) {
                // 성적 출력을 담당하는 메소드 실행
                printGrade(id, name, korean, english, math);
            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }
    
    static void printGrade(int id, String name, int korean, int english, int math) {
        if(korean == -1) {
            System.out.println("아직 입력된 정보가 없습니다.");
        }else {
            System.out.printf("번호: %d번 이름: %s\n", id, name);
            System.out.printf("국어: %03d점, 영어: %03d점, 수학: %03d점\n", 
                    korean, english, math);
            int sum = korean + english + math;
            double average = sum / (double)SUBJECT_SIZE;
            System.out.printf("총점: %03d점, 평균: %.2f점\n", sum, average);
        }
    }
    
    // 자바에서 메소드에 파라미터를 넘겨줄 경우
    // 파라미터의 데이터타입에 따라서 
    // call by value 와 call by reference 가 발생하게 된다.
    // call by value: 변수를 넘겨주더라도 값만 넘어가지 변수 그자체는 넘어가지 않음
    // call by reference: 주소값을 넘겨주기 때문에 변경을 가하면 변수에도 변경이 가해짐
    
    // call by value의 경우, 해당 변수의 "값 복사본"이 넘어가고, 따라서
    // 우리가 파라미터에 값을 변화시키더라도 원본 변수의 값은 변하지 않는다.
    
    // call by reference의 경우 해당 변수의 "주소값"이 넘어가기 때문에
    // 우리가 메소드에서 파라미터를 변화시키면 원본 변수에도 해당 변화가 적용된다.
    
    // call by value 는 기본형 데이터타입 변수가 파라미터로 넘어갈 경우 발생하고
    // call by reference는 참조형 데이터타입 변수가 파라미터로 넘어갈때 발생한다.
    
    
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        showMenu(scanner);
        
        
        scanner.close();
    }
}














