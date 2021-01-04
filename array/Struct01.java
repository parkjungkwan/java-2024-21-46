package array;

import java.util.Scanner;



// Student 데이터타입에 직접 우리가 값을 넣고 출력하는 프로그램을 작성해보자 (5분)
public class Struct01 {
    public static void main(String[] args) {
        Student s = new Student();
        Scanner scanner = new Scanner(System.in);
        /*
        System.out.print("번호: ");
        s.id = scanner.nextInt();
        
        System.out.print("이름: ");
        s.name = ScannerUtil.nextLine(scanner);
        
        s.korean = ScannerUtil.nextInt(scanner, "국어: ", 0, 100);
        
        s.english = ScannerUtil.nextInt(scanner, "영어: ", 0, 100);
        
        s.math = ScannerUtil.nextInt(scanner, "수학: ", 0, 100);
        
        System.out.printf("번호: %d번, 이름: %s\n", s.id, s.name);
        System.out.printf("국어: %03d점, 영어: %03d점, 수학: %03d점\n", 
                s.korean, s.english, s.math);
        int sum = s.korean + s.english + s.math;
        double average = sum / 3.0;
        System.out.printf("총점: %03d점, 평균: %.2f점\n", sum, average);
        */
        scanner.close();
    }
}








