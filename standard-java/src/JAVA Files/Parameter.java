// 기본형 매개변수
public class Parameter {
    public static void main(String[] args) {
        Data d = new Data(); // 참조변수 d를 생성하여, Data 객체를 생성
        d.x = 10; // 참조변수 d가 가리키는 객체 x의 값이 10이 됨
        System.out.println("main() : x = "+ d.x);

        change(d.x); // change 메서드 호출 -> 메서드 실행 -> 메서드 종료와 동시에 지역변수 소멸 -> main 메서드 재개
        System.out.println("After change(d.x)");
        System.out.println("main() : x = "+ d.x);

    }

    static void change(int x) { // 기본형 매개변수 - 읽기만 가능
        x = 1000;
        System.out.println("change() : x = "+ x);
    }
}

class Data { int x; }