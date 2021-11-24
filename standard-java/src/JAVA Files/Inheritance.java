class ITv {
    boolean power;
    int channel;

    void power() { power = !power;}
    void channelUp() { ++channel;};
    void channelDown() { --channel;}
}

class CaptionTv extends ITv { // CaptionTv는 Tv에 캡션-자막을 보여주는 기능을 추가
    boolean caption;
    void displayCaption(String text) {
        if (caption) { // 캡션이 true일때만 text를 보여 준다.
            System.out.println(text);
        }
    }
}

public class Inheritance {
    public static void main(String[] args) {
        CaptionTv ctv = new CaptionTv();
        ctv.channel = 10;
        ctv.channelUp();
        System.out.println(ctv.channel);
        ctv.displayCaption("Hello, World");
        ctv.caption = true; // 캡션을 킨다.
        ctv.displayCaption("Hello World");
    }
}
