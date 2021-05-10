package lec13;

public class MainClass {

    public static void main(String[] args) {
        ChildClass child1 = new ChildClass();
        child1.name = "홍길동";
        child1.gender = "M";
        child1.age =  20;
        child1.getInfo();
    }
}
