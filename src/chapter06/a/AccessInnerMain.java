package chapter06.a;

public class AccessInnerMain {
    public static void main(String[] args) {
        AccessData data = new AccessData();

        // public 호출 가능
        data.publicField = 1;
        data.publicMethod();

        // default 호출 가능 (같은 패키지)
        data.defaultField = 2;
        data.defaultMethod();

        // private 호출 불가능
        // data.pricvateField = 3;

        data.innerAccess(); // 외부에서 innerAccess 호출 가능 (public)
    }
}
