package beforech6;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* Collection 인터페이스를 기반으로 구현한 클래스에는 List와 Set이 있다.
List 클래스는 선형 자료구조를 구현한 클래스, Set은 비선형 자료를 구현한 클래스이다.
Set 클래스 안에 HashSet, TreeSet, LinkedHashSet이 있는데 HashSet이 가장 성능이 좋다.*/

public class IteratorTest {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>(); // Set 클래스내에 성능이 좋은 HashSet으로 set 참조변수에 객체 생성
        set.add("데이터1"); // add 메서드를 활용한 데이터 추가
        set.add("데이터2");
        set.add("데이터3");

        Iterator<String> iter = set.iterator();
        while(iter.hasNext()) { // 객체내에 요소가 없다면 False 반환
            System.out.print(iter.next()); // 요소 출력 이후 다음 요소 반환
            System.out.print(" "); // 출력값 : 데이터3, 데이터2, 데이터1
            iter.remove(); // 요소 삭제
        }
    }
}
