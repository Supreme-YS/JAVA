class Data4 { int x; }

public class Parameter2_1 {
    public static void main(String[] args) {
        Data4 d;
        d = new Data4();
        d.x = 10;
        System.out.println("d.x = "+d.x);

        change(d);
        System.out.println("After d.x = "+d.x);
    }

    static void change(Data4 d) {
        d.x = 1000;
        System.out.println("d.x = "+d.x);
    }
}
