package board;
/*
<< RFP >>
"게시판 관리 프로그램"
String message = "1. 새글 작성 2. 글 목록 보기 3. 처음 화면으로";
" 1. 새글 쓰기 2. 목록 보기 3. 종료 \n > "
"제목: " "작성자: " "내용"
"사용해주셔서 감사합니다."
"아직 입력된 게시글이 없습니다."
"상세보기할 글을 선택해주세요 (0은 뒤로가기)\n>"
SimpleDateFormat sdf = new SimpleDateFormat("yy년 M월 d일 H시m분s초");
        System.out.println("제목: " + b.getTitle());
        System.out.println("글번호: " + b.getId());
        System.out.println("작성자: " + b.getWriter());
        System.out.println("작성일: " + sdf.format(b.getWrittenDate().getTime()));
        System.out.println("수정일: " + sdf.format(b.getUpdatedDate().getTime()));
        System.out.println("----------------------");
        System.out.println(b.getContent());

        String message = "1. 수정 2. 삭제 3. 뒤로가기 \n>";
        "정말로 삭제하시겠습니까? y/n"
        "댓글 내용: "
"비트 성적관리 프로그램"
"1. 입력 2. 목록 3. 종료\n>"
"사용해 주셔서 감사합니다."
번호, 이름, 국어, 영어, 수학
"상세보기할 학생의 번호를 입력해주세요(0은 뒤로가기)\n>
 System.out.printf("번호: %d번 이름: %s\n", s.getId(), s.getName());
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n",
                s.getKorean(), s.getEnglish(), s.getMath());
        System.out.printf("총점: %03d점 평균: %.2f점\n",
User
    "1. 로그인 2. 회원가입 3. 종료"
    "님 환영합니다."
    "username (종료를 원하시면 x를 입력하세요): "
    "중복된 username입니다. 다시 입력해주세요"
*/
import java.util.Scanner;

import board.controllers.ArticleController;
import board.controllers.MemberController;
import board.domains.GradeDto;
import board.domains.TeacherDto;
import board.domains.StudentDto;
import board.domains.ArticleDto;
import java.util.Random;
public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System. in);
        ArticleController articleController = new ArticleController();
        MemberController memberController = new MemberController();
        GradeDto grade = null;
        TeacherDto teacher = null;
        StudentDto student = null;
        ArticleDto article = null;
        String title = "비트 성적관리 프로그램\n";
        String navi = "[학생 UI]\n01. 학생등록, 02. 아이디중복체크, 03. 학생로그인, 04. 학생정보수정, 05. 학생정보삭제 \n[강사 UI]\n1" +
                "1. 강사등록, 12. 강사접속, 13. 학생목록보기, 14. 학생상세정보, 15. 성적합계, 16.성적평균\n[게시판 UI]\n21. 새글" +
                " 작성 22. 글 목록 23. 글 상세 24. 글 수정 25.글 삭제\n26. 댓글 쓰기 27. 댓글 보기 \n0. 종료 \n > ";

        while (true) {
            System.out.println(title + navi);
            switch (scanner.next()) {
                case "01":
                    System.out.println("Number, PW, ID, NickName");
                    memberController.postStudent(
                        new StudentDto(new Random().nextInt(100) + 1, scanner.next(), scanner.next(), scanner.next())
                    );
                    break;
                case "02":
                    System.out.println("가입하려는 아이디");
                    boolean ok = memberController.getExistId(scanner.next());
                    System.out.println(
                            ok
                                ? "사용 가능"
                                : "사용 불가능"
                        );
                    break;
                case "03":

                    break;
                case "04":
                    break;
                case "05":
                    break;
                case "11":
                    break;
                case "12":
                    break;
                case "13":
                    break;
                case "14":
                    break;
                case "15":
                    break;
                case "16":
                    break;
                case "21":
                    System.out.println("글쓴이 아이디,제목,내용");
                    articleController.postArticle( new ArticleDto(
                        scanner.nextInt(),
                        scanner.next(),
                        scanner.next()
                    ));
                    break;
                case "22":
                    break;
                case "23":
                    break;
                case "24":
                    break;
                case "25":
                    break;
                case "26":
                    break;
                case "27":
                    break;
                case "0":
                    System
                        .out
                        .println("종료");
                    return;
            }
        }

    }
}
