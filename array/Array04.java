package array;

import java.util.Random;

// 가변 배열
// 가변 배열이란
// 다차원 배열 중
// 각 배열의 길이가 제각각 다른 형태인 배열을 뜻한다.
// 예를 들어
// int[][] intArray = new int[3][] 으로 되어있을 경우
// intArray[0] = new int[3]
// intArray[1] = new int[4]
// intArray[2] = new int[10] 
// 이런식으로 만드는 것을 뜻한다.
public class Array04 {
    private static final int MAX_SIZE =5;
    public static void main(String[] args) {
        int[][] intArray = new int[3][];
        //intArray는 인트배열 3개를 모아둔 2차원 배열이다.
        //즉 인트배열이기만 하면 각각의 크기는 얼마가 되도 괜찮은 것이다.
        Random random = new Random();
        for(int i = 0; i < intArray.length; i++) {
            int size = random.nextInt(MAX_SIZE)+1;
            intArray[i] = new int[size];
        }
        System.out.println("intArray의 각 배열의 크기");
        System.out.println("intArray[0].length: "+intArray[0].length);
        System.out.println("intArray[1].length: "+intArray[1].length);
        System.out.println("intArray[2].length: "+intArray[2].length);
    }
}
















