package beforech6;

public class This {
    long a, b ; // this.a , this.b 진짜 이름 하지만 생략 가능
                // 인스턴스 변수

    This(int a, int b) { // 생성자
        this.a = a; // 똑같은 이름의 지역변수 int a, int b가 선언되어 있기 때문에
        this.b = b; // 생략이 불가능하고 참조변수 this를 통해 인스턴스 변수(this.a, this.b)와 지역변수(a,b)를 구분해 준다.
    }

    long add () { // 인스턴스 메서드
        return a + b; // return this.a + this.b;
                      // 인스턴스 변수
    }

    static long add(long a, long b) { // 클래스 메서드(static 메서드)
        return a + b; // long a, long b와 return문의 a, b는 같은 지역변수이기 때문에 this 사용 불가
        // static 메서드는 객체 생성없이 호출이 가능하기 때문에 iv 사용 불가. 그러므로 this 사용을 못하는 것임.
    }
}
