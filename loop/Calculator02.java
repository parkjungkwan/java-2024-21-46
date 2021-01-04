package loop;
//int에 이어서 double 도 지원하는 계산기를 만들어보자
public class Calculator02 {
    //add() 구현
    static int add(int a, int b) {
        return a+b;
    }
    static double add(double a, double b) {
        return a+b;
    }
    //subtract() 구현
    static int subtract(int a, int b) {
        return a-b;
    }
    static double subtract(double a, double b) {
        return a-b;
    }
    
    //multiply() 구현
    static int multiply(int a, int b) {
        return a*b;
    }
    
    static double multiply(double a, double b) {
        return a*b;
    }
    
    //divide() 구현
    static double divide(int a, int b) {
        return (double)a/b;
    }
    
    static double divide(double a, double b) {
        return a/b;
    }
}













