package beforech6;

public class InstanceStatic {
    long a, b; // 인스턴스 변수, 클래스 내에서 전체 활용 가능

    long add() { // 인스턴스 메서드, IV를 사용
        return a + b; // 인스턴스 변수 a, b
    }

    static long add(long a, long b) { // 클래스 메서드(static 메서드), IV를 사용 X, 객체 생성없이 호출가능한 메서드
        return a + b; // 지역변수 a, b
    }
}

// 그럼 메서드에 static을 붙일지 말지 어떻게 결정하는가? -> IV(인스턴스 변수)를 사용할 때 static을 붙인다.
// 인스턴스 메서드는 매개변수가 없기 때문에 IV값을 쓰는 것 -> 객체가 필요하다는 것 -> IV의 묶음은 객체다.
// 클래스 메서드는 매개변수(지역변수)로 해결하고 있기 때문에 IV값이 필요가 없는 것

// static 붙이는 조건
// 1. 속성(멤버 변수) 중에서 공통 속성에 static을 붙인다.
// 2. IV, IM(인스턴스메서드)를 사용하지 않는 메서드에 static을 붙인다.