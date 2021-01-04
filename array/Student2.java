package array;



public class Student2 {
    public static void main(String[] args) {
        // 객체 선언은 다음과 같이 한다
        // 클래스이름 객체이름 = new 클래스이름();
        Student s = new Student();
        System.out.println("s.name(참조형): "+s.getName());
        System.out.println("s.id(기본형): "+s.getId());
        
        s = new Student(1, "ㄱㄱㄱ", 100, 100, 100);
        System.out.println("s.name(참조형): "+s.getName());
        System.out.println("s.id(기본형): "+s.getId());
        
        
        // 객체 안의 필드나 메소드를 접근할 때에는
        // 접근연산자 . 을 이용해서 접근하면 된다.
        // 객체이름.필드 혹은 객체이름.메소드
        
        s.setId(1);
        s.setName("조재영");
        s.setKorean(89);
        s.setEnglish(89);
        s.setMath(88);
        
        System.out.println("s.calculateSum(): "+s.calculateSum());
        
        Student s2 = new Student();
        s2.setId(2);
        s2.setName("김철수");
        s2.setKorean(70);
        s2.setEnglish(70);
        s2.setMath(69);
       
        System.out.println("s2.calculateSum(): "+s2.calculateSum());
        
        Student s3 = null;
        s3 = new Student();
        System.out.println("s3.calculateSum(): "+s3.calculateSum());
        
        //System.out.println()에 객체를 집어넣음 어떤게 나올까?
        //System.out.println()에 객체를 집어넣으면
        //System.out.println()은 해당 객체의 toString()이란 메소드를
        //실행시켜서 그 결과값을 출력한다.
        System.out.println(s);
        System.out.println(s2);
        System.out.println(s3);
        
        // 객체의 비교
        String str1 = "abc";
        String str2 = new String("abc");
        System.out.println(str1.equals(str2));
        
        s = new Student(1, "a", 1, 1, 1);
        s2 = new Student(1, "a", 1, 1, 1);
        s3 = new Student(2, "b", 2, 2, 2);
        
        System.out.println("s: "+s);
        System.out.println("s2: "+s2);
        System.out.println("s3: "+s3);
        
        System.out.println("s.equals(s2): "+s.equals(s2));
        System.out.println("s.equals(s3): "+s.equals(s3));
        System.out.println("s2.equals(s3): "+s2.equals(s3));
        
    }
}





















