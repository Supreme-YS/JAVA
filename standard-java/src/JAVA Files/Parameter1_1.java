class Data5 { int x; }

public class Parameter1_1 {
    public static void main(String[] args) {
        Data5 d = new Data5();
        d.x = 10;
        System.out.println("d.x = "+d.x);

        value(d.x);
        System.out.println("After d.x = "+d.x);
    }

    static void value(int x) {
        x = 100;
        System.out.println("x = "+100);
    }
}
