package class1;

/**
 * 클래스를 도입하는 이유
 * - 배열로 '반복'을 해결할 수 있지만,
 * - 값을 정확히 매핑해줘야 하는 번거로움과 리스크가 있다.
 * - ClassStart3 / Student 참고
 */
public class ClassStart2 {

    public static void main(String[] args) {

        String[] studentNames = {"학생1", "학생2"};
        int[] studentAges = {15, 16};
        int[] studentGrades = {90, 80};

        for(int i = 0; i < studentNames.length; i++) {
            System.out.println("이름: " + studentNames[i] + " 나이: " + studentAges[i] + " 성적: " + studentGrades[i]);
        }
    }
}
