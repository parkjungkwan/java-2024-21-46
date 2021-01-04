package array;

import java.util.Scanner;


// 학생별 국영수 점수를 
// 2차원 배열로 입력받고
// 번호와 이름도 배열로 입력 받아서
// 출력할 때 각 학생의 국영수 점수와 정보들이 나오는 프로그램
public class GradeBook02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //학생들의 번호를 저장할 배열
        int[] idArray = new int[3];
        //학생들의 이름을 저장할 배열
        String[] nameArray = new String[3];
        //학생들의 점수들을 저장할 배열
        int[][] scoreArray = new int[3][3];
        
        for(int i = 0; i < 3; i++) {
            //만약 각 배열의 똑같은 인덱스에
            //한 학생의 정보를 넣어주면
            //우리가 각 배열의 해당 인덱스를 다 불러주면
            //그 학생 정보가 모두 모일 수 있다!
            
            //i번째 학생의 번호:
            System.out.printf("%d번 학생 번호: ", i+1);
            idArray[i] = scanner.nextInt();
            
            //i번째 학생의 이름:
            System.out.printf("%d번 학생 이름: ", i+1);
            nameArray[i] = ScannerUtil.nextLine(scanner);
            
            //i번째 학생의 국어점수: 
            scoreArray[i][0] = ScannerUtil.nextInt(scanner, 
                    (i+1)+"번 학생의 국어: ", 1, 100);

            //i번째 학생의 영어점수: 
            scoreArray[i][1] = ScannerUtil.nextInt(scanner, 
                    (i+1)+"번 학생의 영어: ", 1, 100);
            
            //i번째 학생의 수학점수: 
            scoreArray[i][2] = ScannerUtil.nextInt(scanner, 
                    (i+1)+"번 학생의 수학: ", 1, 100);
        }
        
        // 인덱스가 똑같으면
        // 각 배열은 한명의 학생의 정보를 가지게 된다.
        for(int i = 0; i < 3; i++) {
            String name = nameArray[i];
            int id = idArray[i];
            int korean = scoreArray[i][0];
            int english = scoreArray[i][1];
            int math = scoreArray[i][2];
            int sum = korean + english + math;
            double average = sum / 3.0;
            
            System.out.println("----"+name+"학생의 정보----");
            System.out.printf("번호: %d번 이름: %s\n", id, name);
            System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",
                    korean, english, math);
            System.out.printf("총점: %03d점 평균: %.2f점\n", sum, average);
            System.out.println("-----------------------------");
            
        }
        
        
        
        scanner.close();
    }
}











