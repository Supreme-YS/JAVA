package beforech6;

// 참조변수 배열

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

public class TvArray {
    Tv t1, t2, t3; // TV인스턴스 3개 생성
    Tv[] tvArr = new Tv[3]; // 배열의 형태로 3개 생성
    // 반드시 객체를 생성해서 배열의 각 요소에 저장해야 한다.
//    tvArr[0] = new Tv();
//    tvArr[1] = new Tv();
//    tvArr[2] = new Tv();

    Tv[] tvArr2 = { new Tv(), new Tv(), new Tv() };

}
