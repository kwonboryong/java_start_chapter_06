package chapter06;

// 접근 제어자
// 1. 속성(데이터)을 숨겨라: 객체 내부의 데이터를 외부에서 함부로 접근하게 두면, 데이터가 안전망을 빠져나가게 된다.
// 객체의 데이터는 메서드를 통해서만 접근하는게 좋다.
// 자동차 엑셀: 우리는 엑셀을 겉에서 밟을 뿐, 나머지는 자동차 내부에서 알아서 가속하게 만드는 것처럼

// 2. 기능(메서드)를 숨겨라: 객체의 기능 중 외부에 필요한 기능 빼고는 다 숨김
// 꼭 필요한 기능만 밖에 보이는게 좋다.
// 자동차 엑셀: 운전자에겐 엑셀 패달, 핸들 정도만 보이는게 좋음 (엔진 조절 기능, 배기 기능들은 운전자가 알 필요없음)

public class BankAccount {

    private int balance; // private

    public BankAccount() { // 잔고 0원 (사실 없어도 됨)
        balance = 0;
    }

    // public 메서드: 입금
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        } else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }
    // public 메서드: 출금
    public void withDraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        } else {
            System.out.println("유효하지 않거나 잔액이 부족합니다.");
        }
    }

    // public 메서드: 잔고 조회
    public int getBalance() {
        return balance;
    }

    // private 메서드 --> public이면 다른 개발자가 해당 메서드를 가져다가 사용해도 된다고 생각함 (이상한 코드가 되어버림)
    private boolean isAmountValid(int amount) { // 정상적인 금액인지 검증하는 메서드 (금액이 0보다 커야함)
        return amount > 0;
    }

}
