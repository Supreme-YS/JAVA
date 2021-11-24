class Data6 { int x; }

public class Parameter3_1 {
    public static void main(String[] args) {
        Data6 d = new Data6();
        System.out.println("main내의 d 주소값 : "+d);
        d.x = 10;

        Data6 d2 = copy(d);
        System.out.println("main내의 d2 주소값 : "+d2);

        System.out.println("d.x = " + d.x);
        System.out.println("d2.x = " + d2.x);
    }

    static Data6 copy(Data6 d) {
        Data6 tmp = new Data6();
        System.out.println("메서드내의 tmp 주소값 ="+ tmp); // tmp 객체 주소값
        System.out.println("메서드내의 d 주소값 = "+ d);
        tmp.x = d.x;
        System.out.println("tmp.x = "+ tmp.x); // 객체 주소의 멤버변수의 값

        return tmp;
    }
}
