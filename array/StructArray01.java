package array;

import java.util.Scanner;


// 구조체를 배열로 만드는건 가능할까요?
// 당연히 됩니다.
// 기존 기본형 데이터타입 배열처럼
// 데이터타입[] 배열이름 = new 데이터타입[크기] 로 선언하여
// 각칸을 초기화하면 사용 가능하다.

public class StructArray01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Student[] studentArray = new Student[5];
        //단 기본형 데이터타입이 아닌 배열의 경우
        //각 요소를 우리가 매번 초기화해주어야 정상적으로 사용가능하다.
        
        //만약 각 요소를 초기화하지 않으면?
        //NullPointerException 이란 것이 발생한다.
        //studentArray[0].id = 1;
        
        //각 요소를 초기화하는 for 문
        for(int i = 0; i < studentArray.length; i++) {
            studentArray[i] = new Student();
        }
        
        // new 라는 키워드는
        // 참조형 데이터타입에 대한 
        // 공간 확보에 쓰이는 키워드이다.
        // 만약 클래스형 변수의 경우
        // 변수 = new 클래스이름() 으로 초기화하고
        // 배열의 경우
        // 배열이름 = new 데이터타입[크기] 로 초기화한다.
        // 만약 참조형 배열의 경우에는
        // 배열 초기화 이후에 각 요소에 대한 초기화를 해주어야
        // 정상적으로 사용가능하다.
        
        // for문을 이용해서
        // 각 칸의 정보를 넣고
        // 또 다른 for문을 이용해서
        // 각 칸의 정보를 출력해보세요(5분)
        for(int i = 0; i < studentArray.length; i++) {
            /*System.out.print("번호: ");
            studentArray[i].id = scanner.nextInt();
            
            System.out.print("이름: ");
            studentArray[i].name = ScannerUtil.nextLine(scanner);
            
            studentArray[i].korean = ScannerUtil.nextInt(scanner, "국어: ", 0, 100);
            
            studentArray[i].english = ScannerUtil.nextInt(scanner, "영어: ", 0, 100);
            
            studentArray[i].math = ScannerUtil.nextInt(scanner, "수학: ", 0, 100);
            */
        }
        
        //출력을 담당하는 for 문
        for(int i = 0; i < studentArray.length; i++) {
           /* int id = studentArray[i].id;
            String name = studentArray[i].name;
            int korean = studentArray[i].korean;
            int english = studentArray[i].english;
            int math = studentArray[i].math; 
            int sum = korean + english + math;
            double average = sum / 3.0;
            System.out.printf("번호: %d번 이름: %s\n", id, name);
            System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", 
                    korean, english, math);*/
            //System.out.printf("총점: %03d점 평균: %.2f점", sum, average);
            
        }
    }
}















