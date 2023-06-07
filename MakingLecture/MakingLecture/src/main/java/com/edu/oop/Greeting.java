package com.edu.oop;

/**
 * OOP에 대한 설명
 * 1. OOP란? --> 객체지향프로그래밍 --> 객체란? --> Object(오브젝트)
 */
public class Greeting {

    /***
     * 3. 객체로의 전환을 위한 클래스를 채우자.
     *  - 클래스의 구성요소 : 필드 + 메서드
     */

    // 1. 필드 선언
    public String who; // 누가 = 대상을 저장하는 공간
    public String greet; // 인사문구 = 인사문구를 저장하는 공간
    // Variable(값이 저장되는 공간. 즉 변수)

    // 2. 메서드 선언
    public void sayHello() {
        System.out.println(who + "  " + greet); // 저장된 인사말을 출력하는 기능을 가진 메서드
    }

}
