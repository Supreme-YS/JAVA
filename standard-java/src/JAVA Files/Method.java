public class Method {
    public static void main(String[] args) {
        Operations op = new Operations();
        int addResult = op.add(1, 2);
        System.out.println(addResult);

        int multiResult = op.multiply(1, 2);
        System.out.println(multiResult);

        op.divide(3, 2);

        int maxResult = op.max(1, 5);
        int minResult = op.min(10, 2);

        System.out.println(maxResult);
        System.out.println(minResult);

    }
}

class Operations {
    int add(int a, int b) {
        int result = a + b;
        return result;
    }

    int multiply(int a, int b) { return a * b; }

    void divide(int a, int b) {
        System.out.println(a/b);
    }

    // 두개의 수 중에서 큰 값 출력
    int max(int a, int b) {
        if (a > b){
            return a;
        } else {
            return b;
        }
    }

    int min(int a, int b) {
        if (a < b){
            return a;
        } else {
            return b;
        }
    }
}