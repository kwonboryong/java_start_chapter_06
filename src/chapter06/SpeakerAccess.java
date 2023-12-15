package chapter06;

// 최대 음량이 100인 스피커

public class SpeakerAccess {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90); // 음량 초기값 90
        speaker.volumeUp(); // 음량을 10 증가합니다. (100)

        speaker.volumeUp(); // 음량을 증가할 수 없습니다. 최대 음량입니다. (최대 음량이 100이기 때문에)
        speaker.showVolume(); // 현재 음량: 100

        speaker.volumeUp(); // 음량을 증가할 수 없습니다. 최대 음량입니다.
        speaker.showVolume(); // 현재 음량: 100


        // 필드에 직접 접근 후 수정
        // Speaker 객체를 사용하는 사용자는 Speaker의 volume 메서드와 필드에 모두 접근할 수 있다.

        System.out.println("volume 필드 직접 접근 후 수정");
        // speaker.volume = 200; // 100을 넘지 못하도록 메서드에 정의해놨는데 필드에 직접 접근해서 수정해버림 => private 사용으로 접근 막음
        speaker.showVolume();
        
        // volume 필드의 외부 접근을 막을 수 있는 방법 => 해당 메서드의 필드에 접근 제어자 private 사용
    }
}
