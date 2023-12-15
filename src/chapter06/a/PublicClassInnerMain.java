package chapter06.a;

public class PublicClassInnerMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass(); // class 접근 제어자
        DefaultClass1 defaultClass1 = new DefaultClass1(); // default 접근 제어자 (같은 패키지 안이라 사용 가능)
        DefaultClass2 defaultClass2 = new DefaultClass2();
    }
}
