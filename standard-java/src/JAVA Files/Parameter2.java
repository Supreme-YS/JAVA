// 참조형 매개변수
public class Parameter2 {
    public static void main(String[] args) {
        Data2 d = new Data2(); // d라는 참조변수에 Data2 객체 생성
        d.x = 10;
        System.out.println("main() : x = "+d.x);

        change(d); // 참조변수 d는 주소값을 갖고 있으니까 주소값 자체를 change메서드에 복시
                    // 객체 자체를 넘겨줬다.? 리모컨을 넘김. 객체를 다룰 수 있는
        System.out.println("After change(d)");
        System.out.println("main() : x = "+d.x);
    }

    static void change(Data2 d) { // 참조형 매개변수
        d.x = 1000;
        System.out.println("change() : x = "+ d.x);
    }
}

class Data2 { int x; }