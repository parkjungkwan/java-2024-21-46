package branch;
// 만약 조건식이 여러개가 붙어야 한다면
// if - else if - else if .... - else 구조로 만들어 줄수 있다.
// 제일 위에서부터 조건식이 false가 나오면
// 그 다음 조건식을 체크해서 true가 나오는 첫번째 else if만 실행이 된다.
public class IfElseIf01 {
    public static void main(String[] args) {
        int age = 18;
        if(age <= 5) {
            System.out.println("유아입니다.");
        }else if(age <= 13) {
            System.out.println("어린이입니다.");
        }else if(age <= 17) {
            System.out.println("청소년입니다.");
        }else {
            System.out.println("성인입니다.");
        }
    }
}
