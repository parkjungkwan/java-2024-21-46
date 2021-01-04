package array;

import java.util.Scanner;



public class Board01 {
    public static void main(String[] args) {
        showMenu();
    }

    // 1. menu를 출력하는 showMenu()메소드
    private static void showMenu() {
        // 게시글을 관리한 board배열 boardArray
        Board[] boardArray = new Board[0];
        // 입력을 담당한 Scanner 변수
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("게시판 관리프로그램");
            System.out.println("1. 입력 2. 목록 3. 종료");
            int userChoice = ScannerUtil.nextInt(scanner, "> ", 1, 3);
            if (userChoice == 1) {
                // 게시글을 작성하고 배열에 담아서 리턴해주는 메소드를 실행해서
                // 그 결과값으로 boardArray를 덮어씌어준다
                boardArray = add(scanner, boardArray);
            } else if (userChoice == 2) {
                // 목록 보기 후 상세 보기를 들어가 글을 삭제하거나 아니면 글을 수정할 수도 있으니
                // 배열을 리턴해주는 목록보기 메소드를 실행해서
                // 그 결과값으로 boardArray를 덮어씌어준다
                boardArray = selectAll(scanner, boardArray);
            } else if (userChoice == 3) {
                // 사용해주셔서 감사하다고 메시지 출력후 break
                System.out.println("사용해주셔서 감사합니다.");
                break;
            }
        }

        // 스캐너 변수를 닫아준다.
        scanner.close();
    }

    // 파라미터로 받아온 배열에 새로운 글을 작성해서 담고 그걸 그대로 리턴해주는
    // addBoard() 메소드
    private static Board[] add(Scanner scanner, Board[] boardArray) {
        // 게시글 정보를 담을
        // Board 변수를 하나 만들어주자
        Board b = new Board();

        System.out.print("글 번호: ");
        b.setId(scanner.nextInt());

        System.out.print("제목: ");
        b.setTitle(ScannerUtil.nextLine(scanner));

        System.out.print("내용: ");
        b.setContent(ScannerUtil.nextLine(scanner));

        System.out.print("작성자: ");
        b.setWriter(ScannerUtil.nextLine(scanner));

        // ArrayUtil에서 Board 배열에 Board 변수를 추가해주는 메소드를 호출해서
        // 새로운 게시글을 담아주자

        return ArrayUtil.add(boardArray, b);
    }
    
    // 파라미터로 넘어온 Board[]을 간략하게만 쭉 출력해주고
    // 그 후에 사용자로부터 입력을 받아서
    // 추가적인 작업을 결정하는
    // selectAll() 메소드
    private static Board[] selectAll(Scanner scanner, Board[] boardArray) {
        // 만약 boardArray 안에 아무런 글이 없으면 경고 메시지만 출력하고 
        // 끝낸다.
        if(boardArray.length == 0) {
            System.out.println("출력할 내용이 없습니다.");
            return boardArray;
        }
        
        
        // 간략하게 글번호, 제목 정도만 출력을 쭉 해준다.
        for(int i = 0; i < boardArray.length; i++) {
            System.out.printf("%d. %s\n", i+1, boardArray[i].getTitle());
        }
        int userChoice = 
                ScannerUtil.nextInt(scanner, 
                        "글 번호를 선택해주세요(0은 뒤로가기): ", 0, boardArray.length) - 1;
        
        if(userChoice != -1) {
            //글을 개별보기하는 메소드를 호출한다.
            boardArray = selectOne(scanner, boardArray, userChoice);
        }
        
        return boardArray;
    }
    
    // 글을 개별 보기 하고 수정, 삭제 후
    // 변경이 반영된 배열을 다시 호출된 곳으로 보내주는
    // selectOne() 메소드
    private static Board[] selectOne(Scanner scanner, Board[] boardArray, int index) {
        //우리가 코딩할때 좀 간편하게 쓰기 위해서
        //Board변수를 만들어서 보드배열의 index번과 연결시켜준다.
        Board b = boardArray[index];
        System.out.println("------------------");
        System.out.println("제목: "+b.getTitle());
        System.out.println("글번호: "+b.getId());
        System.out.println("작성자: "+b.getWriter());
        System.out.println("==================");
        System.out.println(b.getContent());
        int userChoice = ScannerUtil.nextInt(scanner, "1. 수정 2. 삭제 3. 목록으로", 1, 3);
        if(userChoice == 1) {
            //해당 글을 수정하는 메소드 실행
            updateBoard(scanner, b);
            boardArray = selectOne(scanner, boardArray, index);
        }else if(userChoice == 2) {
            //해당 글을 삭제하는 메소드 실행
            boardArray = deleteBoard(scanner, boardArray, index);
            boardArray = selectAll(scanner, boardArray);
        }else if(userChoice == 3) {
            //목록보여주는 selectAll() 메소드 실행
            boardArray = selectAll(scanner, boardArray);
        }
        
        return boardArray;
    }
    
    // 파라미터로 넘어온 글을 수정하는 메소드
    private static void updateBoard(Scanner scanner, Board b) {
        System.out.print("제목: ");
        b.setTitle(ScannerUtil.nextLine(scanner));
        
        System.out.print("내용: ");
        b.setContent(ScannerUtil.nextLine(scanner));
        
        
    }
    
    //파라미터로 넘어온 Board 배열에서
    //해당 인덱스를 삭제하고 다시 
    //호출된 곳으로 배열을 보내주는
    //deleteBoard()
    private static Board[] deleteBoard(Scanner scanner, Board[] boardArray, int index) { 
        //사용자로부터 정말로 해당 게시글을 삭제할지 확인 받는다.
        System.out.print("해당 글을 정말로 삭제하시겠습니까? y/n");
        String agree = ScannerUtil.nextLine(scanner);
        
        if(agree.equals("y")) {
            boardArray = ArrayUtil.removeByIndex(boardArray, index);
        }
        
        return boardArray;
    }
}
























