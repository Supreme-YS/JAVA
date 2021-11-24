public class Constructor {
    public static void main(String[] args) {
        Data_1 d1 = new Data_1();
        Data_2 d2 = new Data_2(); // 기본생성자 호출

        /* 기존에 사용하던 방식
        Car c = new Car();
        c.color = "BLACK";
        c.gearType = "MANUAL";
        c.door = 4; */

        /* 생성자를 통한 코드를 간략히 하기 */
        Car c = new Car("BLACK", "MANUAL", 4);

    }
}

class Data_1 { // 생성자 0개 : 컴파일러가 자동으로 생성자를 추가시켜 줌
    int value;
    public Data_1() { } // 기본 생성자 생성
}

class Data_2 { // 생성자 1개가 있기 때문에 반드시 아래의 기본 생성자를 추가시켜줘야 한다.
    int value;

    public Data_2() {} // 기본 생성자 생성

    Data_2(int x) { // 매개변수가 있는 생성자
        value = x;
    }
}

class Car {
    String color; // 인스턴스 변수
    String gearType;
    int door;

    public Car() {} // 기본 생성자를 사용하는 것을 습관화합시다.
    public Car(String c, String g, int d) { // 매개 변수가 있는 생성자
        color = c;
        gearType = g;
        door = d;
    }
}