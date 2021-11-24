package afterch6;

public class Ex7_3 {
    public static void main(String[] args) {
        Child2 ch2 = new Child2();
        ch2.method();
    }
}

class Parent2 {
    int x = 10; /* super.x 와 this.x 둘 다 가능 */
}

class Child2 extends Parent2 {
    void method() {
        System.out.println("x="+x);
        System.out.println("this.x="+this.x);
        System.out.println("super.x="+super.x);
    }
}
