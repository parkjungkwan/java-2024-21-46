package syntax;
// 비교연산자
// 비교연산자는
// 2개의 값을 비교한다.
// 변수와 변수
// 혹은 변수와 숫자값등을 비교 가능하다.
public class Operator03 {
    public static void main(String[] args) {
        int number1 = 3;
        int number2 = 4;
        //비교연산자에는
        // > >= < <= == != 6가지가 있다.
        
        //number1에 저장된 값이 number2의 저장된 값보다 큽니까?
        System.out.println("number1 > number2: "+(number1 > number2));
        //number1에 저장된 값이 number2의 저장된 값보다 크거나 같습니까?
        System.out.println("number1 >= number2: "+(number1 >= number2));
        //number1에 저장된 값이 number2의 저장된 값보다 작습니까?
        System.out.println("number1 < number2: "+(number1 < number2));
        //number1에 저장된 값이 number2의 저장된 값보다 작거나 같습니까?
        System.out.println("number1 <= number2: "+(number1 <= number2));
        //number1에 저장된 값이 number2의 저장된 값과 같습니까?
        System.out.println("number1 == number2: "+(number1 == number2));
        //number1에 저장된 값이 number2의 저장된 값과 다릅니까?
        System.out.println("number1 != number2: "+(number1 != number2));
        
        
        //하지만 비교연산자의 경우, 클래스형 변수에 대한 비교는 부정확한 값을 연산하게 된다.
        
        System.out.println("===참조형 변수의 비교===");
        
        String string1 = new String("abc");
        String string2 = "abc";
        String string3 = string2;
        
        System.out.println("string1: "+string1);
        System.out.println("string2: "+string2);
        System.out.println("string3: "+string3);
        
        System.out.println("====비교연산자를 사용할 경우====");
        System.out.println("string1 == string2: "+(string1 == string2));
        System.out.println("string1 == string3: "+(string1 == string3));
        System.out.println("string2 == string3: "+(string2 == string3));
        System.out.println("--------------------------");
        
        // 클래스형 변수는 해당 공간에 어떤 값이 들어가있는가?
        // 주소값이 들어가있다.
        // 우리가 위에서 string1, string2, string3을 초기화한 방법이 다른데
        // 그 때문에 주소값이 틀려지게 된것이다.
        // 하지만 비교 연산자는 클래스형 변수의 실제 어떤 값이 있는지를 비교하는 것이 아니라
        // 주소값을 비교하기 때문에
        // 부정확한 결과값이 나오게 된다.
        // 우리가 클래스형 변수들을 비교할 때에는 주소값 비교보다는 그 안에 어떤 값이 들어가 있는지를
        // 비교하고 싶다가 더 정확하기 때문에
        // 클래스형 변수를 비교할 때에는 비교 연산자를 사용하면 안된다.
        
        // 그렇다면 클래스형 변수를 비교할 때에는 무엇을 사용해야하는가?
        // 바로 메소드를 이용해서 비교를 해야한다.
        // 2개의 참조형 변수가 같은지 비교할 때에는
        // equals 메소드를 사용하면 된다
        System.out.println("===equals 메소드를 통한 비교===");
        System.out.println("string1.equals(string2): "+string1.equals(string2));
        System.out.println("string1.equals(string3): "+string1.equals(string3));
        System.out.println("string2.equals(string3): "+string2.equals(string3));
        System.out.println("-----------------------------");
    }
}





















