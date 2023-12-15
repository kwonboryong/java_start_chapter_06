package chapter06.a;

// 클래스 접근 제어자: public, default만 사용 가능 (public class...)
// 하나의 자바 파일에 public클래스는 하나만 등장 가능 (클래스 안에 클래스 여러개 만들 수 있음, 다만 public은 단 하나만 가능!)
// default를 사용하는 클래스는 무한정도 가능
// 클래스 이름은 클래스 파일 이름과 같아야 한다.

import javax.xml.crypto.Data;

public class PublicClass { // public 클래스 (public 접근 제어자)
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();
        DefaultClass1 class1 = new DefaultClass1();
        DefaultClass2 class2 = new DefaultClass2();

    }

}

class DefaultClass1 { // default 클래스 (default 접근 제어자)

}

class DefaultClass2 { // default 클래스

}