package array;

import java.util.Scanner;


// 정적할당일 경우
// 만약 배열의 크기보다 많은 학생을 입력하고자 할때
// 1. 더이상 입력할 수 없습니다
// 2. 가장 앞에 있던 애를 지우고 그 다음 인덱스부터는 하나씩 당기고
//    가장 뒷칸에 넣는 방법

// 중 1번 방법을 코드로 구현한 프로그램
public class StaticArray01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] studentArray = new Student[4];
        while(true) {
            System.out.println("비트 학생관리프로그램");
            System.out.println("1. 입력 2. 출력 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, "> ", 1, 3);
            
            if(userChoice == 1) {
                // 새로운 학생을 입력할 때에는
                // 빈 인덱스를 찾고
                // 빈 인덱스가 존재하면 입력
                // 존재하지 않으면 "모든 칸이 찼습니다"
                // 라고 출력되게 한다.
                
                // 빈 인덱스를 저장할 int index
                int index = -1;
                
                // for문을 이용해서
                // 빈 칸을 찾아보자
                // 빈 칸이라 함은 
                // 아직 아무런 정보가 입력이 안되어있다
                // 즉 해당 칸이 초기화가 안되어있다.
                // 라는 의미가 된다.
                // 즉 index는 해당 칸이 null인 index를 찾아서
                // 저장하면 된다!
                
                // 널인 index를 찾는 for 문
                for(int i = 0; i < studentArray.length; i++) {
                    if(studentArray[i] == null) {
                        //i번째 칸이 널이므로 
                        //입력할 위치는 i번째 칸이 되며
                        //더이상 확인할 필요 없으므로 break 실행
                        index = i;
                        break;
                    }
                }
                
                // 만약 index 가 -1이라는 것은
                // 모든 칸이 null이 아니다, 
                // 즉 모든 칸에 학생의 정보가 존재하므로
                // 메시지만 출력하고
                // 그외일때에만
                // studentArray[index]에 
                // 정보를 입력하면 된다!
                if(index == -1) {
                    //배열에 모든 칸에 정보가 들어있으므로
                    //메시지만 출력
                    System.out.println("모든 칸이 다 찼습니다!");
                    
                }else {
                    //index 번 칸이 비어있으므로
                    //해당칸을 초기화해주고
                    studentArray[index] = new Student();
                    //해당칸에 학생 정보 입력
                    System.out.print("번호: ");
                    /*
                    studentArray[index].id = scanner.nextInt();
                    
                    System.out.print("이름: ");
                    studentArray[index].name = ScannerUtil.nextLine(scanner);
                    
                    studentArray[index].korean = ScannerUtil.nextInt(scanner, "국어: ", 0, 100);   
                    
                    studentArray[index].english = ScannerUtil.nextInt(scanner, "영어: ", 0, 100);
                    
                    studentArray[index].math = ScannerUtil.nextInt(scanner, "수학: ", 0, 100);   
                    */
                }
            }else if(userChoice == 2) {
                //for문을 사용해서
                //해당칸이 null 이 아니면 출력
                for(int i = 0; i < studentArray.length; i++) {
                    if(studentArray[i] != null) {
                        /*
                        int id = studentArray[i].id;
                        String name = studentArray[i].name;
                        int korean = studentArray[i].korean;
                        int english = studentArray[i].english;
                        int math = studentArray[i].math;
                        int sum = korean + english + math;
                        double average = sum / 3.0;
                        System.out.printf("번호: %d번 이름: %s\n", id, name);
                        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", 
                                korean, english, math);
                        System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
                        */
                    }
                }
            }else if(userChoice == 3) {
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }
        
        
        scanner.close();
    }
}













