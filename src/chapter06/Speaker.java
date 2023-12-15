package chapter06;

// 접근 제어자: 필드, 메서드, 생성자에 사용 (지역 변수에는 사용 불가능!!)
// 1. private: 모든 외부 호출 제한 (클래스 안에서만)
// 2. default(pakage-private): (아무것도 사용 안하는) 기본 상태, 같은 패키지 안에서만 호출 허용 (패키지 안에서만)
// 3. protected: 같은 패키지 안에서만 호출 허용, 패키지가 달라도 상속 관계의 호출은 허용 (패키지 안에서만 + 상속 관계는 ㄱㅊ)
// 4. public: 모든 외부 호출 허용 (공개)

public class Speaker { // 클래스

    private int volume; // 필드
    // private를 추가하면 해당 클래스 안에서만 접근 가능! (다른 곳에서 직접 접근)

    Speaker(int volume) { // 생성자, 초기 음량 설정
        this.volume = volume;
    }

    void volumeUp() { // 메서드
        if (volume >= 100) { // 최대 음량 100
            System.out.println("음량을 증가할 수 없습니다. 최대 음량입니다.");
        } else {
            volume += 10; // 음량이 10씩 증가
            System.out.println("음량을 10 증가합니다.");
        }
    }

    void volumeDown() {
        volume -= 10;
        System.out.println("volumeDown 호출");
    }

    void showVolume() {
        System.out.println("현재 음량: " + volume);
    }
}