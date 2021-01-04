package syntax;
// 상수(Constant)
// 상수는 한번 값이 초기화되면
// 더이상 바꿀 수 없게 된다.
// 상수는 우리가 제일 앞에 final 이라는 키워드를 붙여서 만들어 준다.
public class Constant {
    public static void main(String[] args) {
        int myNumber = 30;
        System.out.println("myNumber의 현재값: "+myNumber);
        final int MY_NUMBER = 20;
        System.out.println("MY_NUMBER의 현재값: "+MY_NUMBER);
        myNumber = 40;
        System.out.println("myNumber의 현재값: "+myNumber);
        
        //하지만 상수 MY_NUMBER의 값은 이미 20으로 초기화가 되었기 때문에
        //변경이 불가능하다!
        //MY_NUMBER = 25;
        
        //상수는 우리가 하드코딩을 피하기 위해서
        //적극적으로 사용을 해야한다.
        
    }
}
