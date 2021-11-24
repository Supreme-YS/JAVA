package afterch6;

class MyParent {
    private int prv;   // 같은 클래스
    int dft;           // 같은 패키지
    protected int prt; // 같은 패키지 + 자손(다른 패키지)
    public int pub;    // 접근제한 없음.

    public void printMembers() {
        System.out.println(prv); // ok
        System.out.println(dft); // ok
        System.out.println(prt); // ok
        System.out.println(pub); // ok
    }
}

public class MyParentTest {
    public static void main(String[] args) {
        MyParent p = new MyParent();
//        System.out.println(p.prv); // private 에러 발생, 같은 클래스 내에서만 사용이 가능하기 때문에
        System.out.println(p.dft); // ok
        System.out.println(p.prt); // ok
        System.out.println(p.pub); // ok
    }
}
