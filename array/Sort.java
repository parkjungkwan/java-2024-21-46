package array;
// 정렬
// 배열에서 우리가 정렬하는 코드를 구현해보자

// 정렬이란?
// 어떤 기준을 따라서 모여있는 것들의 순서를 맞춰주는것.

// 만약 우리가 int 배열을 정렬한다고 하면
// 두가지 선택이 있다.
// 1. 값이 작은것에서 큰순서로 오름차순 정렬
// 2. 값이 큰것에서 작은순서로 내림차순 정렬
public class Sort {
    
    public static void main(String[] args) {
        int[] intArray = new int[5];
        intArray[0] = 14;
        intArray[1] = 7;
        intArray[2] = 7;
        intArray[3] = 128;
        intArray[4] = 2;
        
        System.out.println("============정렬전================");
        for(int i = 0; i < intArray.length; i++) {
            System.out.printf("intArray[%d]: %d\n", i, intArray[i]);
        }
        System.out.println("================================");
        
        // 따라서 정렬의 경우 for문이
        // for(int i = 0; i < array.length - 1; i++)
        // 와 같은 형태로 되어야 한다
        
        // 또한 for문의 반복할 내용이 끝나면
        // i++ 이 실행되므로
        // 우리가 만약 i번째와 i+1번째의 값을 바꿨으면
        // 다시 0번부터 검사하기 위해서는
        // i를 -1로 초기화해야
        // i++을 통해서 i가 0이 되어서
        // 처음부터 검사할 수 있다!
        
        // 오름차순 정렬을 하면?
        // 2 7 14 22 128
        // 순이 되어야 한다!
        System.out.println("오름차순 정렬 적용 후");
        
        // 오름차순 정렬 시작
        for(int i = 0; i < intArray.length - 1; i++) {
            //기준 숫자
            int number1 = intArray[i];
            //그 다음 인덱스에 있는 숫자
            int number2 = intArray[i+1];
            if(number1 > number2) {
                //현재 숫자가 다음 숫자보다 크므로
                //2개의 위치를 바꿔준다!
                
                //프로그래밍 적으로 2개의 값을 바꿔줄때는
                //반드시 임시변수에 a의 값을 저장하고
                //a에 b의 값을 넣고
                //b에는 임시변수의 값을 넣어야 한다!
                int temp = intArray[i];
                intArray[i] = intArray[i+1];
                intArray[i+1] = temp;
                i = -1;
            }
        }
        
        System.out.println("============오름차순 정렬 후================");
        for(int i = 0; i < intArray.length; i++) {
            System.out.printf("intArray[%d]: %d\n", i, intArray[i]);
        }
        System.out.println("================================");
        
        
        // 내림차순 정렬을 하면?
        // 128 22 14 7 2
        // 순이 되어야 한다!
        
        for(int i = 0; i < intArray.length - 1; i++) {
            //기준 숫자
            int number1 = intArray[i];
            //그 다음 인덱스에 있는 숫자
            int number2 = intArray[i+1];
            if(number1 < number2) {
                int temp = intArray[i];
                intArray[i] = intArray[i+1];
                intArray[i+1] = temp;
                i = -1;
            }
        }
        
        System.out.println("============내림차순 정렬 후================");
        for(int i = 0; i < intArray.length; i++) {
            System.out.printf("intArray[%d]: %d\n", i, intArray[i]);
        }
        System.out.println("================================");
    }
}

























