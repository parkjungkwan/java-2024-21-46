package syntax;
// 형변환(Type Casting)
// 형변환이란 특정 데이터타입의 값을
// 다른 데이터타입으로 변경하는 것을 형 변환이라고 한다.
// 형변환에는 2가지 종류가 있다.
// 1. 암시적 형변환
//    암시적 형변환의 경우, 더 큰 데이터타입의 공간에 더 작은 데이터타입의 값을 담을때 발생한다.
//    우리가 특별히 아무런 말을 해주지 않아도 자동적으로 형변환이 된다.
// 2. 명시적 형변환
//    명시적 형변환의 경우, 더 작은 데이터타입의 공간에 더 큰 데이터타입의 값을 담을때 발생한다.
//    우리가 명시적으로 이러한 데이터타입으로 바꿔라! 라고 명령어를 적어주어야 한다!!!
//    명시적 형변환은
//    변수 = (바꿀 타입)바꿀 값;
//    으로 형변환이 가능하다.
public class TypeCasting {
    public static void main(String[] args) {
        byte myByte = 0;
        int myInt = 10;
        
        //myInt에 myByte의 값을 담을때에는
        //암시적 형변환이 일어난다.
        //이때엔 우리가 특별히 더 적어줄 코드는 없다.
        myInt = myByte;
        System.out.println("myInt의 현재값: "+myInt);
        
        //하지만 반대의 경우에선 명시적 형변환을 하지 않으면 에러가 난다.
        myByte = (byte)myInt;
        System.out.println("myByte의 현재값: "+myByte);
        
        //오버플로우를 발생시켜보자
        myInt = 130;
        myByte = (byte)myInt;
        System.out.println("myByte의 현재값: "+myByte);
        
        //언더플로우를 발생시켜보자
        myInt = -140;
        myByte = (byte)myInt;
        System.out.println("myByte의 현재값: "+myByte);
        
        //하지만 그냥 맘 편하게
        //int를 쓰면 거의 모든 문제가 해결된다...
        
        //이렇게 다양한 데이터타입이 있는 이유는
        //예전 70~80년대만 하더라도 
        //컴퓨터의 가용자원(=리소스)가 매우 적었기 때문에
        //정확한 범위를 먼저 계산하고 그리고 그 후에 해당 값이 정확하게 만족하는
        //데이터타입을 정확하게 썼기 때문이다.
        
    }
}





















