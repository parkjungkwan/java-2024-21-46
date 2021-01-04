package array;

import java.util.Scanner;


// 동적할당을 이용하여
// 우리가 원하는 만큼의 학생을 관리가능한 
// 성적관리 프로그램
public class GradeBook03 {
    private static int MAX_SIZE = 5;

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        showMenu(scanner);
        scanner.close();
    }

    private static void showMenu(Scanner scanner) {
        Student[] studentArray = new Student[0];
        while (true) {
            System.out.println("=========================");
            System.out.println("|       비트고등학교        |");
            System.out.println("|     성적관리프로그램       |");
            System.out.println("=========================");
            System.out.println("        1. 입력");
            System.out.println("        2. 전체 출력");
            System.out.println("        3. 종료");
            System.out.println("=========================");
            int userChoice = ScannerUtil.nextInt(scanner, "> ", 1, 3);
            if (userChoice == 1) {
                // 입력을 담당하는 메소드 호출
                studentArray = insert(scanner, studentArray);
            } else if (userChoice == 2) {
                // 출력을 담당하는 메소드 호출
                studentArray = printAll(scanner, studentArray);
            } else if (userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
    }

    private static Student[] insert(Scanner scanner, Student[] studentArray) {
        if (ArrayUtil.size(studentArray) < MAX_SIZE) {
            // 칸이 남았으므로 입력

            // 학생의 정보를 저장할 변수를 하나 만들자
            Student s = new Student();

            // 학생의 정보를 차례대로 넣어보자.
            System.out.print("번호: ");
            //s.id = scanner.nextInt();
            s.setId(scanner.nextInt());
            
            System.out.print("이름: ");
            //s.name = ScannerUtil.nextLine(scanner);
            s.setName(ScannerUtil.nextLine(scanner));
            
            //s.korean = ScannerUtil.nextInt(scanner, "국어: ", 0, 100);
            s.setKorean(ScannerUtil.nextInt(scanner, "국어: ", 0, 100));
            
            //s.english = ScannerUtil.nextInt(scanner, "영어: ", 0, 100);
            s.setEnglish(ScannerUtil.nextInt(scanner, "영어: ", 0, 100));

            //s.math = ScannerUtil.nextInt(scanner, "수학: ", 0, 100);
            s.setMath(ScannerUtil.nextInt(scanner, "수학: ", 0, 100));

            // 정보가 추가된 s를 배열에 추가해주자
            studentArray = ArrayUtil.add(studentArray, s);

        } else {
            // 칸이 없으므로 경고메시지만 출력
            System.out.println("관리 명단의 목록이 꽉 찼습니다!");
        }

        return studentArray;
    }

    private static Student[] printAll(Scanner scanner, Student[] studentArray) {
        // 만약 배열에 한명의 학생도 없으면 아무도 없다! 만 출력해 주자
        if (ArrayUtil.size(studentArray) == 0) {
            System.out.println("아직 입력된 학생이 없습니다.");
        } else {
            System.out.println("-------------------------------");
            for (int i = 0; i < studentArray.length; i++) {
                System.out.printf("%d. %s\n", i + 1, studentArray[i].getName() );
            }
            System.out.println("-------------------------------");

            int userChoice = ScannerUtil.nextInt(scanner, "출력할 번호의 학생을 선택해주세요(0은 뒤로가기): ", 0, studentArray.length) - 1;

            if (userChoice != -1) {
                // 개별보기 하는 메소드를 호출한다.
                studentArray = selectOne(scanner, studentArray, userChoice);
            }

        }

        return studentArray;
    }

    // 객체를 개별보기하고 혹시라도 수정 삭제 시에는 관련 메소드를 호출해주는 메소드
    private static Student[] selectOne(Scanner scanner, Student[] studentArray, int index) {

        // 먼저 파라미터로 넘어온 studentArray에서 index를 사용해서 사용자가 선택한 객체를
        // 출력해보자
        Student s = studentArray[index];
        System.out.printf("번호: %d번 이름: %s\n", s.getId(), s.getName());
        System.out.printf("국어점수: %03d점 영어점수: %03d점 수학점수: %03d점\n", 
                s.getKorean(), s.getEnglish(), s.getMath());

        System.out.printf("총점: %03d점 평균: %.2f점\n", 
                s.calculateSum(), s.calculateAverage());
        System.out.println("===================================");
        int userChoice = ScannerUtil.nextInt(scanner, "1. 수정 2. 삭제 3. 뒤로가기 ", 1, 3);
        if (userChoice == 1) {
            // 수정하는 메소드 호출
            
            // 수정이 완료되고 나면
            // 다시 개별 보기로 돌아오게 만들어준다.
            updateStudent(scanner, studentArray[index]);
            studentArray = selectOne(scanner, studentArray, index);
        } else if (userChoice == 2) {
            // 삭제하는 메소드 호출
            
            // 삭제후에는 목록보기로 가서 삭제가 됬는지 보여준다.
            studentArray = deleteStudent(scanner, studentArray, index);
            studentArray = printAll(scanner, studentArray);
        }

        return studentArray;
    }
    
    private static void updateStudent(Scanner scanner, Student s) {
        System.out.println("========================");
        System.out.println("          수정");
        System.out.println("========================");
        System.out.println("번호: "+s.getId()+"번");
        System.out.println("이름: "+s.getName());
        
        s.setKorean(ScannerUtil.nextInt(scanner, "국어: ", 0, 100));
        s.setEnglish(ScannerUtil.nextInt(scanner, "영어: ", 0, 100));
        s.setMath(ScannerUtil.nextInt(scanner, "수학: ", 0, 100));
    }
    
    private static Student[] deleteStudent(Scanner scanner, Student[] studentArray, int index) {
        System.out.print("해당 학생을 정말 삭제하시겠습니까 y/n : ");
        String agree = ScannerUtil.nextLine(scanner);
        //만약 사용자가 y를 눌렀으면
        //삭제
        //그외에는 그냥 무시
        if(agree.equals("y")) {
            studentArray = ArrayUtil.removeByIndex(studentArray, index);
        }
        
        return studentArray;
    }
}











