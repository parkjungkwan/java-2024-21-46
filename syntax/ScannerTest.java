package syntax;
// Scanner
// 자바에서 콘솔에서의 입력은 Scanner가 담당하게 된다.
// 단 Scanner는 클래스이고 우리 패키지에 존재하지 않기 때문에
// import 라는 키워드를 이용해서 불러와야 한다.
import java.util.Scanner;
public class ScannerTest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // 1. 정수 입력 받기
        //    정수를 입력 받을 때에는 scanner의 nextInt() 메소드를 호출해주면 된다.
        System.out.print("숫자: ");
        int number = scanner.nextInt();
        System.out.println("number의 현재값: "+number);
        
        // 2. 실수 입력 받기
        //    실수를 입력 받을 때에는 scanner의 nextDouble() 메소드를 호출해주면 된다.
        System.out.print("실수: ");
        double myDouble = scanner.nextDouble();
        System.out.println("실수의 현재값: "+myDouble);
        
        // 3. 스트링 입력 받기
        //    스트링 입력 받을 때에는 scanner의 nextLine() 메소드를 호출해주면 된다.
        //    스트링 입력시에는 한가지 주의할 점이 있는데
        //    nextInt(), nextDouble() 등의 숫자를 입력하는 메소드 이후에는
        //    nextLine()을 곧장 사용하면 안된다.
        //    왜냐하면 우리가 키보드로 입력한 값이 
        //    버퍼메모리에 가는데
        //    우리가 입력이 끝났다 를 알려주기 위해서 엔터를 치면,
        //    nextInt(), nextDouble()은 멍청하게 
        //    엔터를 제외한 숫자값만 버퍼메모리에서 읽어서 없앤다.
        //    즉 nextInt()를 실행해서
        //    123\n라고 입력하면,
        //    nextInt()가 123만 가져가고 \n은 버퍼메모리에 남겨둔다.
        //    하지만 nextLine()의 경우, 모든 문자를 다 가져올 수 있는데
        //    버퍼메모리에 남아있던 \n을 보고 "아 사용자가 입력을 끝냈구나!" 라고
        //    착각하게 된다.
        //    이것이 scanner의 nextLine() 버그이다.
        
        //    해당 버그를 해결하기 위해서는
        //    nextInt, nextDouble을 사용하고
        //    nextLine을 사용하기 전에 nextLine을 한번 더 실행해주면 된다.
        
        System.out.print("이름: ");
        //스캐너 버그 해결을 위한 scanner.nextLine() 실행
        scanner.nextLine();
        
        String name = scanner.nextLine();
        System.out.println("name의 현재값: "+name);
        
        // Scanner와 같이 버퍼메모리를 만들어서 읽는
        // 클래스의 경우 close()라는 메소드를 가장 마지막에 호출해서
        // 버퍼메모리를 종료시켜주는것이 좋다.
        scanner.close();
                
    }
}









