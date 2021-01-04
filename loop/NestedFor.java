package loop;
// 중첩 for 반복문
// "for 반복문 안에 for 반복문"
public class NestedFor {
    public static void main(String[] args) {
        for(int i = 1; i <= 3; i++) {
            int value = 0;
            for(int j = 11; j <= 14; j++) {
                System.out.printf("i의 현재값: %d, j의 현재값: %d\n", i, j);
            }
            System.out.println("value의 현재값: "+value);
        }
        
        // 위의 중첩 for 반복문의 경우
        // 다음과 같은 반복 과정을 갖게 된다.
        // 1. int i = 1;
        // 2. i <= 3;
        // 3. int j = 11;
        // 4. j <= 14;
        // 5. System.out.printf();
        // 6. j++
        // 7. 4->5->6 반복
        // 8. 4번이 false가 나오면 j for 문 종료
        // 9. i++
        // 10. 2번부터 9번까지 반복
        // 11. i <= 3이 false가 나오면 종료
        
    }
}








