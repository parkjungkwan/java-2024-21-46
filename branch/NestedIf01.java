package branch;
// 사용자로부터 
// 성별 나이 신체등급을 입력 받아
// 현역, 공익, 면제, 그리고 의무가 없습니다. 가 출력되는 프로그램
import java.util.Scanner;
public class NestedIf01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //성별을 입력받는다.
        System.out.print("성별 (1은 남자 2는 여자): ");
        int sex = scanner.nextInt();
        
        if(sex == 1) {
            //남성이므로 나이를 입력받는다.
            System.out.print("나이를 입력해주세요: ");
            int age = scanner.nextInt();
            if(age >= 18) {
                //성인이므로 신체등급을 입력받는다.
                System.out.print("신체등급을 입력해주세요: ");
                int category = scanner.nextInt();
                if(category >= 1 && category <= 3) {
                    System.out.println("현역입니다!!");
                }else if(category == 4) {
                    System.out.println("공익입니다!!");
                }else {
                    System.out.println("면제입니다!!");
                }
            }else {
                //미성년자이므로 메시지만 출력해준다.
                System.out.println("아직 미성년자입니다!");
            }
        }else {
            //여성이므로 메시지만 출력해준다.
            System.out.println("여성에게는 국방의 의무가 없습니다.");
        }
        
        scanner.close();
    }
}
