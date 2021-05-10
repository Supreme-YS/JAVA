package lec13;

public class ChildClass {

    public String name;
    public String gender;
    public int age;

    public ChildClass() {
        System.out.println("-- ChildClass Constructor --");
    }

    public void getInfo() {
        System.out.println("-- getInfo() START --");
        System.out.println("name :" + name);
        System.out.println("gender :" + gender);
        System.out.println("age :" + age);
    }
}
