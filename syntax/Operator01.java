package syntax;
// 연산자
// 연산자란 수학적 기호에 프로그래밍적 기능이 정의되어있어서
// 우리가 특정 기호를 쓰면 내부적으로 해당 기능이 실행되는것을 뜻한다.
// 연산자에는 
// 산술, 할당, 비교, 논리, 비트 5가지 연산자가 존재한다.
public class Operator01 {
    public static void main(String[] args) {
        // 산술 연산자란, 간단한 4칙연산 + 나머지를 구해주는 연산자이다.
        
        int myNumber1 = 10;
        int myNumber2 = 15;
        
        System.out.println("myNumber1 + myNumber2: "+(myNumber1 + myNumber2));
        System.out.println("myNumber1 - myNumber2: "+(myNumber1 - myNumber2));
        System.out.println("myNumber1 * myNumber2: "+(myNumber1 * myNumber2));
        System.out.println("myNumber1 / myNumber2: "+(myNumber1 / myNumber2));
        // 나눗셈의 경우, 정수형과 정수형의 나눗셈은
        // 반드시 결과값이 정수형이 나오게 된다.
        // 예를 들어, 10 / 15의 경우에는
        // 몫은 0, 나머지는 10 이렇게 쓸 수 있다.
        // 그러므로 결과값은 몫인 0만 나오게 된다.
        
        System.out.println("myNumber1 % myNumber2: "+(myNumber1 % myNumber2));
        
        //하지만 산술연산의 경우 한쪽이 실수이면 
        //결과값도 실수가 된다.
        System.out.println("myNumber1 + myNumber2: "+((double)myNumber1 + myNumber2));
        System.out.println("myNumber1 - myNumber2: "+((double)myNumber1 - myNumber2));
        System.out.println("myNumber1 * myNumber2: "+((double)myNumber1 * myNumber2));
        System.out.println("myNumber1 / myNumber2: "+((double)myNumber1 / myNumber2));
        System.out.println("myNumber1 % myNumber2: "+((double)myNumber1 % myNumber2));
        
        
        //이거는 결과값이 어떻게 나올까?
        double result = myNumber1 / myNumber2;
        System.out.println("result의 현재값: "+result);
        
        //위 코드는 0.0이 결과값으로 나오는데
        //myNumber1 / myNumber2는
        //int / int이기 때문에
        //몫만 온전하게 나온다.
        //즉 0이란 결과값을
        //실수로 바꾸면?
        //0.0이 되기 때문이다.
  
        
        //String이란?
        //스트링 이란 여러개의 문자를 모아둔 문자열을 관리하는 클래스 이다.
        //우리가 스트링 변수를 만들게 되면
        //여러개의 문자를 다루겠다 라는 의미가 된다.
        //""로 둘러쌓인 문자들은
        //String 으로 인식된다.
        String string = new String();
        //그렇다면 여러개의 문자에 + 연산자를 실행하면 어떤 결과가 나올까?
        //만약 스트링 + 스트링의 경우, 2개의 문자열을 이어붙이겠다 라는 의미가 된다.
        string = "abc";
        String string2 = new String();
        string2 = "DEF";
        System.out.println(string+string2);
        //만약 스트링 + 다른 데이터타입의 경우에는 다른 데이터타입을
        //스트링으로 변환하고 변환된 스트링을 뒤에 이어붙인다.
        System.out.println("123"+456);
        
        //증감연산자
        //산술연산자중에서 특이하게 ++, 혹은 -- 로 적는 경우가 있는데
        //이때에는 현재 변수의 값을 1씩 증가시키거나 감소시키거나 하라는 의미가 된다.
        //단 ++ 혹은 --가 앞에 붙냐 뒤에붙냐에 따라서 의미가 달라지게 된다.
        System.out.println("myNumber1의 현재값: "+myNumber1);
        System.out.println("++myNumber1: "+ ++myNumber1);
        //위 코드는 다음과 같은 순서를 가지게 된다.
        //1. ++myNumber1이 실행되서 myNumber1의 값이 10에서 11로 변경된다.
        //2. myNumber1의 값을 스트링으로 변환한다.
        //3. "++myNumber1: " 뒤에 스트링으로 변환된 myNumber1의 값이 이어진다.
        //4. System.out.println()이 3번의 결과값을 화면에 출력하게 된다.
        
        System.out.println("myNumber1의 현재값: "+myNumber1);
        //이렇게 ++ 혹은 --가 앞에 붙을 경우
        //전위증가(감소)연산자 라고 한다.
        
        System.out.println("myNumber1++: "+ myNumber1++);
        //위 코드는 다음과 같은 순서를 가지게 된다.
        //1. myNumber1의 값을 스트링으로 변환한다.
        //2. "myNumber1++: " 뒤에 스트링으로 변환된 myNumber1의 값이 이어진다.
        //3. System.out.println()이 2번의 결과값을 화면에 출력하게 된다.
        //4. myNumber1++가 실행되서 myNumber1의 값이 11에서 12로 변경된다.
        System.out.println("myNumber1의 현재값: "+myNumber1);
        //이렇게 ++ 혹은 --가 뒤에 붙을 경우
        //후위증가(감소)연산자 라고 한다.
    }

}














