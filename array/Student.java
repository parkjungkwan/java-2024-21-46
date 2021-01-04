package array;

public class Student {
    private int id;
    private String name;
    private int korean;
    private int english;
    private int math;
    private final int SUBJECT_SIZE = 3;
    
    // 총점을 계산하는 메소드
    public int calculateSum() {
        // 이 메소드에는 파라미터가 존재하지 않는다.
        // 왜냐! 이 메소드를 "실행"하는 객체의
        // 국영수 점수로 총점을 계산하기 때문이다.
        // 해당 객체의 국영수 점수는
        // 필드에 저장되어있으니깐.
        return korean + english + math;
    }
    
    // 평균을 계산하는 메소드
    public double calculateAverage() {
        return calculateSum() / (double)SUBJECT_SIZE;
    }
    
    // Student 클래스 생성자
    public Student() {
        id = -1;
        name = new String();
        korean = -1;
        english = -1;
        math = -1;
    }
    
    //Student 클래스의 파라미터 있는 생성자
    public Student(int id, String name, int korean, int english, int math) {
        //우리가 파라미터로 id, name, korean, english, math를 받겠다는 것은
        //파라미터로 넘어온 값을 우리 필드에 다 넣어주겠다는 의미이다.
        this.id = id;
        this.name = name;
        this.korean = korean;
        this.english = english;
        this.math = math;
    }
    
    //java.lang.Object가 상속한 toString() 오버라이드
    public String toString() {
        return "학생 번호: "+id+
                ", 학생 이름: "+name+
                ", 국어 점수: "+korean+
                ", 영어 점수: "+english+
                ", 수학 점수: "+math;
    }
    
    //java.lang.Object가 상속한 equals() 오버라이드
    public boolean equals(Object o) {
        //먼저 파라미터로 넘어온 o가 
        //이 클래스(Student) 클래스 객체인지 확인해서
        //만약 Student 클래스 객체가 맞다고 하면
        //형변환을 통해서 Student 객체로 바꿔준다
        //그 후 특정 필드들을 비교하여
        //그 필드들의 값들이 같으면 return true 해준다.
        
        //1. o가 Student 클래스 객체인지 확인
        //   이때는 instanceof 라는 키워드를 통해서 간단하게 확인 가능하다.
        //   instanceof는 널이거나 다른 클래스의 객체일 경우 false가 return 된다.
        if(o instanceof Student) {
            //o 가 Student 클래스의 객체이므로
            //이젠 형변환도 가능하다.
            Student s = (Student)o;
            //이 equals() 메소드를 실행하는 객체와
            //o를 형변환한 s의 특정 필드(지금은 id와 name)을 비교해서
            //모두 같으면 return true를 실행한다.
            if(id == s.id && name.equals(s.name)) {
                return true;
            }
        }
        
        return false;
    }
    
    //필드에 대한 getter/setter
    //1. int id
    public void setId(int id) {
        this.id = id;
    }
    
    public int getId() {
        return id;
    }
    //2. String name
    public void setName(String name) {
        this.name = name;
    }
    
    public String getName() {
        return name;
    }
    //3. int korean
    public void setKorean(int korean) {
        this.korean = korean;
    }
    
    public int getKorean() {
        return korean;
    }
    
    //4. int english
    public void setEnglish(int english) {
        this.english = english;
    }
    
    public int getEnglish() {
        return english;
    }
    
    //5. int math
    public void setMath(int math) {
        this.math = math;
    }
    
    public int getMath() {
        return math;
    }
    
    
    public void printInfo() {
        System.out.printf("번호: %d번 이름: %s\n", id, name);
        System.out.printf("국어: %03d점 영어: %03d점 수학: %03d점\n", 
                korean, english, math);
        System.out.printf("총점: %03d점 평균: %.2f점\n", 
                calculateSum(), calculateAverage());
    }
}





















