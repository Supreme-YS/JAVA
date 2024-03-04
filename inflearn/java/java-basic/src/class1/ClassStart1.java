package class1;

/**
 * 클래스를 도입하는 이유
 * - 학생의 수가 늘어난다면?
 * - 일일이 변수를 추가해줘야 하는 문제가 발생한다.
 */
public class ClassStart1 {

    public static void main(String[] args) {
        String student1Name = "학생1";
        int student1Age = 15;
        int student1Grade = 90;

        String student2Name = "학생2";
        int student2Age = 16;
        int student2Grade = 80;

        System.out.println("이름: " + student1Name + " 나이: " + student1Age + " 성적: " + student1Grade);
        System.out.println("이름: " + student2Name + " 나이: " + student2Age + " 성적: " + student2Grade);
    }
}
