package chapter06.b;

import chapter06.a.PublicClass;

public class PublicClassOuterMain {
    public static void main(String[] args) {
        PublicClass publicClass = new PublicClass();

        // 다른 패키지 접근 불가
        // DefaultClass1 class1 = new DefaultClass1(); // (chapter06.a) 패키지 소속이라 다른 패키지에서 접근 불가능
        // DefaultClass2 class2 = new DefaultClass2();


        // 캡슐화: 속성(데이터) + 기능(메서드)를 하나로 묶어서 내부에 감춤
        // 캡슐화를 통해 데이터의 직접적인 변경을 제한할 수 있다.
        // 접근 제어자가 캡슐화를 더 안전하게 해줌
    }
}
