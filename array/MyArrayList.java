package array;

import java.util.ArrayList;

// ArrayList
// 어레이리스트란
// 동적할당 개념이 적용된 배열을
// 클래스화 시킨 것으로써
// 우리가 클래스를 만들고
// 어레이리스트를 이용하면
// 별도의 동적할당 메소드 구현 없이도
// 동적할당을 사용할수 있다!
public class MyArrayList {
    public static void main(String[] args) {
        //ArrayList는 처음 선언할때
        //우리가 무엇의 모음인지를 지정해야한다.
        //지정할때는 <>에 우리가 무슨 클래스의 모음이다! 를 지정해야하고
        //<>에는 클래스만 들어갈 수 있다!
        //그렇다면... 기본형 데이터타입은 ArrayList로 관리할 수 없는가?
        //없다!
        //왜냐하면 어레이리스트는 주소값을 이용하여 요소를 관리하기 때문에
        //주소값이 없는 기본형 데이터타입을 관리할 수 없다.
        //그래서 java는 이 기본형 데이터타입들을 클래스로 "포장"한
        //포장 클래스(wrapper class)가 존재한다.
        //int->Integer, double -> Double 등등
        //만약 기본형 데이터타입을 이용해서 동적할당을 해야한다면
        //요러한 wrapper클래스를 어레이리스트의 모음으로 지정하면 된다!
        
        //1. ArrayList 선언
        ArrayList<Member> memberList = new ArrayList<>();
        
        //memberList가 다룰 객체를 여러개 만들어주자
        Member m1 = new Member(1, "userName1", "password1", "nickName1");
        Member m2 = new Member(2, "userName2", "password2", "nickName2");
        Member m3 = new Member(3, "userName3", "password3", "nickName3");
        Member m4 = new Member(4, "userName4", "password4", "nickName4");
        Member m5 = new Member(5, "userName5", "password5", "nickName5");
        Member m6 = new Member(6, "userName6", "password6", "nickName6");
        Member m7 = new Member(7, "userName7", "password7", "nickName7");
        Member m8 = new Member(8, "userName8", "password8", "nickName8");
        
        //2. ArrayList 메소드 보기
        //   A. 해당 리스트가 몇개의 요소가 있는지 확인할 때에는 size()
        System.out.println("---2.A---");
        System.out.println("memberList.size(): "+memberList.size());
        
        //   B. 해당 리스트에 요소를 추가할 때에는 add(요소)
        System.out.println("---2.B---");
        memberList.add(m1);
        System.out.println("memberList.size(): "+memberList.size());
        memberList.add(m2);
        System.out.println("memberList.size(): "+memberList.size());
        memberList.add(m3);
        System.out.println("memberList.size(): "+memberList.size());
        memberList.add(m4);
        System.out.println("memberList.size(): "+memberList.size());
        memberList.add(m5);
        System.out.println("memberList.size(): "+memberList.size());
        memberList.add(m6);
        System.out.println("memberList.size(): "+memberList.size());
        memberList.add(m7);
        System.out.println("memberList.size(): "+memberList.size());
        
        //   C. 리스트에서 해당 인덱스에 있는 객체를 호출할 때에는
        //      get(index)
        //      get(index)의 return 타입은 당연히 리스트가 모여있는 클래스이다!
        //      배열로 따지면 array[index] 와 같은 역할이다.
        
        System.out.println("---2.C---");
        System.out.println("memberList.get(0): "+memberList.get(0));
        System.out.println("memberList.get(2): "+memberList.get(2));
        
        //   D. 만약 리스트에서 특정 index의 요소를 삭제하고 싶다면
        //      remove(index)
        System.out.println("---2.D---");
        System.out.println("memberList.get(0): "+memberList.get(0));
        memberList.remove(0);
        System.out.println("memberList.get(0): "+memberList.get(0));
        
        //   E. 만약 리스트의 전체내용을 비워주고 싶으면
        //      clear()
        System.out.println("---2.E---");
        System.out.println("memberList.size(): "+memberList.size());
        memberList.clear();
        System.out.println("memberList.size(): "+memberList.size());
        
        memberList.add(m1);
        memberList.add(m2);
        memberList.add(m3);
        memberList.add(m4);
        memberList.add(m5);
        memberList.add(m6);
        memberList.add(m7);
        
        
        // 여기서부터는 요소의 클래스에 equals() 메소드가 정확하게 구현되어있어야
        // 정상적으로 실행되는 메소드들이다.
        
        Member m77 = new Member(7, "userName7", "password7", "nickName7");
        
        // 1. 해당 리스트에 특정 객체가 존재하는지 알고 싶다면
        //    contains() 메소드
        //    단, 동일한 객체가 아니더라도 equals()가 true가 나오는 객체가
        //    존재한다면, true가 나온다.
        System.out.println("---1. contains()---");
        System.out.println("memberList.contains(m1): "+memberList.contains(m1));
        System.out.println("memberList.contains(m8): "+memberList.contains(m8));
        System.out.println("memberList.contains(m77): "+memberList.contains(m77));
        // 위 코드에서 m77은 리스트에 추가된적 없지만
        // 리스트에 추가되어있는 m7과 equals()가 true가 나오기 때문에
        // 해당 리스트에 포함되어있는걸로 간주되게 된다.
        
        // 2. 해당 리스트에 특정 객체의 가장 먼저 나오는 index가 알고 싶다면
        //    indexOf() 메소드
        //    단 해당 객체가 리스트에 존재하지 않으면 -1이 리턴된다.
        //    또한 동일한 객체가 아니더라도 equals()가 true가 나오는 객체가 
        //    있다면, 그 객체의 index가 리턴된다.
        System.out.println("---2. indexOf()---");
        System.out.println("memberList.indexOf(m1): "+memberList.indexOf(m1));
        System.out.println("memberList.indexOf(m8): "+memberList.indexOf(m8));
        System.out.println("memberList.indexOf(m77): "+memberList.indexOf(m77));
        
        // 3. 해당 리스트에서 특정 객체가 가장 마지막에 나오는
        //    index가 궁금하다면 lastIndexOf() 메소드
        memberList.add(m1);
        System.out.println("---3. lastIndexOf---");
        System.out.println("memberList.lastIndexOf(m1): "+memberList.lastIndexOf(m1)); 
        
        // 4. 해당 리스트에서 특정 객체를 삭제할때
        //    index가 아닌, 해당 객체 혹은 그 객체와 equals()가 true가 나오는 객체를
        //    사용하여 제거 가능하다.
        //    이때도 remove()이다.
        //    단 파라미터와 equals()가 true가 나오는 객체가 여러개가 추가되어있을 경우, 
        //    가장 앞에 나오는 1개만 제거 된다.
        //    만약에 해당 리스트에 존재하지 않는(즉 equals()가 true가 나오는 객체가 하나도 없을 경우)
        //    객체를 파라미터로 넘기면, 실행은 되지만 실제로 제거되는 요소는 없다.
        
        System.out.println("---4. remove()---");
        System.out.println("memberList.contains(m7): "+memberList.contains(m7));
        memberList.remove(m77);
        System.out.println("memberList.contains(m7): "+memberList.contains(m7));
    }
}































