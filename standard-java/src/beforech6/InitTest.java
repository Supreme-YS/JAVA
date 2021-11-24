package beforech6;

public class InitTest {
    int x;
    int y = x; // 인스턴스 변수

    void method1() {
        int i;
        //int j = i; // error 발생 , 지역 변수는 반드시 초기화를 해줘야 한다.
    }
}
