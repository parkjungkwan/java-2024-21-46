package syntax;
// 자바에는 크게 3가지 메모리 영역이 있다.
// 1. 스택: 변수가 선언되는 공간
// 2. 힙: 참조형 변수의 실제 값이 들어있는 공간
// 3. 메소드: 실행할 코드가 저장되는 공간
// 
// 메소드 영역에 우리가 코드를 저장시킬려면
// 반드시 해당 코드가 static 이라는 키워드가 붙어있어야 한다.

// 즉 우리가 메인 메소드에 static을 붙여주어야
// 해당 메소드가 메소드 영역에 등록이 되서
// 그 안에 코드들이 실행이 될 수 있는 것이다!

// 또한 static 메소드가 다른 상수, 변수, 메소드를 호출할 때에는
// static 이란 키워드가 해당 상수, 변수, 메소드에 반드시 붙어있어야 한다.

// 하지만 static 메소드가 내부에서 클래스 변수를 만들어서
// 그 변수의 메소드를 호출할 때에는 static이 필요 없다.

// 마지막으로 static 메소드는 우리가 클래스 변수를 만들필요 없이
// 클래스이름.메소드 로 실행 가능하다.

// 하지만 객체지향 언어에서는 static을 자주 사용하는건 추천되지 않는다.
// 왜냐하면 static을 쓰겠다는 것은 객체 선언을 하지 않고 메소드만 호출한다는 의미인데
// 그렇게 된다면 2세대언어인 절차지향적 언어와 차이가 없기 때문이다.
// 따라서 static을 사용하는건 최대한 피하자!

import java.util.Scanner;
public class Static {
    static final int SIZE = 5;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("이름: ");
        scanner.nextInt();
        // BMI.main(args);
        
        System.out.println("SIZE: "+SIZE);
        
        scanner.close();
    }
}



















