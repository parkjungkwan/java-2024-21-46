package array;

import java.util.Random;
import java.util.Scanner;


// 로또 게임 해보기
// 사용자가 숫자를 선택해서
// 컴퓨터가 만들어준 숫자들과 비교하여
// 6개 다 일치: 1등
// 5개: 2등
// 4개: 3등
// 3개: 4등
// 이 출력되는 프로그램을 작성하시오.
// 단 사용자가 숫자를 선택할 때에는
// 불가능한 번호나 중복된 번호는 입력할 수 없게 프로그램을 작성하시오 (10분까지)

public class PlayLotto {
    private static final int SIZE = 6;
    private static final int MAX = 45;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        //컴퓨터가 생성한 난수를 저장할 배열
        int[] computerNumbers = new int[SIZE];
        
        //사용자가 입력한 숫자를 저장할 배열
        int[] userNumbers = new int[SIZE];
        
        // 컴퓨터 배열에 난수를 저장한다.
        for(int i = 0; i < SIZE; i++) {
            int randomNumber = random.nextInt(MAX) + 1;
            while(ArrayUtil.contains(computerNumbers, randomNumber)) {
                randomNumber = random.nextInt(MAX) + 1;
            }
            computerNumbers[i] = randomNumber;
        }
        
        // 컴퓨터 배열에 입력된 숫자를 정렬한다.
        ArrayUtil.sortByASC(computerNumbers);
        
        // 사용자로부터 숫자를 입력받아서 배열에 차례대로 넣어준다.
        // 단 사용자가 숫자를 입력할 때에는
        // 1. 1~45까지의 숫자
        // 2. 배열에 없는 숫자
        for(int i = 0; i < SIZE; i++) {
            //1. 1~45까지의 숫자
            int number = ScannerUtil.nextInt(scanner, "1~45 사이의 숫자: ", 1, MAX);
            //2. 해당 숫자가 배열에 존재하면 다시 입력하도록 한다.
            while(ArrayUtil.contains(userNumbers, number)) {
                System.out.println("중복된 숫자입니다!");
                number = ScannerUtil.nextInt(scanner, "1~45 사이의 숫자: ", 1, MAX);
            }
            userNumbers[i] = number;
        }
        
        //사용자가 고른 숫자를 정렬해준다.
        ArrayUtil.sortByASC(userNumbers);
        
        //점수계산하기
        //점수를 계산할 때 주의할 점은
        //컴퓨터가 고른 숫자와
        //내가 고른 숫자가 
        //같은게 있더라도
        //같은 인덱스에 있는지는 장담할 수 없다.
        //즉 userNumbers[i] == computerNumbers[i] 
        //마다 점수를 올려서 계산하면
        //부정확한 값을 얻을 가능성이 크다.
        //그렇다면, 우리가 어떻게 해야
        //정확하게 점수를 계산할 수 있을까?
        //ArrayUtil.contains()를 사용하여
        //contains(computerNumbers, userNumbers[i])가 true가 나올때마다
        //점수를 1점씩 올리면 된다.
        //왜냐하면 사용자숫자가 위치는 모르겠지만 컴퓨터 숫자 배열에 존재하므로
        //우리가 몇개가 같은지를 확인할 수 있다!
        
        int score = 0;
        for(int i = 0; i < userNumbers.length; i++) {
            if(ArrayUtil.contains(computerNumbers, userNumbers[i])) {
                score++;
            }
        }
        
        //결과 출력
        //컴퓨터 숫자와 사용자 숫자를 출력해주고
        //score에 따른 결과를 출력해준다.
        System.out.println("====컴퓨터 숫자====");
        ArrayUtil.print("computerNumbers", computerNumbers);
        System.out.println("================");
        System.out.println("====사용자 숫자====");
        ArrayUtil.print("userNumbers", userNumbers);
        System.out.println("================");
        System.out.println("맞춘 갯수: "+score);
        System.out.println("등수: "+(SIZE - score +1)+"등");
        
    }
}


























