package util;
// String 클래스
// String 클래스는 여러개의 문자가 담긴
// char[] 을 다루는 클래스로서 
// 문자와 관련된 다양한 메소드들이 준비되어있다.
public class MyString {
    public static void main(String[] args) {
        // String을 초기화 하는 3가지 방법
        // 1. 기본 생성자 호출
        //    아무런 문자도 안담겨있는 String 객체가 준비됨
        String str = new String();
        System.out.println("str의 현재값: "+str);
        
        // 2. 파라미터가 있는 생성자 호출
        //    파라미터로 들어간 값이 담긴 String 객체가 준비됨
        str = new String("abcDEFghi");
        System.out.println("str의 현재값: "+str);
        
        // 3. String의 임시 객체를 만들고
        //    그 주소값을 할당
        str = "가나다라abc마바사아";
        System.out.println("str의 현재값: "+str);
        
        // 1. 문자열의 특정 위치에 존재하는
        //    char가 알고 싶을때는 charAt
        //    String에서 위치를 셀때는
        //    0부터 센다!
        System.out.println("str.charAt(4): "+str.charAt(4));
        
        // 2. 2개의 문자열을 이어서
        //    하나의 커다란 문자열로 만들때는
        //    concat()을 사용한다.
        //    자바에서는 String의 경우
        //    + 연산자는 concat()을 실행하도록
        //    미리 구현되어있다.
        System.out.println("str.concat(\"def\"): "+str.concat("def"));
        
        // 3. 특정 문자열이 해당 문자열에 존재하는지를 확인할 때에는
        //    contains() 메소드를 실행하면 된다.
        System.out.println("str.contains(\"가나\"): "+str.contains("가나"));
        System.out.println("str.contains(\"1234\"): "+str.contains("1234"));
        
        // 4. 만약 String이 특정 문자열로 끝나는지 확인할 때에는
        //    endsWith() 메소드를 실행하면 된다.
        System.out.println("str.endsWith(\"아\"): "+str.endsWith("아"));
        System.out.println("str.endsWith(\"가\"): "+str.endsWith("가"));
        
        // 5. 해당 String에서 특정 문자 등의 위치가 궁금할 때에는
        //    indexOf() 메소드를 실행하면 된다.
        //    만약 해당 문자열에 파라미터가 존재하지 않으면 -1이 리턴된다.
        //    또한 부분일치는 적용되지 않는다.
        System.out.println("str.indexOf(\"다라\"): "+str.indexOf("다라"));
        System.out.println("str.indexOf(\"123\"): "+str.indexOf("123"));
        
        // 6. 만약 String이 공백으로만 이루어졌는지 확인할 때에는
        //    isBlank()를 실행하면 된다.
        str = "    ";
        System.out.println("str.isBlank(): "+str.isBlank());
        str = "abc";
        System.out.println("str.isBlank(): "+str.isBlank());
        
        // 7. 만약 String이 빈 문자열, 즉 아무런 문자도 없는지 확인할 때에는
        //    isEmpty()를 실행하면 된다.
        str = new String();
        System.out.println("str.isEmpty(): "+str.isEmpty());
        str = "    ";
        System.out.println("str.isEmpty(): "+str.isEmpty());
        str = "abc";
        System.out.println("str.isEmpty(): "+str.isEmpty());
        
        // 8. 만약 문자열에서 파라미터가 가장 마지막으로 나온 위치가 알고 싶을 때에는
        //    lastIndexOf()를 실행하면 된다.
        //    만약 파라미터가 등장하지 않으면 -1 이 리턴된다.
        str = "www.daum.net/news/sports/12345";
        System.out.println("str.lastIndexOf(\"/\"): "+str.lastIndexOf("/"));
        System.out.println("str.lastIndexOf(\"0\"): "+str.lastIndexOf("0"));
        
        // 9. 해당 문자열의 길이가 알고 싶을 때에는
        //    length()를 실행하면 된다.
        str = "123456789";
        System.out.println("str.length(): "+str.length());
        
        // 10. 해당 문자열이 특정 정규표현식의 따라서 
        //     패턴이 맞는지를 체크할 때에는 matches()를 실행하면 된다.
        //     정규표현식이란? = 숙제
        String pattern = "\\d*"; // \\d*은 모든 문자가 숫자로 이루어져있는지를 확인함
        System.out.println("str.matches(pattern): "+str.matches(pattern));
        pattern = "\\w*"; // \\w*은 모든 문자가 알파벳과 숫자로 이루어져있는지를 확인함
        System.out.println("str.matches(pattern): "+str.matches(pattern));
        pattern = "\\d{3}"; //d{3}은 문자열이 숫자 3자리로 이루어져있는지를 확인함
        System.out.println("str.matches(pattern): "+str.matches(pattern));
        pattern = "[가-힣]*"; //[가-힣]은 문자열이 가~힣까지의 글자로 이루어져있는지를 확인함
        System.out.println("str.matches(pattern): "+str.matches(pattern));
        
        // 11. 해당 문자열이 특정 문자열로 시작하는지 확인할때에는
        //     startsWith()로 확인한다.
        System.out.println("str.startsWith(\"1234\"): "+str.startsWith("1234"));
        System.out.println("str.startsWith(\"abcd\"): "+str.startsWith("abcd"));
        
        // 12. 문자열을 쪼갤때에는 subString()을 사용한다.
        //     ***주의*** 쪼갠다고 해서 원본이 바뀌지는 않음
        
        // 파라미터가 int 1개이면 해당 인덱스부터 문자열이 끝날때까지를 분리함
        System.out.println("str.substring(3): "+str.substring(3));
        // 파라미터가 int 2개이면 앞에 숫자 인덱스~뒤의 숫자 인덱스 전까지 분리함
        // 즉 a, b 가 파라미터로 오게 되면
        // a index 부터 b-1 index가 분리됨
        System.out.println("str.substring(3, 6): "+str.substring(3, 6));
        
        // 13. 문자열의 모든 글자를 소문자로 변환할 때에는 toLowerCase()를 사용한다.
        //      ***주의*** 원본이 바뀌지는 않음
        str = "abcDEFghi";
        System.out.println("str.toLowerCase(): "+str.toLowerCase());
        
        // 14. 문자열의 모든 글자를 대문자로 변환할 때에는 toUpperCase()를 사용한다.
        //      ***주의*** 원본이 바뀌지는 않음
        System.out.println("str.toUpperCase(): "+str.toUpperCase());
        
        // 15. 문자열의 앞뒤 공백을 제거할 때에는 trim()을 사용한다.
        //      ***주의*** 원본이 바뀌지는 않음
        str = "     1     \n";
        System.out.println("trim() 전 str: "+str);
        System.out.println("trim() 후 str: "+str.trim());
        
        System.out.println("---------");
    }
}












