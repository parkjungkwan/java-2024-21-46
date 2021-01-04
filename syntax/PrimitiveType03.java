package syntax;
// 기본형 데이터타입 - 문자형
// 문자형 기본데이터타입은 한개의 문자만 다룬다.
// 문자의 경우 아스키테이블이라는 문자 코드 테이블을 사용해서
// 2진법 숫자 -> 10진법 숫자 -> 해당하는 글자 로 변환된다.
// 우리가 문자형 데이터타입을 할당할 때에는
// 'A' 이렇게 따옴표 안에 글자를 넣어서 할당하거나
// 해당 글자의 코드값을 직접 넣어줄 수도 있다.
public class PrimitiveType03 {
    public static void main(String[] args) {
        //문자형 데이터타입은 
        //character를 줄여서
        //char 로 적어준다.
        char myChar = 'A';
        System.out.println("myChar의 현재값: "+myChar);
        
        //실제 메모리에는 A 라는 글자가 아니라 A의 해당하는 코드값이 저장되므로
        //다음과 같은 것도 가능하다.
        myChar = 97;
        System.out.println("myChar의 현재값: "+myChar);
        
        myChar = 'B'+32;
        System.out.println("myChar의 현재값: "+myChar);
    }
}
