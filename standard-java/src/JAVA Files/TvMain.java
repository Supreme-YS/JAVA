public class TvMain {
    public static void main(String[] args) {
        Tv t;               // Tv인스턴스를 참조하기 위한 참조변수 t 생성
        t = new Tv();       // Tv인스턴스(객체) 생성
        t.channel = 7;      // Tv의 멤버변수 channel의 값을 7로 할당
        t.channelDown();    // Tv인스턴스의 메서드 channelDown을 호출
        System.out.println("현재 채널은 "+ t.channel + "입니다.");
    }
}

class Tv {
    // Tv의 속성
    String color;  // 색깔
    boolean power; // 전원상태
    int channel;   // 채널

    // Tv의 메서드
    void power()       { power = !power; }
    void channelUp()   { channel++; }
    void channelDown() { channel--; }
}
// 3개의 변수 + 3개의 메서드 = 6개의 멤버


