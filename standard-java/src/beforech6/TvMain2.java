package beforech6;

public class TvMain2 {
    public static void main(String[] args) {

        Tv t1 = new Tv();
        Tv t2 = new Tv();

        System.out.println("t1의 channel 값 : "+ t1.channel); // 0
        System.out.println("t2의 channel 값 : "+ t2.channel); // 0

        t1.channel = 7 ;
        System.out.println("t1의 채널값 변경");

        System.out.println("t1의 channel 값 : "+ t1.channel); // 7
        System.out.println("t2의 channel 값 : "+ t2.channel); // 0

        t2 = t1;
        System.out.println("t2에 t1 참조변수값 할당");
        System.out.println("t1의 channel 값 : "+ t1.channel); // 7
        System.out.println("t2의 channel 값 : "+ t2.channel); // 7
    }
}
