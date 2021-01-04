package syntax;
// printf
// printf는
// 출력할 내용에 % 문자를 사용하여
// 우리가 원하는 내용을 특정 형식으로 출력 가능하다.

// 공백문자
// 공백문자란 특수한 공백을 넣는데 사용되는 문자이다.
// 주로 \+알파벳으로 이루어졌으며
// 두글자지만 하나의 문자로 취급된다.
// \t: 스페이스 4개 분량의 탭 공백
// \n: 다음줄을 뜻하는 개행문자
public class Printf {
    public static void main(String[] args) {
        //1. 10진법 정수 ('d'ecimal)
        int number = 34;
        System.out.println("-----1. 10진법 정수-----");
        //A. 10진법 정수를 그대로 출력해라
        System.out.printf("A. %d\n", number);
        
        //B. 10진법 정수를 오른쪽 정렬 5자리로 출력해라
        System.out.printf("B. %5d\n", number);
        
        //C. 10진법 정수를 왼쪽 정렬 5자리로 출력해라
        System.out.printf("C. %-5d(끝)\n", number);
        
        //D. 10진법 정수를 오른쪽 정렬 5자리로 출력하고 왼쪽 빈 자리는 0으로 채워라
        System.out.printf("D. %05d\n", number);
        
        //2. 8진법 정수('o'ctal)
        System.out.println("-----2. 8진법 정수-----");
        
        //A. 8진법 정수를 그대로 출력해라
        System.out.printf("A. %o\n", number);
        
        //B. 8진법 정수를 오른쪽 정렬 5자리로 출력해라
        System.out.printf("B. %5o\n", number);
        
        //C. 8진법 정수를 왼쪽 정렬 5자리로 출력해라
        System.out.printf("C. %-5o(끝)\n", number);
        
        //D. 8진법 정수를 오른쪽 정렬 5자리로 출력하고 왼쪽 빈자리는 0으로 채워라
        System.out.printf("D. %05o\n", number);
        
        //3. 16진법 정수(he'x'adecimal)
        //   16진법은 각 자리가 0~15까지 16개의 숫자로 이루어졌고 각 자리가 16의 제곱으로 이루어진
        //   숫자체계이다.
        //   10~15는 A~F 로 표시한다.
        
        number = 30;
        System.out.println("3. 16진법 정수");
        
        // A. 16진법 정수를 그대로 표시하고, 알파벳이 있으면 소문자로 표시해라
        System.out.printf("A. %x\n", number);
        // B. 16진법 정수를 그대로 표시하고, 알파벳이 있으면 대문자로 표시해라
        System.out.printf("B. %X\n", number);
        // C. 16진법 정수를 오른쪽 정렬 5자리로 표시하고, 알파벳이 있으면 소문자로 표시해라
        System.out.printf("C. %5x\n", number);
        // D. 16진법 정수를 오른쪽 정렬 5자리로 표시하고, 알파벳이 있으면 대문자로 표시해라
        System.out.printf("D. %5X\n", number);
        // E. 16진법 정수를 왼쪽 정렬 5자리로 표시하고, 알파벳이 있으면 소문자로 표시해라
        System.out.printf("E. %-5x(끝)\n", number);
        // F. 16진법 정수를 왼쪽 정렬 5자리로 표시하고, 알파벳이 있으면 대문자로 표시해라
        System.out.printf("F. %-5X(끝)\n", number);
        // G. 16진법 정수를 오른쪽 정렬 5자리로 표시하고 왼쪽 빈자리에는 0으로 채우고 알파벳이 있으면
        //    대문자로 채워라
        System.out.printf("G. %05X\n", number);
        
        // 4. 실수 ('f'loat)
        // 비록 표기는 f이지만 double이건 float이건 뭐든 들어올 수 있다.
        System.out.println("4. 실수");
        double myDouble = 1234.5678;
        // A. 실수를 그대로 표시해라
        System.out.printf("A. %f\n", myDouble);
        // B. 실수를 오른쪽 정렬 12자리로 표시해라
        System.out.printf("B. %12f\n", myDouble);
        // C. 실수를 왼쪽 정렬 12자리로 표시해라
        System.out.printf("C. %-12f(끝)\n", myDouble);
        // D. 실수를 소숫점은 2번째자리까지 출력해라
        System.out.printf("D. %.2f\n", myDouble);
        // E. 실수를 오른쪽 정렬 12자리로 표시하고 소숫점은 3번째자리까지 출력해라
        System.out.printf("E. %12.3f\n", myDouble);
        // F. 실수를 왼쪽 정렬 10자리로 표시하고 소숫점은 1번째자리까지 출력해라
        System.out.printf("F. %-10.1f(끝)\n", myDouble);
        // G. 실수를 오른쪽 정렬 12자리로 표시하고 소숫점은 2번째자리까지 출력하고
        //    왼쪽 빈자리는 0으로 채워라
        System.out.printf("G. %012.2f\n", myDouble);
        
        // 5. 과학표기법(자연로그 'e')
        System.out.println("5. 과학표기법");
        // A. 실수를 과학표기법으로 출력해라
        System.out.printf("A. %e\n", myDouble);
        
        // 6. 문자열('S'tring)
        System.out.println("6. 문자열");
        String string1 = new String("abcDEFghi");
        // A. 문자열을 그대로 표시해라
        System.out.printf("A. %s\n", string1);
        // B. 문자열을 표시하되 소문자가 있으면 대문자로 바꿔서 출력해라
        System.out.printf("B. %S\n", string1);
        
        // printf의 주의점
        // 1. 우리가 자릿수를 지정할 경우, 출력할 내용이 더 길면, 자릿수 지정은 무시된다.
        System.out.printf("%3d\n", 1234567);
        // 2. 만약 잘못된 %문자를 쓰면 에러난다.
        //System.out.printf("%z\n", 123456);
        // 3. %와 맞지 않는 형식의 데이터가 넘어오면 에러난다.
        //System.out.printf("%d\n", 123.45);
        // 4. 만약 %문자가 나온 횟수보다 뒤에 값들이 더 많은경우는 에러가 나진 않지만
        //    반대로 %문자가 더 많이 나오면 에러 난다.
        System.out.printf("%d %f %s\n", 1, 2.34, "abc", 4, 5.67);
        //System.out.printf("%d %d %d %d\n", 1, 2, 3);
    }
}















