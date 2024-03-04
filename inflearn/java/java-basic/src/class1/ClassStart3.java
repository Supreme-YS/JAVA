package class1;

/**
 * 학생(Student)이라는 클래스를 메모리에 올리면 객체(인스턴스) 라고 한다.
 * 학생 클래스를 기반으로 학생1, 학생2라는 인스턴스를 생성함.
 */
public class ClassStart3 {

    public static void main(String[] args) {

        Student student1; // 변수선언
        student1 = new Student(); // 메모리에 Student 생성
        student1.name = "학생1";// student1 객체의 name 멤버변수에 "학생1"이라는 값 대입
        student1.age = 15; // 변수에 있는 참조값을 통해 실제 객체에 접근, 해당 객체의 멤버 변수에 값 대입
        student1.grade = 90;

        Student student2 = new Student(); // 객체 생성 및 참조값 할당
        student2.name = "학생2";
        student2.age = 16;
        student2.grade = 80;

        System.out.println("이름: " + student1.name+ " 나이: " + student1.age+ " 성적: " + student1.grade);
        System.out.println("이름: " + student2.name+ " 나이: " + student2.age+ " 성적: " + student2.grade);
    }
}
