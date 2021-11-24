package beforech6;

// String Class는 char[] 와 메서드(기능)을 결합한 것
// String Class는 내용변경이 불가능하다. read only
public class StringClass {
    public static void main(String[] args) {
        // 주요 메서드
        String str = "abcde";
        char ch = str.charAt(3); // index 3의 문자를 가져온다 'd' 출력
        System.out.println(ch);

        String sub = str.substring(1,4); // 범위 추출 1~3까지
        System.out.println(sub);
    }
}
