public class CvIv {
    public static void main(String args[]) {
        System.out.println("클래스 변수 입니다. 객체 생성없이 사용이 가능합니다.");
        System.out.println("Card.width = " + Card.width); // 클래스 변수는 객체 생성없이 사용이 가능하다.
        System.out.println("Card.height = " + Card.height);
        System.out.println("------------------------");

        System.out.println("인스턴스 변수 입니다. 객체를 반드시 생성해서 클래스의 멤버에 접근이 가능합니다.");
        Card c1 = new Card();
        c1.kind = "Heart";
        c1.number = 7;

        Card c2 = new Card();
        c2.kind = "Spade";
        c2.number = 4;

        System.out.println("------------------------");
        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
        System.out.println("c1의 width와 height를 각각 50, 80으로 변경합니다.");
        c1.width = 50;
        c1.height = 80;

        System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
        System.out.println("c2는 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
        System.out.println("c2의 width와 height를 변경한 적 없지만 공통적으로 변경되어 있는 것을 알 수 있습니다.");
    }
}

class Card {
    String kind;             // 인스턴스 변수
    int number;              // 인스턴스 변수
    static int width = 100;  // 클래스 변수
    static int height = 250; // 클래스 변수
}
