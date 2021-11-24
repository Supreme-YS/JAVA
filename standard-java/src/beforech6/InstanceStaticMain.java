package beforech6;

public class InstanceStaticMain {
    public static void main(String[] args) {
        System.out.println("클래스 메서드(static) add 호출 : "+InstanceStatic.add(100L, 200L)); // 클래스 메서드 호출

        InstanceStatic mm = new InstanceStatic(); // 인스턴스 생성
        mm.a = 100L;
        mm.b = 200L;
        System.out.println("인스턴스 메서드 add 호출 : "+mm.add());
    }
}
