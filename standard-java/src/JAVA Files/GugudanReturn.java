public class GugudanReturn {
    public static void main(String[] args) {
        Gugudan gugudan = new Gugudan();
        gugudan.printGugudan(3); // 구구단 3단을 출력
    }
}

class Gugudan {
    void printGugudan(int dan){
        if (!(2 <= dan && dan <=9)) { // 2와 9사이가 아니면 참이기 때문에 2~9사이의 값이 입력되지 않으면 메서드 종료
            return; // 입력받은 단이 2~9가 아니면 메서드 종료하고 돌아가기
        }

        for(int i=1; i <= 9; i++){
            System.out.printf("%d * %d = %d%n", dan, i, dan * i);
        }
        return; // 반환형이 void이기 때문에 return문 생략가능함. 컴파일러가 자동으로 생성해준다.
    }
}