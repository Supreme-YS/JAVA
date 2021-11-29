package ch3;

public class Ex3_4 {
    public static void main(String[] args) {
        int i = -10;
        i = +i; // 의미 없음
        System.out.println("i = " + i);
        
        i = -10;
        i = -i;

        System.out.println("i = " + i);
    }
}
