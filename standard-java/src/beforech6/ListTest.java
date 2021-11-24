package beforech6;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(); // List 객체를 생성하여 list 참조변수에 할당

        for(int i=0;i<5;i++){
            list.add(i);
        }
        System.out.println(list); // [0, 1, 2, 3, 4] 출력

        for(int num : list){
            // 1부터 5를 list에 하나씩 가져와 출력
            System.out.print(num);
            System.out.print(" "); // 0 1 2 3 4 출력
        }
    }
}
